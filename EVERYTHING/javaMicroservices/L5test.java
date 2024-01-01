//lecture 5 -->  on datatypes part 2

public class L5test {
    public static void main(String... args){

//INT

/*
        //Compiler -> TypeChecking
        //float :: 1.4E-45 to 3.4028235E38
        
        //JVM  :: allocates memory of (4 bytes : 16 bit) for data variabl on RAM.

        // float data = 1.4065; //incompatible types: possible lossy conversion from double to float

        //by default real numbers are treated as double so add postfix 'f' or 'F' for float.

        //float data = 1.4065f; 

        //System.out.println(data);

        System.out.println("MIN VALUE IS :: "+Float.MIN_VALUE);
        System.out.println("MAX VALUE IS :: "+Float.MAX_VALUE);

        // float data = 3.4028235E39f; // error: floating-point number too large

        //Now if we try to do following :- 
        //float data = "sachin"; //error: incompatible types: String cannot be converted to float

        //float data = 'a'; //it won't give any compile time error or compile error because.....(write it later...)

        //float data = 121.3; //error: incompatible types: possible lossy conversion from double to float

        //byte data = true; //error: incompatible types: boolean cannot be converted to float
*/

//DOUBLE

/*
        //Compiler -> TypeChecking
        //double :: 4.9E-324 to 1.7976931348623157E308

        //JVM  :: allocates memory of (8 bytes : 64 bit) for data variabl on RAM.

        System.out.println("MIN VALUE IS :: "+Double.MIN_VALUE);
        System.out.println("MAX VALUE IS :: "+Double.MAX_VALUE);

        double data = 1.7976931348623157E309; //  error: floating-point number too large

        //Now if we try to do following :- 

        //double data = "sachin"; //error: incompatible types: String cannot be converted to double

        //double data = 'a'; //it won't give any compile time error or compile error because.....(write it later...)

        //double data = 121.3; //eno error

        //double data = 121.345f; //no error

        //byte data = true; //error: incompatible types: boolean cannot be converted to float
*/

//CHAR 

/*
        //Compiler -> TypeChecking
        //char ::  to ?

        //JVM  :: allocates memory of ( bytes :  bit) for data variabl on RAM.

        System.out.println("MIN VALUE IS :: "+Character.MIN_VALUE);
        System.out.println("MAX VALUE IS :: "+Character.MAX_VALUE);

        //OUTPUT: 
         //MIN VALUE IS :: 
         //MAX VALUE IS :: ?

        //In output we didn't get min value and for max value we got '?', why?
        //ans --> because hava supports internationalization, see notebook.
*/

//BOOL

/*
        //Compiler -> TypeChecking 
        //boolean :: no min and max value (as bool only has 2 values and those are default literals 'true' and 'false')

        //JVM :: depends on the os.

        //boolean data = false;
        //boolean data = true;

        //boolean data = False; //error: cannot find symbol
        //boolean data = True;  //error: cannot find symbol

        //in C C++, 0 --> false and 1 --> true but in java '0' and '1' are integers.
        
        //boolean data = 0; //error: incompatible types: int cannot be converted to boolean

        //boolean b = "string"; //error: incompatible types: String cannot be converted to boolean

        System.out.println(data);
*/

// TYPECASTING

    int a = 10; //size = 4 byte
    long l = a; //size = 8 bytes

    //therefore implicit typecasting happens or widening

    System.out.println(l);
    
    char b = 'z'; //size = 2 byte
    int m = b; //size = 4 byte

    //therefore implicit typecasting happens or widening

    System.out.println(m);

    char c = 97; //size = 2 byte
    //since unicode conversion of 97 to char is within range if char i.e -128 to 127 ,it will keep the value and typecast it.
    System.out.println(c);

    char d = ' ';

    System.out.println(d);

    long lvar = 10; //no 'l' or 'L' as suffix but no problem cuz 10 is well within integer range as well so direct typechecking by JVM. But even though 'lvar' contains int but in below line 'lvar' will be considered long only due to it's datatype mentioned above.

    // int e = lvar; //here int(size = 4 byte) is trying to contain long(size = 8 bytes) which is not possible implicitly.

    // System.out.println(e); //error: incompatible types: possible lossy conversion from long to int
    
    //Now to do the above typecasting from long to int we should do it explicitly as shown:

    int e = (int) lvar; //NoError

    System.out.println(e); 
    System.out.println(lvar);
    
    }
}

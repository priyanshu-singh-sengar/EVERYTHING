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
/*
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

    int e = (int) lvar; //NoError --> explicit typecasting

    System.out.println(e); 
    System.out.println(lvar);
*/

//IMPLICIT TYPECASTING (examples)
/*
        int i = 10;
        byte b = i;//incompatible types: possible lossy conversion from int to byte

        System.out.println(i+" "+b); 

        int b1 = 65;
        char c = b;//incompatible types: possible lossy conversion from byte to char --> see diagram in notebook there we can see that there is no relation between chear and byte

        System.out.println(b1+" "+c); 

        char c1 = 'A';
        short s = c; //error: incompatible types: possible lossy conversion from char to short

        int i1 = c; //no error
        System.out.println(c1+" "+s);
        System.out.println(i1+" "+c1);

        byte b3 = 128; //128 is bydefault an integer but still compiler checks if it is within the range of byte but here it exceeds the range.
        // error: incompatible types: possible lossy conversion from int to byte

        System.out.println(b3);

        byte b1 = 60;
        byte b2 = 50;
        byte b3 = b1+b2; //"byte + byte" is done here so compiler automatically promotes the datatype of the output of this sum to 'int' so b3 datatype should be int.

        int b3 = b1+b2;

        //similar thing happens with the following:
        // byte + byte = int
        // byte + short = int
        // short + int = int
        // long + float = float
        // float + double = double
        // long + double = double
        // int + int = int
        // int + long = long
        // int + double = double
       
        System.out.println(b3);
 
        long l = 10;
        float f = l; // noError --> why? explained later in notebook.

        System.out.println(f+" "+l);

        float f = 22.22f;
        long l = f;
        System.out.println(l+" "+f); //error: incompatible types: possible lossy conversion from float to long
        //Q- How can float(4 bytes) can accomodate long(8 byte) but vicaversa not true?
        //ans --> in notebook --> see COA notes where they taught floating point number

        //Formulae:: In arithmetic operations the result will be always be Z= X + Y if X and Y belongs to {byte,short,int} then Z should be int. if either X or Y or both X and Y belongs to {long,float,double} then Z is max(X,Y).
*/

//EXPLICIT TYPECASTING EXAMPLES
/*
        int i = 10; //noError
        byte b = (byte) i; 

        byte b = 65;
        char c = (char)b; //noError
        System.out.println(b+" "+c);

       char c = 'A';
       short s = (short)c; //noError
        System.out.println(s+" "+c);   
 
        short s = 65;
        char c = (char) s; //NoError
        System.out.println(c+" "+s);

        short s = 65;
        char c = (byte) s; // error: incompatible types: possible lossy conversion from byte to char as there is no implicit connection between byte and char.
        System.out.println(s+" "+c);

        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = (byte) b1 + b2; // byte + byte = int (by default)
        // CompileError as only b1 is typecasted to byte and not b1+b2

        // byte b4 = (byte) b1 + (byte) b2; //CompileError as b1 and b2 are typecasted to byte seperately and not "b1+b2"

        byte b5 = (byte) (b1+b2); //NoError

        double d = 22.2;
        byte b = (byte)(short)(int)(long)(float)d; //in this type of cases we only see first --> 'byte' and last --> 'float', if they have an implicit or direct relationship then we do the typecasting to the first one i.e --> 'byte'

        //here loss of data or loss of precision takes place since float has decimal so anything after decimal is gone.
        System.out.println(b); //o/p --> 22

        //interview question: find output of below?
        int a = 130;
        byte b = (byte) a; //since range of byte --> -128 to 127
        //now as we can see that 130 exceeds the range of byte but still we try to explicitly convert it to byte this type of situation is called "loss of precision" or "loss of data" problem and compiler tackles it using a formula stated below:

        //FORMULA => data = minRange + (result - maxRange -1) then check if the data is in the range or not if it's still not in the range then apply the formula untill it's in the range.

        //in above case --> -128 + (130 - 127 + 1) = -126 (o/p)
        
        //in simple words --> use cyclic property of datatypes learned in C (GATE)

        System.out.println(b);

        int a1 = 254;
        byte b1 = (byte) a1;
        System.out.println(b1); //-2

        int a1 = 1540;
        byte b1 = (byte) a1;
        System.out.println(b1);
        
        //For above:
        //data1 = -128 + (1540 - 127 -1) = 1284 (still not in range of byte)
        //data2 = -128 + (1284 - 127 -1) = 1028 (still not in range of byte)
        //data3 = -128 + (1028 - 127 -1) = 772 (still not in range of byte)
        //data4 = -128 + (772 - 127 -1) = 516 (still not in range of byte)
        //data5 = -128 + (516 - 127 -1) = 260 (still not in range of byte)
        //data6 = -128 + (260 - 127 -1) = 4 --> output
*/

// Role of : Compiler --> will performing typechecking(check value can be stored based on range of values)
           //JVM --> will allocate memory based on the type and performs the necessary operation
           //typecasting is done by JVM.       

//Questions: (SNIPPETS)
        //1 
        /*
        public class HelloWorld{
                public static void main(String... args){
                        System.out.print("Hello");
                }
        }
        what is the name of the file in which above java code is saved?
        a) hello.java
        b) anything.java
        c) HelloWorld.java
        d) World.java

        ans -> (c) HelloWorld.java is the filename because in java by convention file name should be the name of the class that assiciate with main method.
        */

        //2
        /*
        public class Test{
                public static void main(String... args){
                        System.out.println("Hello");;;;;;;
                }
        }
        will the above code compile? why?
        a)Yes
        b)No

        Ans - Yes
        */

        //3
        /*
        what is the signature of special main method
        a) public static void main(String args)
        b) public static void main(String[] a)
        c) public static void main()
        d) private static void main()

        ans - (b) is correct also the following are also correct:
                1) public static void main(String... args)
                2) public static void main(String ...args)
                3) public static void main(String args[])
                4) public static void main(String []args)
         */

        //4
        /*
        what will be the result of compiling and executing Test class?
        public class Test{
                public static void main(String[] args){
                        byte b = (byte) (127 + 21);
                        System.out.println(b);
                }
        }
        options:
        a) 148
        b) CompileError
        c) -108
        d) -128

        ans-> -108 due to cyclic property of datatypes (Formula -> minRange + (value - maxRange -1))

        */

        //5
        /*
       public class test{
                public statc void main(String ...args){
                        char c = 'Z';
                        long l = 100_00l; //internally treated as long l = 10000l;
                        int i = 9_2; //internally treated as int i = 92;
                        float f = 2.02f; 
                        double d = 10_0.35d; //internally treated as '100.35d'

                        l = c + i; //char + int = int ---> long (implicitly)
                        f = c * l * i * f; //char * long * int * float ---> float ---> float
                        f = l+i+c; // long + int + char ---> long ---> float (implicitly)
                        i = (int)d; //possible
                        f = (long)d; //long ---> float (implicity)

        does above code compile successfully?
        a)Yes
        b)No
        Ans -> Yes.
        
        doubt -> can we keep underscore '_' between the digits as done in above code?
        ans -> Yes we can keep underscore between the digits, This concept is called 
               'Numric Literals'.

               eg - double d = 10_0.35d; //internally the _(underscore) is      
                    removed and it will be treated as double d = 10_0.35d;
                

                NOTE --> Numeric Literal i.e. use of underscore is not permitted at first and last position of a number (also see next NOTE)

                eg -> double d = _1_2__3_456.7__8__9_; will give error where as
                      double d = 1_2__3_456.7__8__9; will not give any error as underscore is not present at any end of the number, it's in between first and last digits.

                NOTE --> Numeric Literal i.e. use of underscore is not permitted at either side of decimal point in double and floating point numbers.

                eg -> double d = 123_.456; //illegal underscore 
                      double d = 123._456; //illegal underscore
        }
        */
        
        //6
        /*
        consider below code of Test.java file
        public class Test{
                public static void main(String[] args){
                        char c1 = 'a'; //Unicode value of 'a' is 97
                        int i1 = c1; //implicit typecasting
                        system.out.println(i);
                }
        }
        what is the result of above code?
        a) 'a'
        b) 97
        c) line n1 causes Compilation Failure 
        d) line n2 causes Runtime Error

        ans -> 97
        */
    }
}

//NOTES ARE ALSO WRITTEN IN NOTEBOOK
//lecture 4 -->  on datatypes part 1
 //see notebook till lecture 3
 
class L4test{
    public static void main(String[] args)
    {

        // Compiler --> Typechecking
// BYTE :
/*
        //byte :: -128 to +127
        // JVM allocates memory of (1 byte -> 8 bits) for data variable in RAM.

        byte data = 10;

        //To find maximum range of 'byte' datatype use:
        System.out.println("MAX RANGE of byte datatype :: " + Byte.MAX_VALUE); 

        //To find maximum range of 'byte' datatype use:
        System.out.println("MAX RANGE of byte datatype :: " + Byte.MIN_VALUE);

        //Now if we assign values that exceed this range of 'byte' data type we get following error:

        //say we type 'data = 130;' in the code then :
        //error -> error: incompatible types: possible lossy conversion from int to byte.

        //Now if we try to do following :- 
        byte data2 = "sachin"; //what will be output?

        //This will be a compileError(we need to specifically mention this because there are other types of errors in java which are discussed in exception handling)

        //error: incompatible types: String cannot be converted to byte

        //What if we allot a single character to a byte type variable:-

        byte data3 = 'a'; //it won't give any compile time error or compile error because.....(write it later...)

        byte data4 = 121.3; //error: incompatible types: possible lossy conversion from double to byte.

        byte data5 = true; //error: incompatible types: boolean cannot be converted to byte
*/

// SHORT :
/*
        //+++++++++++++++++++++++++++++++++++++
        //Now if we want to store data exceeding range of byte datatype then we need to use: short datatype
        //+++++++++++++++++++++++++++++++++++++

        //short :: -32768 to 32767

        //JVM allocates memory of (2 byte -> 16 bits) for short data type variables in RAM.

        //short data6 = 30000; //it is well within the range of short datatype.

        System.out.println("MAX RANGE of short datatype :: " + Short.MAX_VALUE); 

        System.out.println("MAX RANGE of short datatype :: " + Short.MIN_VALUE); 

        short data6 = 32768; //error: incompatible types: possible lossy conversion from int to short

        //and for other experiments that we did in byte datatype code which gave error such as using byte type variable to store string, bool etc type of values will give same errors if we use short instead of byte as well.
*/

// INT :
/*    
        //+++++++++++++++++++++++++++++++++++++
        //Now if we want to store data exceeding range of short datatype then we need to use: int datatype
        //+++++++++++++++++++++++++++++++++++++
        
        //JVM allocates memory of (4 byte -> 32 bits) for int data type variables in RAM.

        //int :: -2147483648 to 2147483647
        
        int data7 = 1234506; //is well within range of integer.

        System.out.println("MAX RANGE of int datatype :: " + Integer.MAX_VALUE); 

        System.out.println("MAX RANGE of int datatype :: " + Integer.MIN_VALUE);

        int data9 = "sachin"; //error: incompatible types: String cannot be converted to int

        //What if we allot a single character to a int type variable:-

        byte data10 = 'a'; //it won't give any compile time error or compile error because.....(write it later...)

        int data11 = 121.3; //error: incompatible types: possible lossy conversion from double to int.

        int data12 = true; //error: incompatible types: boolean cannot be converted to int
        
        int data13 = 2147483648; //exceeds range of int
        //error: integer number too large
*/

//LONG :

/*
        //+++++++++++++++++++++++++++++++++++++
        //Now if we want to store data exceeding range of int datatype then we need to use: long datatype
        //+++++++++++++++++++++++++++++++++++++

        //JVM allocates memory of (16 byte -> 64 bits) for long data type variables in RAM.

        //long :: -9223372036854775808 to 9223372036854775807
        
        //NOTE - we need to add 'l' or 'L' at the end of long type value, if we don't use 'l'or 'L' at the end of number compiler will consider it to be an integer by default.

        //long data14 = 1234504356l; //is well within range of integer.

        System.out.println("MAX RANGE of int datatype :: " + Long.MAX_VALUE); 

        System.out.println("MAX RANGE of int datatype :: " + Long.MIN_VALUE);

        //long data9 = "sachin"; //error: incompatible types: String cannot be converted to long

        //What if we allot a single character to a int type variable:-

        //long data10 = 'a'; //it won't give any compile time error or compile error because.....(write it later...)

        //long data11 = 121.3; //error: incompatible types: possible lossy conversion from double to long.

        //long data12 = true; //error: incompatible types: boolean cannot be converted to long

        //long data15 = 9223372036854775808l; //exceeds range of long
        //error: integer number too large 

        // int x = 234l; //error: incompatible types: possible lossy conversion from long to int
*/
    }  
}
//Unanswered questions from previous lecture:
 //Question - why we used new keyword(dynamic allocation) for StringBuffer but we used normal allocation without using constructor(or dynamic attocation) for String class??
//*****************

//Immutable String and Memory Map:
//Immutable string are created with the help of object of class String.

public class lec_135ImmutableStringAndMemoryMap
{
    public static void main(String[] args) {
        //Ways to create a String :-

        String varName = "data";

        String var2Name = new String("Data");

        char var3Name[] = {'a','e','i','o','u'};
        String str = new String(var3Name);

        //Printing all three strings here:
        System.out.println(varName);
        System.out.println(var2Name);
        System.out.println(str);
        //All three are working exactly similarly so what is the difference??
        //Ans - String ==> Object ==> heap

        //Diagram                     STACK AREA        HEAP AREA - Duplicate objects are allowed
        /*                         _________________ __________________
                                                    |
                                        S3 ---------|-------> "Hello"
                                        S3 ---------|-------> "Hello"
                                                    |
                                                    |  string constant pool - string declared without "new"
                                                    |    _____________        also it mainstains an internal
                                                    |   |             |        copy of HEAP AREA objects not
 As we "String constant pool doesn't    S1,S2-------|---|---> "Hi"    |       referred by any variables.
        allow Duplicated to be stored               |   |             |       JVM maintains an internal/
        that'swhy variables referring               |   |             |       implement reference of these.
        to same objects will refer to               |   |             |
        only a single copy in String                |   |  "Hello" ---|--> JVM copy                         
        Constant Pool".                             |   |             |
       

            in above diagram:
            String S1 = "Hi";
            String S2 = new String("Hi");
            String S3 = new String("Hello");
            String S4 = new String("Hello");
         */
        //We can check if variables are referring to same object in HEAP AREA (or STRING CONSTANT POOL) or are they referring to different objects using "==" operator as show:
        System.out.println("***************** TEST *****************");

        String s1 = new String("pw");
        String s2 = new String("pw");
        System.out.println(s1==s2); //output - false, as s1 and s2 refer to different object as they are present in HEAP AREA.

        String s3 = "pw";
        String s4 = "pw";
        System.out.println(s3==s4);
        System.out.println(s1==s3);
    }
}
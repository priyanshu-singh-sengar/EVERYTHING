//Lecture --> 8 ( Operators {part 2} ) --> javaMicroservices/L8test.drawio (IMAGES FROM THIS LECTURE)

public class L8test {
public static void main(String []args){
/*
    //ARITHMETIC OPERATORS(continued...) --> +, -, *, /, %
    //Revisions:
        System.out.println(0.0/0.0); //double/double -> double
        System.out.println(-0.0/-0.0); //-double/double -> -double
        System.out.println(0/0); //int/int-> double

        //Output:
        NaN
        NaN
        ArithmeticException : /by zero

        //NOTE -> Nan (Not a number) is a integral arithmetic(byte, int, short, long) ther eis no way to represent the undefined result, so it would throw an Exception called "ArithmeticException"
        //But floating point arithmetic(double, float) there is a way to represent the undefined result, so the result would be "Nan".

//Discussion on 'NaN'
    //Relational Operators --> //< , <= , >= , == , != (Some examples) --> in detail => Later
    //PREDICT THE OUTPUT:
    System.out.println(10<Float.NaN); //false, //this simply means that is 10 smaller than 'Not a Number'
    System.out.println(10<=Float.NaN); //false
    System.out.println(10>Float.NaN); //false
    System.out.println(10<=Float.NaN); //false
    System.out.println(10==Float.NaN); //false
    System.out.println(10!=Float.NaN); //true
    System.out.println(Float.NaN==Float.NaN); //true
    System.out.println(Float.NaN!=Float.NaN); //true

    //NOTE --> for any value of 'x' including NaN, the result will be false.

    //NOTE --> / and % have possibility of getting arithmetic exception when operated on integral arithmetic typem but not on floating type.

    //NOTE --> / => extracts the quotient and performs the operation.
    //NOTE --> % => extracts the remainder and performs the operation.   

//'+' Operator applied on Strings in Java:

//EXAMPLES:
    String name = "sachin";
    int a = 10, b = 20, c = 30; //this is called single line declaration
    System.out.println(a+b+c+name); //here '+' operator is used for addition when operands are numeric type and will promote there datatype if necessary, so here "a+b+c" --> 60 (int type) but in case if any one of the operand is String then the '+' operator is used for concatenation.

    //Output -> 60sachin

    System.out.println(name+a+b+c); //here as we know that the associativity of + operator is from left to right and here the leftmost operand is string so there needs to be concatenation done for first 2 operands and since concatenation is done for first 2 operands so for the remaining operands we also need to do concatenation.

    //Output -> sachin102030

    System.out.println(a+b+name+c); //here first 2 operand are numeric so normal addition will happen and once we encounter string the + operator is used to do concatenation.

    //Output -> 30sachin30

    System.out.println(a+name+b+c); //here first operation is concatenation as one of the operands is a string so the remaining operations will also be strings.

    //Output -> 10sachin2030


//NOTE --> '+' operator in java is referred to as "Overloaded Operator"
        // '+' operators will perform addition if both the operands are of numeric type (byte, short, long, float, double)
        // '+' operators will perform concatenation, if one of the operands is of "String type".

       
        String name = "sachin";
        int a = 10, b = 20, c = 30;
        name = a+b+c;
        System.out.println(name);

        //Output -> CE: incompatibe type
      
        String name = "sachin";
        int a = 10, b = 20, c = 30;
        name = name+a+b;
        c=a+b;

        c=a+b+name; //CE: incompatibe type as name is String and c is int.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Output -> CE: incompatibe type

//RELATIONAL OPERATORS:
// <,<=,>,>=

//EXAMPLES:

    System.out.println(10>10.5);//false

    System.out.println('a'>10.5);//true

    System.out.println('z'>'a');//true

    System.out.println(true>false);//CE --> bad operand types for binary operator

    System.out.println("sachin" > "kohli");//CE --> as String is not a primitive type

    System.out.println(10<20<30);//CE --> as associativity of relational operator '<' is from left to right and on computing "10<20" result is "true" so essentially we are trying to apply "true<30" which is not possible as Relational operators cannot be applied on boolean values.

    System.out.println(10>20>30);//CE --> same reason as above.

//Conclusions:

    // => We can apply relational operators only on primtive types except "boolean types".
    // => we cannot apply relational operators only reference types(on objects)
    // => Nesting of relational operator is not possible in java.

//EQUALITY OPERATOR:
    // == and != 

//EXAMPLES:

    System.out.println(10 == 20);//false
    System.out.println('a' == 'b');//false
    System.out.println('a' == 97.0);//true
    System.out.println(false == false);//true

    Thread t1 = new Thread(); //an object of Thread class is created and t1 is pointing to that object.
    Thread t2 = new Thread(); //an object of Thread class is created and t2 is pointing to that object.
    Thread t3 = t1; //Now t3 is also referring to t1 object.

    System.out.println(t1 == t2); //false
    System.out.println(t1 == t3); //true

    //therefore equality operator can be applied on objects as well of different classes.

    Thread t = new Thread();
    Object o = new Object();
    String s = new String("sachin");
    StringBuffer s1 = new StringBuffer("dhoni");

    System.err.println(t == o); //false
    System.err.println(o == s); //false
    System.err.println(s == t); //error: incomparable types: String and Thread
    System.err.println(s == s1); //error: incomparable types: String and StringBuffer

    //NOTE --> To Compare 2 classes using equality diagram either the 2 classes have should a parent child relationship (in class heirarchy diagram) or either the reference of both is at same object, we cannot compare sibling Classes(classes at same level in heirarchy) in the heirarchy diagram, if either of these 2 conditions is not met the program will give error.

//Conclusions:

// => we can apply equality operator on primitive types including boolean types

// => we can apply equality operator on reference types also.

// => to use equality operator on reference type, we need to check whether there exists a relationship between 2 
    //operands. If relationship exists, it should be parent child relationship, otherwise it would result in "CompileTimeError".


//BITWISE OPERATORS

//1) & => If both the arguments are true, then only result in true. {Bitwise AND}
//2) | => If atleast one argument is true, then result is true. {Bitwise OR}
//3) ^ => If both arguments are of different type, then result in true. {Bitwise XOR}
//4) ~ => It is negation operator. {Bitwise NOT}

    System.err.println(4&5); //4
    System.err.println(4|5); //5
    System.err.println(4^5); //1
    System.err.println(~5); //-6, in case of negation it will convert 5 to it's negative counterpart but since computer stores negative numbers in their 2's complement form that's why we are getting -6 as output.

    //System.out.println(~true); //CE : bad operand type boolean for unary operator '~'

    //System.err.println(!true); //false, this is correct way to find counter part of boolean type
    System.err.println(!true); //false
    System.err.println(!4); //error: class, interface, enum, or record expected {CompileError}


//CONCLUSIONS:
    // &,|,^                  => These operators can be applied on boolean and even on integral types.
    //~ (bitwsise complement) => This operator can be applied on integral types, but not on boolean types.
    //! (boolean complement)  => This operator can be applied only on boolean types, but not on integral types.

    //NOTE : negative number will be stored inside the computer using 2's complements.
    //       For a negative number MSB will be 1, where as for a positive number MSB will be 0.


//SHORTCIRCUIT OPERATOR (also called as logical operator)
//      &&, || --> logical AND and logical OR respectively.
//      these operators are exactly same as "& and |", but with small differences.

//  &, |
    //=> Both the arguments should be evaluated always
    //=> Performance is relatively slow.
    //=> It is applicable for both integral and boolean types.

//  &&, ||
    //=> Second argument evaluation is optional.
    //=> Performance is relatively high.
    //=> It is applicable only for boolean types, not for integral types.


//NOTE: 
    //  x && y
        //=> y will be evaluated only if x is true,otherwise y won't be evaluated.
        //=> x is true, then y will be evaluated.

    // x || y
        //=> y will be evaluated only if x is false, otherwise y won't be evaulated.
        //=> x is true, then y won't be evaulated.

//EXAMPLES:
    int x = 10, y= 15;
    if (++x < 10 & ++y>15) //both will be evaluated {i.e. x = 11, y = 16} --> false & true --> false
        x++;
    else
        y++; //control comes here. {y = 17}

    System.out.println("x = "+x); // 11
    System.out.println("y = "+y); // 17

    int x = 10, y= 15;
    if (++x < 10 | ++y>15) //both will be evaluated {i.e. x = 11, y = 16} --> false | true --> true
        x++; // control comes here. {x = 12}
    else
        y++; 

    System.out.println("x = "+x); // 16
    System.out.println("y = "+y); // 16

    int x = 10, y= 15;
    if (++x < 10 && ++y>15) //++x < 10 --> false, and since we are getting a false in first expression and '&&' is shortcircuit operator {i.e. x = 11, y = 15}  therefore the second expression "++y > 15" is not evaluated at all and we enter the else block.
        x++;
    else
        y++; //control comes here {y = 16}
 
    System.out.println("x = "+x); // 11
    System.out.println("y = "+y); // 16
 
    int x = 10, y= 15;
    if (++y>15 || ++x < 10) //++y > 15 --> true, and since we are getting a true in first expression and '||' is shortcircuit operator {i.e. y = 16, x = 10}  therefore the second expression "++x < 10" is not evaluated at all and we enter the if block.
        y++;
    else
        x++; //control comes here {y = 16}
 
    System.out.println("x = "+x); // 10
    System.out.println("y = "+y); // 17

//TYPECASTING OPERATOR:

//1. Implicit/narrowing => compiler will automatically do (no loss of data)
//2. explicit/widening => programmer should do (loss of data might happen)
 
//EXAMPLES: 
    float x = 150.1234f;
    //int i = x; //CE
    int i = (int) x; // 150 --> loss of precision
    System.out.println(i);

    double d = 130.456;
    int y = (int)d; 
    System.out.println(y); //130

    int x = 150;
    short s = (short) x;
    System.out.println(s); // 150 --> in the range of short so no loss of precision.

    byte b = (byte) x;
    System.out.println(b); // -106, { FORMULA --> minRange + (result - maxRange -1) }

    double d = 130.456;
    int z = (int) d;
    System.out.println(z);
//=> While working with integral types, storing higher value in lower type using explicit typecasting might lead to data loss or loss of precision.    
   

//ASSIGNMENT OPERATORS:

//a) simple assignment --> (already known)
//b) Chained assignment
//c) Compund assignment

    //1) CHAINED ASSIGNMENT:

    int a, b, c, d;
    a = b = c = d = 10;
    System.out.println(a+" " + b + " "+c+" "+d); //10 10 10 10

    int a = b = c = d = 10; //declaration and assignment cannot be done in chained format simultaneously.
    System.out.println(a+" " + b + " "+c+" "+d); //CE : 

    int a, b = 10, c; //no issue with b = 10
    a = b = c = 20;
    System.out.println(a+" " + b + " "+c); //20 20 20

    int b, c, d; 
    int a=b=c=d=10;//valid because b,c and d are already declared in above line so here we are just declaring 'a' it is 
                   //same as writing:
                   // int a;
                   // a = b = c = d = 10;

    System.out.println(a+" " + b+" " + c +" " +d); //10 10 10 10

    int a, b, c, d = 10; //here only 'd' is inilialized with 10 and variables 'a' 'b' and 'c' are uninitialized.
    System.out.println(a+" " + b+" " + c +" " +d);

    //2) COMPOUND ASSIGNMENT:
    //+= ,-=, /=, *=, %=
    //&=,|=,^=
    
    int a = 10;
    a += 20; //same as --> a = a + 20;
    System.out.println(a);

//Q - What is the difference between below three examples:
    byte b = 10;
    b++; //adds 1 to b then internally typecasts the result to byte.
    System.out.println();

    byte b = 10;
    b=b+1; //here --> byte + int => int (internally) but we are trying to store it in a byte type variable so, CE: 
           //incompatible types.
    System.out.println(b);

    byte b = 10;
    b+=1; //here compiler internally typecasts the result to suitable type of the variable that will store the result 
          //just like the case of "b++" i.e. the expressions actually means : b = (byte) (b + 1);
    System.out.println(b);

    //if we want to increment 'x' by 1 --> x++;
    //if we want to increment 'x' by y --> x+=y;

    int a, b, c, d;
    a=b=c=d=20;
    a+=b-=c*=d/=2; //chaining of compound assignment is allowed. It is same as writing:
                   //d = d/2; => 20/2 = 10
                   //c = c*d; => 20*10 = 200
                   //b = b-c; => 20-200 = -180
                   //a = a+b; => 20+(-180) = -160
                   //implies that each variable is chained to it's next variable in Compound statement chaining.

    System.out.println(a+" " + b+" " + c +" " +d); //-160 -180 200 10

//NOTE --> chained and compund assignments are used often.

//CONDITIONAL OPERATOR -> it is also called tertiary operator --> it's like writing if else in single line

//EXAMPLES:

    int x = 10==10?100:500; //Format --> datatype var = (condition) ? (if true) : (if false); 
                            //NOTE --> the (if true) and (if false) should have the same return type as the variable to which they are being assigned to i.e here "datatype" of "var".

    System.out.println(x);

    int y = 10>20?30:40>50?60:70; //70
                                  //it's like writing :
                                  // if(10>20)
                                  //    x = 30;
                                  // else if(40>50)
                                  //    x = 60;
                                  // else
                                  //    x = 70;
                                  //Now we can clearly see that why datatype of variable to which value is stored must
                                  //be same as (if true) or (if false) block.  
    System.out.println(y);
 

    byte c = (10>20) ? 30 : 40; //here Compiler checks that if '30' and '40' fits in byte range and since the range of byte can accomodate '30' and '40', Compiler will do "internal typecasting" and return the final result. Compiler can do all this because '30' and '40' are compile time constants so there datatypes as well as range of datatype can be checked at Compile time only.

    byte d = (10<20) ? 30 : 40;
    System.out.println(c+" "+d);

    //here compiler does the operation, does typechecking, does internal typecasting and returns value to variables.

    //Output --> 40 30

    int a = 10, b = 20;
    byte c1 = (a > b)? 30: 40; //here 'a' and 'b' are by default 'int' but we are assigning it to 'byte' type but here the problem is that 'a' and 'b' are not compile time constants so compiler will only know the datatypes of 'a' and 'b' and not there values so compiler cannot check and see whether these values are falling under the range of the datatype of c1 or not.

    byte c2 = (a < b)? 30: 40; //same as above explaination

    System.out.println(c1+" "+c2);

    //Output --> CE: incompatible types: possible lossy conversion from int to byte

    final int a = 10, b = 20;

    byte c1 = (a > b)? 30: 40; 

    byte c2 = (a < b)? 30: 40;

    System.out.println(c1+" "+c2);

    //Due to use of 'final' keyword, compiler will know the values of 'a' and 'b' and they will become compile time constants => '10' and '20' respectively.

    //Output --> 40 30


//SNIPPETS:

//Q1
    int x = 5;
    boolean b1 = true;
    boolean b2 = false;

    if((x==4) && !b2)
        System.out.println("1 ");
    System.out.print("2 ");
    
    if ((b2 = true) && b1 )
        System.out.println("3 ");
    
    //Output -> My Answer --> 2
    //But the answer is --> 2 3, why? --> in diagram section (javaMicroservices/L8test.drawio)

    //What is the result?
    //A. 2
    //B. 3
    //C. 1 2
    //D. 2 3[Answer]
    //E. 1 2 3
    //F. Compilation fails.
    //G. An exception is thrown at runtime.

//Q2 What will be the result of compiling and executing Test class?

    System.out.println("Hello" + 1 + 2 + 3 + 4);

    //A. Hello10
    //B. Hello19
    //C. Hello1234[Answer]
    //D. Hello10

//Q3 What will be the result of compiling and executing Test class?

    System.out.println(1 + 2 + 3 + 4 + "Hello");

    //A. 1234Hello
    //B. 10Hello[Answer]
    //C. 64Hello
    //D. 10 Hello

//Q4 What will be the result of compiling and executing Test class?

    System.out.println("Output is: " + 10 != 5);

    //A. Output is : true
    //B. Output is : false
    //C. Compilation error [bad operand types for binary operator '!=']
    //D. Output is : 10 !=5
    //Answer: C
 
//Q5 A little change to above (Q4) by adding brackets to specify priority of operations

    System.out.println("Output is: " + (10 != 5)); //due to brackets the bracket part is evaluated first then it's 
                                                   //concatenated in String part.

    //A. Output is : true [Answer]
    //B. Output is : false
    //C. Compilation error 
    //D. Output is : 10 !=5
    //Answer: A

//Q6 what will be the result of the compiling and executing below class?

    int $ = 80000;
    String msg = ($ >= 50000) ? "Good bonus" : "Average bonus";
    System.out.println(msg);

    //A. Good bonus [Answer]
    //B. Average bonus
    //C. compilation error
    //D. None of the above 

//Q7 
    int a = 20;
    int var = --a * a++ + a-- - --a;
    System.out.println("a = " + a);
    System.out.println("var = " + var);

    //A. a =25
    //   var=363

    //B. a= 363
    //   var=363

    //C. a=18
    //   var=363

    //D. compilation error

    //Output --> C

    // a = 19,20,19,(18) --> updates 4 times
    // int var = --a * a++ + a-- - --a;
    //         = 19 * 19 + 20 - 18
    //         = 361 + 2
    //         = 363

//Q8 What will be the result of compiling and executing Test class?
 
    int a = 7;
    boolean res = a++ == 7 && ++a == 9 || a++ == 9; //line-n1
    System.out.println("a = " + a);
    System.out.println("res = " + res);

    //A. a=10
    //   res=true

    //B. a=9
    //   res=true

    //C. a=10
    //   res=false

    //D. compilation error

    //Output --> B
    //a = 7,8,9
    //boolean res = (true && true)|| a++ == 9
    //            = true || a++==9
    //            = true
*/
    }
}
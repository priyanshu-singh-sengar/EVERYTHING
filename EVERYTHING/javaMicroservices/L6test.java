//lecture 6 --> Control statements
public class L6test{
    public static void main(String[] args){
        //System.out.println( 1_______23.456); //underscores are ignored
         
//IF BLOCK
/*
        int x = 0;
        if(x) //unlike C and Cpp condition inside if block should always be boolean
              //error: incompatible types: int cannot be converted to boolean
        {
            System.out.println("hello");
        }
        
        System.out.println("hiee");

        int x =10;
        if(x=20) //unlike C and Cpp condition inside if block should always be boolean
                 //error: incompatible types: int cannot be converted to boolean
        {
            System.out.println("hello");
        }
        System.out.println("hiee");

        int x =10;
        if(x==20) //condition is false --> boolean
        {
            System.out.println("hello");
        }
        System.out.println("hiee"); //o/p --> hiee   

        bool x = true;
        if(x = false) //condition is reassigned to false --> boolean
        {
            System.out.println("hello");
        }
        System.out.println("hiee"); //o/p --> hiee   

        bool x = true;
        if(x==true) //condition is true --> boolean
        {
            System.out.println("hello"); //o/p --> hello  
        }
        System.out.println("hiee"); 

        if(true) 
            System.out.println("hello"); //scope of if block is till first semicolon

        if(true) 
            ;  //will give no output but will perfectly compile
        
        if(true) 
            int x = 10; //if we donot use curly braces in if block we shouldn't write 
                        //any declarative statements in the first and only line of if 
                        //block.
            //error: variable declaration not allowed here

        //But if we declare a variable by putting curly braces in above it won't give error but the scope of that variable will only be inside if block.

        if(true)
        {
            int a = 15;  
        }
        //variable 'a' cannot be accessed here.
        System.out.println(a); //Compile error: cannot find symbol

        if(true) 
        System.out.println("hello"); //dependent on if
        System.out.println("hiee"); //independent of if
    

    boolean res = false;
    if(res)
        System.out.println(res);

    //VALID CASES
    if(true);
    if(false);
    if(true) System.out.println(hello);

    //INVALID CASES
    if(true) int x = 10;
    if(true) {int x =10;} System.out.println(x);
*/ 

//NESTING OF IF-ELSE [ELSE - IF LADDER] --> not preferred by developers
/*
        //SYNTAX:

        if(){

        }
        else if{

        }
        else if{

        }
        else if{

        }
        else{

        }
IF - ELSE ladder is not recommended in general. Instead of if else ladder we use switch case.
*/

//SWITCH CASE --> imp for interviews

/*    
    //if several options are available then it is not recommended to use if else 
    //ladder we shouldd go for "switch" statements.

    //SYNTAX:
        switch(condition)
            case 1: action1
            case 2: action2
            case 3: action3
                    ;;;;
            default: default action;
    
    //Untill JDK1.4 version the allowed types for switch argument were "byte, short, char, int"
    //From JDK1.5 version onwards wrapper classes are also possible "Byte, Short, Character, Long" and enum
    //From JDK1.7 onwards we can also give "Strings"
        int x = 10;
        switch (x) {
            //NoError
        }

        switch(x){
            ; //here I wrote a statement so it should be a part of a 'case'
              //CompileError :  case, default, or '}' expected
        }
        //CONCLUSIONS:
            //1. curly braces are mandatory
            //2. If we are writing any statement inside switch then those than those should be part of 
                 //case by default.
            //3. If we are not writing any statement inside switch then case, default is optional.
            //4. Labels of 'cases' should be compile time constants only --> in detail below.

        int x = 10;
        switch(x){
            System.out.println("hiee"); //CE : error: case, default, or '}' expected
        }
        int x = 10;
        int y = 20;
        switch (x) 
        {
            case 10: System.out.println(10);  
            case y: System.out.println(20);
        }

        //error: constant expression required --> case y: System.out.println(20);
        //Why error?
        //ans -> Labels of 'case' should be compile time constants i.e. at compile time the value of labels must be known to be a constant but java is a dynamic programming language in which values are assigned to variables at runtime so during compile time in above code: in 'case y' the value of y will be unknown to compiler and it's treated as a variable thatswhy we get the error.
        
        //To Make that variable a compile time constant we use 'final' keyword while declaring it:
        //final keyword makes the variable compile time constant so that the compiler will be knowing value of the variable.

        int x = 10;
        final int y = 20; //y is considered as compile time constant now.
        switch (x) 
        {
            case 10: System.out.println(10);  
            case y: System.out.println(20);
        }

        //Don't use const keyword instead of final.

// NOTE - in java language memory for variable is given at run time thatswhy java is called dynamic programming language.

        int x = 10;
        switch (x+1) {
            case 10:
            case 10+20:
            case 10+20+30:
        } //NoError

// Rule -> switch argument and case label can have expression, but case label expression should be constant expression.

        byte x = 10;
        switch(x){
            case 10: System.out.println(10);
            case 100: System.out.println(100);
            case 1000: System.out.println(1000); // error: incompatible types: possible lossy conversion 
        }                                        // from int to byte at case 1000.

// Rule -> case label values should lie in the range of switch argument type otherwise it results in compiler time error.

            //i.e in above case : range of byte -> -128 to 127 but in case 1000:, '1000' exceeds that range
            //thatswhy the compileTimeError.

        byte b = 10;
        switch(b+1){ //here b + 1 --> byte + int = int and range of int -> -2,147,483,648 to 2,147,483,647
                     //which can easily accomodate all the case label constants unlike in above code.

            case 10: System.out.println(10);
            case 100: System.out.println(100);
            case 1000: System.out.println(1000);
        } //NoOutput --> as the condition didn't matched any case label,

//CONCLUSIONS: on Case label

        //a. Case label should be compile time constant.
        //b. Case label can have expression, but it shoudl be compile time constants expressions only.
        //c. Case label value should be within the range of teh switch argument type.
        //d. Duplicate case label allowed.


        int x = 0;
        switch(x){
            case 0: System.out.println("0");   //once a case matches with switch argument
                                               //compiler will execute all the cases below it without
                                               //tchecking for case labels this condition is called "fall 
                                               //through in Switch", thatswhy we place break after every 
                                               //case.
            case 1: System.out.println("1");
            case 2: System.out.println("2");
            default: System.out.println("default");
//TO STOP "FALL THROUGH IN SWITCH" (i.e within switch if any case is matched from that case onwards all the statements will be executed untill the end of switch or break) we use BREAK after each case.

//ADVANTAGE of "FALL THROUGH IN SWITCH" --> we can define common actions for multiple cases (but it is advised to avoid this practice).

        int x = 0;
        switch(x){
            case 0: System.out.println("0"); break;
            case 1: System.out.println("1"); break;
            case 2: System.out.println("2"); break;
            default: System.out.println("default");
        }

        int x = 0;
        switch(x){
            default: System.out.println("default"); //not a good position to be kept at
            case 0: System.out.println("0");
            case 1: System.out.println("1"); 
            break;
            case 2: System.out.println("2");
        } 
       int x = 0;
        switch(x){
            case 0: System.out.println("0");
            default: System.out.println("default"); //not a good position to be kept at
            case 1: System.out.println("1"); 
            break;
            case 2: System.out.println("2");
        }  

       int x = 3;
        switch(x){
            default: System.out.println("default"); //not a good position to be kept at, as it will fall through all the cases if case argument doesn't match any case label.

            case 0: System.out.println("0");
            case 1: System.out.println("1"); 
            break;
            case 2: System.out.println("2");
        }  
        
        //output --> noError, compiles normally
        // Note - default case can be place anywhere within switch brackets, it will get executed only if the argument doesn't matches any case label or when Fall through Switch Condition occurs. preferably we place it at the end so that we don't have to use break statement with default as well

//DUPLICATE CASE:

        int x = 3;
        switch(x){
            default: System.out.println("default-1"); //not a good position to be kept at, as it will fall through all the cases if case argument doesn't match any case label.

            case 0: System.out.println("0");
            case 1: System.out.println("1"); 
            break;
            case 2: System.out.println("2");
            default: System.out.println("default-2");
        } //error: duplicate default label.

//CONCLUSIONS:
        //1. within switch we can take default only once 
        //2. if no cases matched then only default case will be executed.
        //3. within a switch, we can take default everywhere but it is a convention to take it at last.
 
//eg:
        inr x = 3;
        switch(x){
            default: System.out.println("default-1");
            default: System.out.println("default-2");
        }
*/ 

//ITERATIVE STATEMENTS --> loops

//WHILE LOOP -> if we are not aware of how many time to iterate, then we need to go for while loop.

/*
//SYNTAX:
        while(boolean){
            ;;;;;
            ;;;;;
            ;;;;;
        }
//eg:
        while(resultset.next()){
            ;;;;;
            ;;;;;
            ;;;;;
        }

        while(enumeration.hasMoreElements()){
            ;;;;;
            ;;;;;
            ;;;;;
        }

        while(itr.hasNext()){
            ;;;;;
            ;;;;;
            ;;;;;
        }
//NOTE - The argument to while statement should be of "boolean type". if we are using another type it result in "CompileTimeError".


        while(1) 
            System.out.println("hello");
        // error: incompatible types: int cannot be converted to boolean
  
        while(true)
            System.out.println("hello");
        // output -> infinite loop printing 'hello'
  
        while(true)
            int x = 10; //same as if else case that we cannot initialize variable 
                        //without brackets in while loop.
                        //CompileTimeError: variable declaration not allowed here
   
        while(true){
            int x = 10; //Valid
        }  

        while(true){
            int x = 10;
        }      
        System.out.println(x); //Compile error : as x is in scope of while only.
        while(true)
        {
            System.out.println("hello"); //here in theory "hello" should be printed 
                                           //infinite times but compiler recognized 
                                           //during compilation process that while
                                           //loop is never terminated in the program
                                           //and the statements written after while 
                                           //loop will never be executed so compiler
                                           //will point out programmer's error that
                                           //why they wrote those statements in the 
                                           //first place if they are not supposed to
                                           //be executed by JVM.
        }
        System.out.println("hiee"); //CompileError: unreachable statement

        //NOTE -> always check for unreachable statements in such cases.

        //another form of unreachable statement: shown below
   

        while(false)
        { //CompileError: unreachable statement (this means while loop is unreachable)
            System.out.println("hello"); 
        }
        System.out.println("hiee"); //opposite of above case happens here
 
       int a = 10;
       int b = 20;
       while(a<b)
       {
        System.out.println("hello");
       }     
       System.out.println("hiee");

       //output -> hello(infinite times)

       //Here we do not get any type of unreachable statement error because in above 2 cases the boolean condition is fixed i.e it is kind of compile time constant value so compiler checks the reachability of all the statements beforehand wrt that 'true' or 'false' statement but in above case we have variables: a<b and in java variables are not compile time constants so compiler won't know there actual value beforehand therefore the comparision and condition checking will be done at runtime with JVM thatswhy no error.

       //we can confirm above statements by using 'final' keyword to make values of variables a and b known to compiler at compiler time, final makes variables --> compiler time constants.

       final int a = 10;
       final int b = 20;
       while(a<b)
       {
        System.out.println("hello");
       }     
       System.out.println("hiee");

       //output ->  error: unreachable statement

       //here compiler knows values of a and b at compile time so it will check for unreachability of any statement present in code.

       final int a = 10;
       while(a<20) //infinite loop
       {
        System.out.println("hello"); 
       }     
       System.out.println("hiee"); //this statement will become unreachable at runtime.

       //output ->  error: unreachable statement

       int a = 10; //Compiler doesn't have value of 'a' it only get to know it's type.
       while(a<20) //infinite loop
       {
        System.out.println("hello"); 
       }     
       System.out.println("hiee");

       //output = hello(infinite rule)

//NOTE:
       // Every final variable will be replaced with corresponding value by the compiler.

       // if any operation involves only constants then compiler is responsible to perform operation

       // if any operation involves at least one variable, then compiler won't perform any operation, JVM will perform operation.
*/

//DO - WHILE LOOP --> if we want to execute the body of the loop atleast once then we 
                      //need to go for do-while loop.
/*
//SYNTAX:
       do{
        ;;;;;
        ;;;;;
        ;;;;;
       }while(boolean); // ';' is mandatory.

//RULES -> same as while loop

//CONCLUSIONS:
       //1. curly braces are optional, we can take only one statement between do and 
            while (if no curly braces)
       //2. one statement should not be declarative.

       do{
        System.out.println("hello");
       } while(true);
 
        do
        {
            int x=10;
        } while();
        
        do
        int x=10;
        while(true); //same logic as if and while loop we cannot write declarative statements without using curly braces
//INTERVIEW QUESTION
        do while(true) System.out.println("hello"); while(true);
        //OUTPUT --> hello (infinite times), but WHY?
        // above code is same as writing:
    
        do
            while(true)
                System.out.println();
        while(true);  //as we know from C lang. that scope of do while is till the 
                      //first semicolon, so in this code we donot need bracket untill
                      //there is only 1 semicolon inside do statement. semocolon 
                      //represents 
  
        do while(true);
        //output --> CompileTimeError : error: while expected
                                      //error: illegal start of expression 
            
        //logically the output should be (infinte loop but nothing is printed) but the output is error because there should be minimum 1 statement between do and while when we are implementing the do while loop because that is the main purpose behind using do while loop in the first place.

        do
        {
            System.out.println("sachin");;
        } while(true);
        System.out.println("dhoni"); //this condition will become unreachable at 
                                     //compile time.
         //output -> error: unreachable statement
         
        do
        {
            System.out.print("sachin ");//this condition never become unreachable because in do while loop 1 iteration is compulsory before checking of condition.

        } while(false);
        System.out.println("dhoni"); 
         
        //output -> sachin dhoni

        int a = 10, b = 20;
        do
        {
            System.out.println("sachin");;
        } while(a<b);
        System.out.println("dhoni"); //this condition will not become unreachable at 
                                       //compile time because at compile time compiler only knows data types of a and b and not there values so there is no error at compiler time.
         //output -> sachin(infinte)
         
        int a = 10, b = 20;
        do
        {
            System.out.print("sachin ");;
        } while(a>b);
        System.out.println("dhoni"); //No unreachability errors because do condition 
                                       //will run once before termination of loop.
         //output -> sachin dhoni
  
        final int a = 10, b = 20;
        do
        {
            System.out.print("sachin ");;
        } while(a<b);
        System.out.println("dhoni"); //this condition will become unreachable at 
                                       //compile time because due to final keyword, a,b
                                       //are now compile time constants.
         //output -> error: unreachable statement

        final int a = 10, b = 20;
        do
        {
            System.out.print("sachin ");; //Traversed once
        } while(a>b); //Condition is false at compile time
        System.out.println("dhoni"); //this is also printed

        //output --> sachin dhoni
 
        final int a = 10;
        do{
            System.out.print("sachin ");
        } while(a>20);
        System.out.println("dhoni"); //No unreachability error as it is a compile time error but here at compile time compiler will not be aware of the value of variable 'a' compiler will only know it's datatype only.

        //OUTPUT --> sachin dhoni

*/
/*
//FOR LOOP --> when we know in advance the number of iteration that needs to be performed we go for for loop.

//SYNTAX:         |             |
                start     condition check
              (1) |         (2) | 
                  ↓             ↓         ↓(4)
        for(initialisation; condition; incr/dec){
                        /       | 
                       /    (3) | (if condition : true)
                      /         ↓ 
                     /  //body of for loop
        }           /    
              (3)  /  
                  ↓ 
            //Out of loop
        //in for loop the cursor will visit initialisation only once then it just incr/dec and checks condition.
   

//NOTE --> curly braces are optional in for loop untill first semicolon. 

//BASIC STRUCTURE -> in notebook 

//Examples:
  
        int i = 0;
        for(System.out.println("hello"); i<3; System.out.println("hi")) //same as C programming
            i++;  //i = 1,2,3
        
        //OUTPUT --> hello
        //           hi
        //           hi
        //           hi

        //the above code is getting no error because each expression is completely valid in for loop.



//NOTE -> it is optional to write condition in for loop but it is compulsory to write 2 semicolons inside condition section. 
        //eg - for(;;){} is valid but for(;) is not valid as we have to write 2 semicolons atleast.

        for(;;){ //compiler will assume condition to be 'true' by default.
            int x = 10;
            System.out.println("hello");
        }

        //output -> hello (infinite)

        for(int i = 0; i<true; i++){ //compiler cannot evaluate condition
            System.out.println("Sachin");
        }
            System.out.println("dhoni");

        //output --> error: bad operand types for binary operator '<'
       
        for(int i = 0; i<false; i++){ //same error as above
            System.out.println("Sachin");
        }
            System.out.println("dhoni"); 

        //output --> error: bad operand types for binary operator '<'
        
        for (int i = 0;;i++){
            System.out.println("Sachin");
        }
            System.out.println("Dhoni"); //this becomes unreachable at compile time

        //output --> error: unreachable statement 
      
        int a = 10, b = 20;
        for (int i = 0; a<b ;i++){
            System.out.println("Sachin");
        }
            System.out.println("Dhoni"); //even though it's unreachable but compiler 
                                         // cannot tell that because at compile time
                                         // compiler doesn't know the value of variables.

        //output --> sachin(infinite loop)

        final int a = 10, b = 20;
        for (int i = 0;;i++){
            System.out.println("Sachin");
        }
            System.out.println("Dhoni");

        //output --> error: unreachable statement
    
        //SOMEONE's DOUBT:
        boolean x = false;
        if(x=true)
            System.out.println("hello"); 
        
        //output --> hello
*/  
//SNIPPETS:
/*/

Q>
        Given:
            int x = 0;
            int y = 10;
            do {
                y--; // y = y-1
                ++x; // x = x+1

            } while (x < 5);

            System.out.print(x + "," + y);
            What is the result?
            A. 5,6
            B. 5,5 [Answer]
            C. 6,5
            D. 6,6
//Explaination:
            y = 9, x = 1 :: while(1<5) true
            y = 8, x = 2 :: while(2<5) true
            y = 7, x = 3 :: while(3<5) true
            y = 6, x = 4 :: while(4<5) true
            y = 5, x = 5 :: while(5<5) false

Q>
        public static void main(String[] args) {
            for (int i = 0; i <= 10; i++) { //i is declared inside for loop only so it's scope is within it
                if (i > 6) break;
            }
            System.out.println(i);
        }
        What is the result?
        A. 6
        B. 7
        C. 10
        D. 11
        E. Compilation fails. [Answer: i not accessible outside for loop] --> because 'i' is declared      
                            in for loop block only so i will be erased from memory when for loop is exited.

        F. An exception is thrown at runtime.

Q>
    Consider below code of Test.java file:
        public class Test {
            public static void main(String[] args) {
                boolean b1 = 0; //wrong assignment
                boolean b2 = 1; //wrong assignment
                System.out.println(b1 + b2);
            }
        }
        What is the result of compiling and executing Test class?
        A. 0
        B. 1
        C. true
        D. false
        E. compilation error [Answer: boolean means only true,false in JAVA unlike in C or CPP]

Q>
        Given:
            float pi = 3.141f;
            if (pi > 3) {
                System.out.print("pi is bigger than 3. ");
            }else {
                System.out.print("pi is not bigger than 3. ");
            }finally {
                System.out.println("Have a nice day.");
            }
            What is the result?
                A. Compilation fails.[Answer:finally block cannot be used without try block]
                B. pi is bigger than 3.
                C. An exception occurs at runtime.
                D. pi is bigger than 3. Have a nice day.
                E. pi is not bigger than 3. Have a nice day.
                //there is no error with if-else blocks in above case

Q>
    Given:
        public static void main(String[] args) {
            int i = 3; //line-12
            switch(i) { //line-13

                case 3: System.out.println("three"); break;
                default: System.out.println("other"); break;//line-15
            }
        }
        What is the result?
        A. three [Answer]  --> no error
        B. other
        C. An exception is thrown at runtime.
        D. Compilation fails because of an error on line 12.
        E. Compilation fails because of an error on line 13.
        F. Compilation fails because of an error on line 15.

Q>
    Given:
        public static void main(String[] args) {
            boolean i = true; //line-12
            switch(i) { //line-13

            case true: System.out.println("true"); break;
            case false: System.out.println("false"); break;
            default: System.out.println("other"); break;//line-15
            }
        }
    What is the result?
        A. true
        B. false
        C. An exception is thrown at runtime.
        D. Compilation fails because of an error on line 12.

        E. Compilation fails because of an error on line 13. // [Answer: switch arg types can be : byte,short,int,char] and wrapper classes --> but here it is boolean which is not accepted

        F. Compilation fails because of an error on line 15.
*/
        //DOUBTS --> of other people --> NoDoubts
    }   
}
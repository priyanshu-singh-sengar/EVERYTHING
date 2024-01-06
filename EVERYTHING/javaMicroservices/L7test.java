//Lecture --> 7 ( control flow and operators {part 1} )

/*SUMMARY:
 * 1. Simple control statements
 *      a) if
 *      b) if-else
 *      c) switch
 * 2. Looping control statements
 *      a) while
 *      b) dowhile
 *      c) for
 *      d) foreach(jdk1.5v)
 * 
 * FROM HERE ON WE NEED TO DO TODAY:
 * 3. Transfer control statements
 *      a) break
 *      b) continue
 *      c) return
 *      d) System.exit(0)
 */


public class L7test {
    public static void main(String []args){
    //1. break is used to avoid fall through in switch case
/*   
        int x=0;
        swtich(x){
            case 0: System.out.println("hello"); break;
            case 1: System.out.println("hiee"); break;
        }

    //2. we can use break inside a loop to break the loop based on some condition
        for (int i=0; i<=10; i++){
            if(i==5)
                break;
            System.out.println(i);
        }
      
    //3. break statement can be used inside "switch or loop" if any other place we try to use it results in "CompileTimeError."
        int x = 10;
        System.out.println("hello");
        if(x==10)
            break;  //break is used without any loop
        System.out.println("hiee");

        //output -->  error: break outside switch or loop

    //4. break can be use along with blocks also.
    
        int x = 10;
        l1:{ //this is how we create a block in java and the name of this block is "l1"
            
            System.out.println("begin");
            if(x==10)
                break l1; //here we used "break with label", which indicates the name of the block that break statement is supposed to get out of.

            System.out.println("end");
        }
        System.out.println("hello");

//BREAK SUMMARY: break can be used in:
        1: Inside switch to avoid fallthrough
        2: Inside loop to break the loop based on some condition 
        3: Inside label block to break label block execution        
        
*/    

//CONTINUE STATEMENT:
/*
    //1. We can use continue statement to skip the current iteration and continue.
       int x = 2;
        for(int i=0; i<10; i++){
            if(i%x==0)
                continue; //exits the current iteration and again goes on to next iteration
            System.out.print(i+" ");
        }

        //Output --> 1 3 5 7 9

    //NOTE -> purpose of continue is "skip the current iteration and continue with the next iteration"
        
    //2. We can use continue only inside loops, if we try to use outside it would result in "CompileTimeError."
        int x=10;
        if(x==10)
        {
            continue;
        }
        System.out.println("Hello");
        
        //Output --> error: continue outside of loop 

//HOW TO USE BLOCK LABELS WITH LOOPS AND USING BREAK STATEMENT TO BREAK OUT OF NESTED LABELLED BLOCK         
        l1:for(;;)
        {
            l2:for(;;)
            {
                l3:for(;;)
                {
                    break; //this will break out of the l3 loop also --> break l3; will do the same
                    break l2; //this will break out of the l2 loop directly
                    break l1; //this will break out of l1 loop so in short it will break out of all the loops.
                }
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i==j)
                    break; //it breaks out of inner for loop when i == j; and no other iterations of that i=x will be executed after i=x=j i.e when i = 0,1,2 = j. 
                System.out.println(i+" .... "+j);
            }
        }
        //Output:
        //1 .... 0
        //2 .... 0
        //2 .... 1
 
        l1: for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i==j)
                    break l1; //at i=0 and j=0 break will be executed and take the cursor out of outer for loop thus no output will be printed.
                System.out.println(i+" .... "+j); //we won't get get unreachability error for this one as at compiler time compiler donesn't know the values of variables i and j.
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i==j)
                    continue; //it stops the current iteration and sends the control to next iteration when i = 0,1,2 and j = 0,1,2 respectively
                System.out.println(i+" .... "+j);
            }
        }
        //Output:--> (it prints when the i!=j)
        //0 .... 1
        //0 .... 2
        //1 .... 0
        //1 .... 2
        //2 .... 0
        //2 .... 1 
       
        l1: for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i==j)
                    continue l1; //it will behave like break; statement as it is stopping the current iteration of outer loop or we can say block l1
                System.out.println(i+" .... "+j);
            }
        }
        //Output:
        //1 .... 0
        //2 .... 0
        //2 .... 1
 
        int x = 0;
        do{
            ++x; //1
            System.out.println(x); //1 4 
            if((x=x+1) < 5) //2
                continue;
            x=x+1;
            System.out.println(x); 
        }while(++x < 10); //3<10 --> YES // actually in my first attempt of the problem I forgot this ++x
*/

// RETURN[in method] --> Later
// System.exit(0) --> Later

//OERATORS IN JAVA:
/*

        //1. Increment and decrement operator
        //2. Arithmetic Operator
        //3. String catenation(Later)
        //4. Relational Operator
        //5. Equality Operator
        //6. instanceof Operator
        //7. shortcircuit Operator
        //8. typecast Operator
        //9. assignment Operator
        //10. conditional operator
        //11. [ ] Operator
        //12. precedence of operator
        //13. evaluation of java operands.

//1. INCREMENT AND DECREMENT OPERATORS
        //a) pre increment --> ++x => first increment it then use it
        int x = 10;
        int y = ++x; //y = 11, x = 11

        //b) post increment --> a++ => first use it then increment it.
        int a = 10;
        int y = x++; //y = 10, x = 11

        //c) post decrement --> m-- => first decrement it then use it.
        int m = 10;
        int n = m++; //n = 10, m = 11

        //d) pre decrement --> --p => first use it then decrement it.
        int p = 10;
        int q = --p; //q = 9, p = 9
    
//EXAMPLES: -> important takeaways are summarized in conclusions later

        int x  = 10;
        int y = 10++; //increment and decrement can be applied on variables but  not on values directly.
        System.out.println(x+" "+y);

        //Output ->  error: unexpected type at int y = 10++;
 
        int x = 10;
        int y = ++(++x); //here (++x) --> 11 and then essentially we are trying ++11 which gives CE
        System.out.println("x = "+x);
        System.out.println("y = "+y);

        //Note - We can't do nesting of increment and decrement operators it would result in compile time error.
        
        //Output ->  error: unexpected type(same as above)

        //using final keyword here

        final int x = 4; //if we make a variable 'final' it's value should not be changed throughout the program, because Compiler will know it's value as compile time constant and if it's changed we get compile time error.

        x++; //here we are trying to change value of a CompileTime constant 
        System.out.println();

        //Note - For a final variable, increment or decrement operations can't be done.

        //Output -> error: cannot assign a value to final variable x

        int x = 10;
        x++;
        System.out.println(x);  //Output -> 11

        char ch = 'a'; //Since there is no typecasting
        ch++; //this will increment by 1 but will keep the result in character format.
        System.out.println(ch);  //Output -> b 

        double d = 10.5;
        d++;
        System.out.println(d);  //Output -> 11.5

        boolean b = true;
        b++; //will throw an CompileError
        System.out.println(b);  //Output -> CompileError

//INTERVIEW QUESTION:
        //Q - What is the difference between b++ and b = b+1?
        //ans - see example:
        byte b = 10;
        b=b+1; //CE : (byte + int --> int), but we are assigning the result to a byte type variable, i.e 
               //b = b+1 is not allowing the loss of precision whereas b++ internally allows typecasting.

        System.out.println(b);

        byte c = 10;
        c++; //NoError, Internally --> JVM evaluates b++ as --> c = (byte)(c+1); i.e. it is typecasting internally to avoid CompileErrors(CE).

        System.out.println(c);

        NOTE - Which is better? --> for greater numbers 'x++' will result in loss of precision because of internal typecasting so, x = x+1; is better for numbers that are greater in magnitude.

//CONCLUSIONS:
        //1. increment or decrement can be applied only on variables, but not on values directly.
        //2. we can't perform nesting of increment or decrement operator, it would result in compile time error.
        //3. For a final variable, increment or decrement operation can't be done.

        //4. we can't apply increment or decrement operator on boolean type, where as it can be applied on other primitive types.

//ARITHMETIC OPERATOR
        //operators -> +, -, *, /, %

        //NOTE -> if we apply arithmetic operator b/w 2 variables then the result type is always:
            // max(int, typeof a, typeof b) --> "such a beauty"

        //byte + byte = int
        //byte + short = int
        //int + double = double
        //char + char = int
        //char + double = double

//EXAMPLES: 
        System.out.println('a' + 'b'); //97+98 = 195
        System.out.println('a' + 1); //98
        System.out.println('a' + 1.2); //98.2

        System.out.println(10/0); // normally int/int => int but when int/int = infinity(mathematiclly) we get ArithmeticExeption in java, because infinity is not available in int type of java.
        //Output -> ArithmeticExeption at run time.

        System.out.println(10/0.0); //normally int/double => double and unlike int in double datatype we have "infinity" available for int/double or double/double or double/int operations.
        //So,
        //Output -> Infinity

        //System.out.println(-10/0.0); //since, -int/double = -double so we get negative infinity
        //Output -> -Infinity

        System.out.println(0/0.0); //in mathematics it's undefined and here even when infinity is available we get:
        //Output -> NaN

        System.out.println(0/0); //int/int => int so here we get ArithmeticException as infinity not available with infinity.
       
        //NOTE -> In integral aithmetic(byte, short, int, long) there is no way to represent "infinite", so reuslt will be "ArithmeticExeption".
        //In case of double, float types, there is a possibility of string "infinity" so the result will be "Infinity".

//SNIPPETS:
    //Q> What will be the result of compiling and executing Test class?

                boolean b = true;
                switch(b) 
                { //switch arg are : byte,short,int,char,String,enum, so it will give CompileError.
                case true:
                    System.out.println("ONE");
                case false:
                    System.out.println("TWO");
                default:
                    System.out.println("THREE");

                }
            A. ONE
               TWO
               THREE
            
            B. TWO
               THREE
            
            C. THREE
             
            D. None of the above options
            
            Answer: D, as Switch doesn't take boolean arguments as in java true and false donot imply to 1 and 0 as in C++.

    //Q>

    for(int i =0; i<=10; i++){
        if(i>6) break;
        System.out.println(i); //CompileError as 'i' is declared in for loop block and it will be erased from memory after control exits from for loop.
    }
    A. 6
    B. 7
    C. 10
    D. 11
    E. Compilation Fails
    F. An Exeption is thrown at runtime

     //Output -> E

    //NOTE -> CompileError means that we don't even get the .class file for jvm to execute.

    //Q> What is the result of compiling and executing Test class?

    byte b1 = 10; //Line n1
    int i1 = b1; //Line n2
    byte b2 = i1; //Line n3 --> here Compiler cannot do implicit typecasting
    System.out.println(b1 + i1 + b2);
    
    A. line n1 causes CompileError
    B. line n2 causes CompileError
    C. line n3 causes CompileError
    D. 30 printed on console

    //Q> What will be the result of compiling and executing the Test class?

        int grade = 75;
        if(grade > 60)
            System.out.println("Congratulations");
            System.out.println("You passed"); //There cannot be a statement between if and else and 
                                                //since this line is not in if statement so it's in 
                                                //between if and else blocks so --> CE
        else
            System.out.println("You failed");
        
        A. Congratulations
        B. Congratulations
            You passed
        C. You failed
        D. copmilation error[misplaced else]

        ANS - D

    //Q> What will be the output of compiling and executing the Test class?
        int x = 2;
        switch (x) {
        default:
            System.out.println("Still no idea what x is");
        case 1:
            System.out.println("x is equal to 1");
            break;
        case 2:
            System.out.println("x is equal to 2");
            break;
        case 3:
            System.out.println("x is equal to 3");
            break;
        }
        A. x is equal to 2 [Answer]
        B. Compilation error
        C. Still no idea what x is
        D. Produces no output
*/
    }
}

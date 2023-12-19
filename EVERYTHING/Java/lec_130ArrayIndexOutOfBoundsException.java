// ArrayIndexOutOfBoundException (exception handling discussed later)

// If we try to access the index which is not in the array range then it would result in an Exception called "ArrayIndexOutOfBoundException"
 
// REFERENCE --> https://chat.openai.com/share/a2354411-817f-475b-89d8-62e1e9c6aff4

public class lec_130ArrayIndexOutOfBoundsException
{
    public static void main(String[] args) 
    {
        int numbers[] = {5,6,7,8};
        //System.err.println(numbers[4]);
        
/*
OUTPUT:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at lec_131ArrayIndexOutOfBoundsException.main(lec_131ArrayIndexOutOfBoundsException.java:12)  
*/

        // How to handle this exception with if else statements (with try catch --> later in exception handling) --> 2 ways

        // 1) Check if the index is within the valid range before accessing the array
        int index = 2;

        if (index >= 0 && index < numbers.length) 
        {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } 
        
        else 
        {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}





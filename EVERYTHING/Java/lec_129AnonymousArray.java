// Anonymous Array - an array without a name is called Anonymous Array i.e we just create an array object for instance use and we are sure that we won't require it anywhere in future.

// these are frequently used to return array from a method

// Array in java is an object which is created in heap and is referred by a variable that is created in stack so to avoid the creation of a variable for such an array that is only useful once we just anonymously pass that that array to a method and then when it is not referenced by any variable from stack it will trigger automatic garbage collection to remove it.

//there is a concept of anonymous object as well so it is similar to anonymous array.

//REFERENCE --> https://chat.openai.com/share/7b2dcca0-ef42-4c6c-b22c-3f19378acf55
// THIS REFERENCE ALSO INCLUDES USE OF "System.err.println()"

//eg:
class Calc
{
    int result;
    public int add(int x, int y)
    {
        result = x+y;
        return result;
    }
    public int add(int[] nums)
    {
        result = 0;
        for(int i:nums) //we can use for loop instead of this for each loop if we don't know the datatype of the array.
        {
            result = result + i;
        }
        return result;
    }
}

public class lec_129AnonymousArray 
{
    public static void main(String []args)
    {
        Calc obj = new Calc();
        int result =  obj.add(5,2);
        System.out.println(result);

        //but I want to pass multiple values without method overloading so I can use an array but if I create a new array for this purpose it will be a wastage of space to make documentation for the name of that array as we have to keep track of that name as well so we will directly pass an array as an anonymous array.

        result = obj.add(new int[]{1,2,3,4,5,6});
        System.err.println(result);
    }
}

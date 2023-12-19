//Array Disadvantages --> tackled using collection framework
//Majorly 2 disadvantages:
// 1) once we create an array the size cannot be increased and decreased
// 2) it stores only homogeneous Data elements (same as C)

public class lec_131ArrayDisadvantages 
{
    public static void main(String[] args) 
    {
        int nums[] = {5,4,6,8,2}; //here we initilized an array by explicitly assigning values to it.
        System.out.println(nums[0]);

        // ********* 1) once we create an array the size cannot be increased and decreased *********

        // int nums[] = new int[5]; 
        // here an array object is initialized in heap memory and all of its value will be default value of int type which is 0 and this array object is referred by a variable nums stored in stack that will store the reference(or address) of whole object.

        // Using both of the above methods to inilialize array object we are creating a fixed sized array in heap whose size cannot be increased or decreased, if we want to increase or decrease size by lets say following methods:
        /*
         nums[5] = 1; this will give ArrayOutOfBoundException
        */

        // How to tackle this:
        // i) Use collection framework (taught later)
        // ii) create a new array(of desired size) and copy the elements of existing array into it.

        // ********* 2) it stores only homogeneous Data elements (not same as C) *********
        // in java array data homogeinity works similar to TYPE CASTING IN JAVA i.e. double can contain int and double type values as double's size is more than int both but int type array cannot contain double (as int size is less than double datatype) or float value (as float and int have same size in 64 bit os but int is smaller than float in 32 bit os).

        int nums1[] = {'a',1,2,3,4}; //this is valid as 'a', a char type value is implicitly typecasted to int 

        double nums2[] = {'a',2,3,4}; //this is also valid as 'a',again a char type value is implicitly typecasted to int 

        double nums3[] = {1.1,2,3,4}; //this is valid but

        //int nums4[] = {"abc",1,2,3,4,5}; //cannot convert string to int but

        //int nums5[] = {1.1,2,3,4,5}; //and
        //float nums6[] = {1.222,3,6,7}; //are not valid as 1.1 is double and cannot be converted to int implicitly and 
                                       //1.222 is double and cannot be converted to float implicitly.
        
        System.out.println(nums1[0]);
        System.out.println(nums2[0]);
        System.out.println(nums3[0]);

        /*
        Java Type Casting

            Type casting is when you assign a value of one primitive data type to another type.

            In Java, there are two types of casting:

                    -> Widening Casting (automatically/implicitly) - converting a smaller type to a larger type size
                        byte -> short -> char -> int -> long -> float -> double

                    * Widening casting is done automatically when passing a smaller size type to a larger size type:
                        eg:
                            public class Main 
                            {
                                public static void main(String[] args) 
                                {
                                    int myInt = 9;
                                    double myDouble = myInt; // Automatic casting: int to double
                                    System.out.println(myInt);      // Outputs 9
                                    System.out.println(myDouble);   // Outputs 9.0
                                }
                            }

                    -> Narrowing Casting (manually/explicitly) - converting a larger type to a smaller size type
                        double -> float -> long -> int -> char -> short -> byte 

                    * Narrowing casting must be done manually by placing the type in parentheses in front of the value:
                        eg:
                            public class Main 
                            {
                                public static void main(String[] args) 
                                {
                                    double myDouble = 9.78d;
                                    int myInt = (int) myDouble; // Manual casting: double to int
                                    System.out.println(myDouble);   // Outputs 9.78
                                    System.out.println(myInt);      // Outputs 9
                                }
                            }
         */
        //THIS HOMOGENEOUS ELEMENT DISADVANTAGE CAN BE TACKLED USING --> wrapper classes, object class etc --> discussed later
    }
}

//ASSIGNMENT SOLUTION --> https://chat.openai.com/share/6a520dc5-3aa2-404a-95c4-ca7947d2fcc2
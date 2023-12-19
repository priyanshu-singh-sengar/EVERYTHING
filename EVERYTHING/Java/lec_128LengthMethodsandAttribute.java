//Length vs length() --> reference --> https://chat.openai.com/share/d97707ea-aa19-4c5f-bc7b-cf7bab06c24a
/*

// length can be used for int[], double[], String[]
// to know the length of the arrays.

// length() can be used for String, StringBuilder, etc
// String class related Objects to know the length of the String

 */
public class lec_128LengthMethodsandAttribute {
    public static void main(String [] args) {
        int nums[] = {3, 4, 5, 6, 6};
        System.out.println("the length of given array is : "+nums.length);

        String name = "Priyanshu";  //String is a class in java and it has methods and one of it's methods is length()
        System.out.println("the length() of given string is : "+name.length());
    }
}

//questions: find outut
/*
1) public class Test {
	public static void main(String[] args)
	{
		// Here str is the array name of String type.
		String[] str = { "GEEKS", "FOR", "GEEKS" };
		System.out.println(str.length);
	}
}
Output:
3

Explanation: Here the str is an array of type string and that’s why str.length is used to find its length.

2) public class Test {
	public static void main(String[] args)
	{
		// Here str[0] pointing to a string i.e. GEEKS
		String[] str = { "GEEKS", "FOR", "GEEKS" };
		System.out.println(str.length());
	}
}
output:
error: cannot find symbol
symbol: method length()
location: variable str of type String[]

Explanation: Here the str is an array of type string and that’s why str.length() CANNOT be used to find its length.

3) public class Test {
	public static void main(String[] args)
	{
		// Here str[0] pointing to String i.e. GEEKS
		String[] str = { "GEEKS", "FOR", "GEEKS" };
		System.out.println(str[0].length());
	}
}
output:
5

Explanation: Here str[0] pointing to String i.e. GEEKS and thus can be accessed using .length()
 */

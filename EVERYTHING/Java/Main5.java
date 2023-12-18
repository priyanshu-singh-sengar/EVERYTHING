//boolean and character data Type

public class Main
{
	public static void main(String[] args) {
	    
	    //BOOLEAN
	    
	   
	    boolean b = true;
	    boolean f = false;
		System.out.println(b+"\n"+f);
		
		//CHARACTER
		
		
		//char - in java char follows UNICODE notation -> it has 2 byte storage space in memory
		// unlike C C++ where we used to follow ASCII code notation, in UNICODE first 128(All) characters
		// are as it is taken from ASCII code i.e. 'A' -> 65 in both UNICODE and ASCII
		// ASCII and UNICODE are formats to store data just like:
		/* base 2 for int and "IEEE single/double precision" for float and double
		
		// some rules:
		/* 1. char can be stored in single inverted commas only i.e. 'A' and not "A"
		   2. char cannot have more than one character at once i.e. 'Aa' is invalid
		*/
		//eg
		char a = 'A';
		char b = "A";
		char c = 'abc'; 
		System.out.println(a);
		System.out.println(b); //gives error : incompatible types: String cannot be converted to char
		                       // "ABC" double inverted commas used to store String type values

		System.out.println(c); //error : unclosed character literal
	}
}
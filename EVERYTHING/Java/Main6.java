// Typecasting and numeric type promotion

public class Main
{
	public static void main(String[] args) {
	    
	    //Implicit typecasting - done by compiler automatically in which a larger datatype(having more bytes)
	    // can fit in smaller datatypes for eg: int(4bytes) can be converted to double(8bytes) but not visa
	    // versa this type of typecasting is call "numeric type promotion" here it's int type promotion to
	    // double type promotion
	    // eg
	    /*
	    int a = 45;
	    double b = a; // b=45.0
	    
		System.out.println(a+"\n"+b); 
		*/
		
		//but 
		
		/*
		double c = 45;
		int d = c;
		
		System.out.println(c+"\n"+d); //error : incompatible types: possible lossy conversion from 
	   	                              // double to int
	   	                              //HERE USE EXPLICIT TYPECASTING
	    */
	    
	    //Explicit typecasting - manually changing the datatype of a variable 
	    /*
		double c = 45;  // c = 45.0
		int d = (int)c; // d = 45 
	    System.out.println(c+"\n"+d); // and it's done
	    */
	    
	    //Why do we need explicit typecasting??
	    // for situations like shown below -
	    int n1 = 12;
	    int n2 = 5;
	    float div = n1/n2; //even after implicitly typecasted the division of 2 integers is truncated i.e
	                       // rounded off to integers only so we need explicit typecasting to get results
	    
	    float div2 = (float) n1/n2; // div2 = 2.4
	    System.out.println(div+"\n"+div2); 
	}
}

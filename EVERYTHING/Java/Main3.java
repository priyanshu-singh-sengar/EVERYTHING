//Do we need to store an expression in default datatype i.e. can I store sum of 2 byte type variables into
//another byte type variable 
//ans - No, we need to store it in default(i.e. int) datatype varible which is default datatype for whole no.

public class Main
{
	public static void main(String[] args) {
	    byte a=10, b=20, sum;
	    short sum2;
	    int sum3;
	    long sum4;
	    
	    // sum = a+b; //a+b is an expression and gives int or long type value in java and we are trying
	                  //to store it in byte type variable so it gives error.
	    // sum2 = a+b;
	    
	    //only below two statements won't give error because of java's design
	    
	    // sum3 = a+b;
	    // sum4 = a+b;
	   
	    System.out.println(sum4);
	}
}

//Whats with Float and Double datatypes?

// by default a variable stores a number in double datatype so to store it in float type we need to add a
// "f" letter at the end of number to make it recognized as float.

public class Main
{
	public static void main(String[] args) {
	    
		//float f=203.56; //this gives error of lousy type conversion failed
		float f = 203.56f;
		double d = 203.56;//as double is default value so no need to add any letters
		
		//double datatype can also store values in exponential format example given below:
        
        double value = 4.9e-324;
        double value2 = 1.7976931348623157e308;
        
		System.out.println(f+"\n"+d+"\n"+value+"\n"+value2+"\n"+Double.MIN_VALUE+"\n"+Double.MAX_VALUE);
	}
	/*In Java, you can find the range of the double data type by accessing its constants defined in the Double
	wrapper class. Specifically, you can use the following constants: 
	
	1.) Double.MIN_VALUE: This constant represents the smallest positive nonzero value that a double can hold. 
	It gives you the lower limit of the range.
    
    2.) Double.MAX_VALUE: This constant represents the largest positive finite value that a double can hold. 
    It gives you the upper limit of the range.
    */
}

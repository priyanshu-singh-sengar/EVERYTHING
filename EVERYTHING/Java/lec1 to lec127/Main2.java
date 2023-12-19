//testing Cyclic property of datatypes(or wrap around condition - is it applicable in java like C language

public class Main2
{
  public static void main (String[]args)
  {
    // byte b=128; // same error listed below
    // short a=65538; // gives error as there is no wrap around condition or overflow condition in java
    //using long datatype
    long num=125l; //you need to add a "l" or "L" after the number to make it recognized by long type
    System.out.println (num);

  }
}

//types of strings in java
// i) immutable String --> non changeable string object (to create this use --> String class)
// ii) mutable String --> changeable string object (to create this use --> StringBuffer or StringBuilder classes)

//REFERENCE --> https://chat.openai.com/share/5444ea85-aaf1-4474-aa0e-84ec22f9dbc8

import java.lang.String;
public class lec_134TypesOfStrings {
    public static void main(String[] args) {
        String name1 = "David"; //Immutable
        StringBuilder name2 = new StringBuilder("David"); //Mutable

        System.out.println(name1);
        System.out.println(name2);

        name1.concat("Goggins"); //concat() method belongs to String class
        name2.append("Goggins"); //append() method belongs to StringBuffer class
        
        System.out.println(name1); //here the name1 string is not changing as it's immutable.
        System.out.println(name2); //here the name2 string is changed as it's mutable.

        //Question --> if String objects are immutable then what happens when we use concat() method??

        //Ans - when we use concat() method like "name1.concat("Goggins")" it will create a new String object with the value "DavidGoggins" (i.e. the value after concatenation of string) in heap memory that is we now have 2 objects one which is "David" referred by name1 and another "DavidGoggins" referred by no variables i.e it is just created in the heap with no reference from stack and since name1 doesn't refer to this newly created object so on printing name1 we get "David" only but if we change the code a little bit and do the following:

        name1 = name1.concat("Goggins"); //here we are reassigning the reference of name1 to newly created object.

        System.out.println(name1); //output - DavidGoggins

        //Question --> assuming above is true then how does append() method work?

        //Ans - append() methods will add the passed string in the already existing StringBuffer object and unlike concat() method it won't create a new object without reference i.e "name2.append("Goggins")" will add the string "Goggins" to already existing object "David" in heap memory.
        
        //Question --> can we append() multiple strings at once?
        //Ans - let's try:
        // name2.append("is","a","Badass"); //this gives error -->The method append(String) in the type StringBuilder is not applicable for the arguments (String, String, String)


        //Question - why we used new keyword(dynamic allocation) for StringBuffer but we used normal allocation without using constructor(or dynamic attocation) for String class??
    }
}

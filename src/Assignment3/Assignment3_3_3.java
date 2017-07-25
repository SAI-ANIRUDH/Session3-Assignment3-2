package Assignment3; // Declaring the Package Compulsory.
/*
 * Program describing Constuctor chaining using Super Key word.
 */

public class Assignment3_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       // calls parameterized constructor 4
        Derived obj = new Derived("test"); // Initializing the class Derived.
 
        // Calls No-argument constructor
        // Derived obj = new Derived();
	}

}
class Base
{
    String name;
 
    // constructor 1
    Base()
    {
        this("");
        System.out.println("No-argument constructor of" + 
                                           " base class");
    }
 
    // constructor 2
    Base(String name)
    {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                                              + " of base");
    }
}
 
class Derived extends Base
{
    // constructor 3
    Derived()
    {
        System.out.println("No-argument constructor " + 
                           "of derived");
    }
 
    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " + 
                           "constructor of derived");
    }
}
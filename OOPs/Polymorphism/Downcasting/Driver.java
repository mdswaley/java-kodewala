package OOPs.Polymorphism.Downcasting;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) // Object obj = new Person("Swaley");
	{
        // The equals() method accepts an Object reference.
        // Object obj = p2;  // Upcasting happens automatically.

        // Downcasting: converting the Object reference into a Person reference.
        // This allows us to access Person-specific members like name.
        Person p = (Person) obj;
        // Compare the names of both Person objects.
        // p.name is "Swaley" and this.name is "MD".
        // Since the names are different, it returns false.
		return p.name.equals(this.name);
	}

}

public class Driver

{
	public static void main(String[] args) 
	{
		Person p1 = new Person("MD"); // one obj on heap.. xyz
		Person p2 = new Person("Swaley"); // another obj on heap add is abc

        // p1.equals(p2) means:
        // this = p1
        // obj = p2 (up-casting to Object)
        // p = (Person) obj (down-casting back to Person)
        // "Swaley".equals("MD") returns false.
		System.out.println(p1.equals(p2)); // false 
	}
}

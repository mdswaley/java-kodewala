package OOPs.Polymorphism.Downcasting;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) // Object obj = new Person("Swaley");
	{
		Person p = (Person) obj; // here we are down-cast Object class to Person class reference
		return p.name.equals(this.name);
	}

}

public class Driver

{
	public static void main(String[] args) 
	{
		Person p1 = new Person("MD"); // one obj on heap.. xyz
		Person p2 = new Person("Swaley"); // another obj on heap add is abc
		System.out.println(p1.equals(p2)); // false 
	}
}

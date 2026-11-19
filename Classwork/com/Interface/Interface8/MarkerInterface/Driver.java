package  com.Interface.Interface8.MarkerInterface;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account1 acc = new Account1("Kodewala Academy", "BTM Bangalore", "78653241456");

//        here you will get exception if you not implement clonable marker interface in Account1 class
//        bcz Account class should not allow to create copy of object without permission of owner of Account class
        Account1 clonedObjOfAcc = (Account1) acc.clone(); // trying to clone(xerox / copy), here we down-cast

//        System.out.println(clonedObjOfAcc.accNo);

//        how JVM know that Account1 class is not implementing clonable interface
		if(acc instanceof Cloneable)
		{
			System.out.println(" true.... allowed to perform the activity...");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}

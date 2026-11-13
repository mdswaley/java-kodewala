package SealedAndPermits;

// sealed and permits are introduce in java 17
public sealed interface Payment permits UPIPayment, CardPayment{
}

// If the sealed class and its permitted subclasses are declared in the same source file,
// Java can identify the subclasses automatically.

sealed class A{

}

final class B extends A{

}

final class C extends A{

}

//sealed = Restricts inheritance. A sealed class restricts which classes can inherit from it.
//         Normally, if a class is not final, any class can extend it.


//permits = Specifies who can inherit. permits specifies the classes that are allowed to directly
//          extend the sealed class.


//final = Stops inheritance. Cannot be inherited further
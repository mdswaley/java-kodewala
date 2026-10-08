package StringClass.Basics;

public class StringConcat {
    public static void main(String[] args) {
        String s = "MD";

        s.concat(" Swaley"); // MD Swaley was created in heap but here we are not provide any reference bcz
        // it will create new object. So later it will be eligible for garbage collector.

        s = s.concat(" Swaley"); // here s is currently pointing to MD Swaley not MD

        String s2 = s.concat(" Swaley");

        System.out.println(s);
        System.out.println(s2);
    }
}


/*
        String Pool
        ┌────────┐
        │ "MD"   │  <- old object, but s no longer points here
        └────────┘


        Heap

        ┌────────────────┐
        │ "MD Swaley"    │ ← s
        └────────────────┘

        ┌───────────────────────┐
        │ "MD Swaley Swaley"    │ ← s2
        └───────────────────────┘
*/
package StringBuilderAndBuffer;

public class StringBuilderEx {
    public static void main(String[] args) {

//        StringBuilder is mutable means we can change.
        StringBuilder sb = new StringBuilder("MD"); // str --> MD in SCP and sb --> MD in heap (str is local variable for StringBuilder constructor)

        sb.append(" Swaley"); // motify sb --> MD Swaley in same location heap and str --> Swaley in SCP (str is local variable for append method)

        System.out.println(sb); // here is 3 object created (2 in SCP and 1 in Heap)

    }
}

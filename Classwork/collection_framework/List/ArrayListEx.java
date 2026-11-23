package collection_framework.List;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
//        Create a container which hold objects
        ArrayList<String> name = new ArrayList<>();

//        Storing the data
//        ArrayList -> contains duplicate, Order is maintained and can contain multiple null values
        name.add("MD");
        name.add("Raaj");
        name.add(null);
        name.add("Raaj");
        name.add("Priya");
        name.add("Vicky");
        name.add(null);

//        Read the data
        System.out.println(name);
    }
}

// why we are not getting address while printing name ?
// bcz AbstractCollection which is parent of ArrayList<>(), is override toString() from Object class

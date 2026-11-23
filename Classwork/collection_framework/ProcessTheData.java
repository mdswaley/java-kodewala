package collection_framework;

public class ProcessTheData {
    public static void main(String[] args) {

//        1. store the price --> container (box) which holds integer value
        int[] price = {100, 340, 400, 200, 1000, 900, 3000, 1400}; // memory --> Heap --> Store to the Database(JDBC)


//        2. process the data --> to find the price above 1000
        for (int i = 0; i < price.length; i++) {
            int currPrice = price[i];

            if (currPrice >= 1000){
                System.out.println(currPrice);
            }
        }
    }
}

// All the application in industry are working
// Get the input from user --> Process the data --> store to the database
//                                              --> get the data from the database --> back to the user
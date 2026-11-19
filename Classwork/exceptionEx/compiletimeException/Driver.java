package exceptionEx.compiletimeException;

/**
 * Checked Exception / Compile time Exception
 * */
public class Driver {
    public static void main(String[] args) {
        String className = "exceptionEx.finallyBlockEx.Driver";

//        Class.forName(className); // forName is checked Exception. so we need to handle it. or else compile give error.

        try {

            Class.forName(className);

//            here IOException and FileNotFoundException are checked exception
//            these are very critical activity. so developer should handle it. That's why compiler force to add try-catch or throw it.
//            we are not catching FileNotFoundException bcz it is subclass of IOException
//            try {
//                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sd"));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }

            System.out.println("class loaded...");

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

// REMEMBER :- Exception always raise at the runtime

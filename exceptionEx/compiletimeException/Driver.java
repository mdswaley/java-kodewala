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

            System.out.println("class loaded...");

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

// REMEMBER :- Exception always raise at the runtime

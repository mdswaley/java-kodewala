package exceptionEx.finallyBlockEx;

public class InvoiceService {
    public static void main(String[] args) {
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.generateInvoice();
    }

    public void generateInvoice() {
        try{
//          connecting DB
            connectingDB();
            String name = "dhs";
            name.indexOf('h');

//         close connection
//        if you close connection here then if exception occur the rest of line in try will not get execute
//            so for that you need to add in both try and as well as in catch

//            REMEMBER :- When JVM crash, or you explicitly shut down the system then finally block will not execute
            System.exit(0);
        } catch (Exception e){
            System.out.println("Some exception occur");
            e.printStackTrace();
        } finally {
            closeConnectionDB();
        }

    }

    public void connectingDB(){
        System.out.println("Connecting with Database...");
    }

    public void closeConnectionDB(){
        System.out.println("Closing connection with Database...");
    }
}

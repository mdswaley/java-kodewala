package CommandLinePractice;

public class CmdLineArgs {
    public static void main(String[] args) {
        if(args.length < 3){
            System.out.println("Please Enter Employee Details.");
            return;
        }

        int empID = Integer.parseInt(args[0]);

        String name = args[1];

        double salary = Double.parseDouble(args[2]);

        System.out.println("Employee ID : "+empID+" name : "+name+" salary : "+salary);
    }
}

// PS C:\Users\mdswa\Desktop\KodeWala(Java)> java javabasics.CmdLineArgs 101 Swaley 50000
// Employee ID : 101 name : Swaley salary : 50000.0
// PS C:\Users\mdswa\Desktop\KodeWala(Java)> 

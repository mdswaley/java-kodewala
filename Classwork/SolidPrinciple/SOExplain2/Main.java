package SolidPrinciple.SOExplain2;

public class Main {
    public static void main(String[] args) {
        ProcessCarModel processCarModel = new ProcessCarModel();

        processCarModel.processModel(new AltoK10());

        processCarModel.processModel(new Swift()); // newly added class
    }
}

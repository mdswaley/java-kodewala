package SolidPrinciple.SOExplain;

public class Main {
    public static void main(String[] args) {
        ProcessTheOrder processTheOrder = new ProcessTheOrder();

        processTheOrder.processingOrder(new VivoV23());

        processTheOrder.processingOrder(new VivoV80New());
    }
}

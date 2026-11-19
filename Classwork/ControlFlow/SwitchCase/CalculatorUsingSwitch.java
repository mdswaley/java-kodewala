package ControlFlow.SwitchCase;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.ch = '+';
        cal.calculationOperation(10, 2);
    }
}

class Calculator{
    char ch;

    public void calculationOperation(int a, int b){
        double res;

        switch (ch){
            case '+':
                res = a + b;
                System.out.println("Sum : "+res);
                break;
            case '-':
                res = a - b;
                System.out.println("Sub : "+res);
                break;
            case '*':
                res = a * b;
                System.out.println("Mul : "+res);
                break;
            case '/':
                res = (double) a / b;
                System.out.println("Div : "+res);
                break;
            default:
                System.out.println("Not a valid input...");
                break;
        }
    }
}

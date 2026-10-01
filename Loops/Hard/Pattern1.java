package Loops.Hard;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;

//        patternStar(n);
//        patternNum(n);
//          patternNum2(n);
        patternNumReverse(n);
    }

    /*
  O/P :-
        *
        **
        ***
        ****
        *****

 */
    private static void patternStar(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

       /*
  O/P :-
        1
        12
        123
        1234
        12345

 */
    private static void patternNum(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
       /*
  O/P :-
        1
        22
        333
        4444
        55555
 */
    private static void patternNum2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void patternNumReverse(int n){
        for (int i = n; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



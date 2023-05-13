package org.example.notations;

public class BigONotation {


    // O(1)
    public static void constantTimeExample(int n){
        System.out.println("Constant time example:" + n);
    }


    // O(logn)
    public static void logarithmicTimeExample(int n){
        for (int i = 1; i < n; i = i * 2){
            System.out.println("Logarithmic time example:" + i);
        }
    }

    // O(n)
    public static void linearTimeExample(int n){
        for (int i = 1; i < n; i++){
            System.out.println("Linear time example:" + i);
        }
    }

    // O(nlogn)
    public static void logLinearTimeExample(int n){
        for (int i = 1; i <= n; i++){      // O(n)
            for (int j = 1; j < n; j = j * 2){   // O(logn)
                System.out.println("Log linear time example:" + i  + "and" + j);
            }
        }
    }

    // O(n^2)
    public static void quadraticTimeExample(int n){
        for (int i = 1; i <= n; i++){      // O(n)
            for (int j = 1; j <= n; j++){   // O(n)
                System.out.println("Quadratic time example:" + i + "and" + j);
            }
        }
    }

    // O(2^n)
    public static void exponentialTimeExample(int n){
        for (int i = 1; i <= Math.pow(2, n); i++ ){
            System.out.println("Exponential time example:" + i);
        }
    }

    // O(n!)
    public static void factorialTimeExample(int n){
        for (int i = 1; i <= factorial(n); i++){
            System.out.println("Factorial time example:" + i);
        }
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++){
            result = result + 1;
        }
        return result;
    }

    // O(2 + 2n + n^2) = O(n^2)
    public static void combinedTimeExample(int n){
        // O(1 + 1)
        System.out.println("Combined time example: " + n);    // O(1)
        System.out.println("Combined time example: " + n);    // O(1)

        // O(n)
        for (int i = 1; i <= n; i++){
            System.out.println("Combined time example: " + i);  // O(n)
        }

        // O(n)
        for (int j = 1; j <= n; j++){
            System.out.println("Combined time example: " + j);  // O(n)
        }

        // O(2n)
        for (int k = 1; k <= n; k++){                           // O(n)
            for (int p = 1; p <= n; p++){
                System.out.println("Combined time example: " + p + "and" + k);     // O(n)
            }
        }

    }

    // O(2n^2) = O(n^2)
    public static void combinedTwoTimeExample(int n){
        // O(n^2)
        for (int i = 1; i <= n; i++){      // O(n)
            for (int j = 1; j <= n; j++){   // O(n)
                System.out.println("Quadratic time example:" + i + "and" + j);
            }
        }

        // O(n^2)
        for (int i = 1; i <= n; i++){      // O(n)
            for (int j = 1; j <= n; j++){   // O(n)
                System.out.println("Quadratic time example:" + i + "and" + j);
            }
        }
    }

    // O(2 + n + m) = O(n + m)
    public static void combinedThreeTimeExample(int n, int m){
        // O(1 + 1)
        System.out.println("Combined time example: " + n);    // O(1)
        System.out.println("Combined time example: " + m);    // O(1)

        //// O(n)
        for (int i = 1; i <= n; i++){
            System.out.println("Combined time example: " + i);  // O(n)
        }

        // O(m)
        for (int j = 1; j <= n; j++){
            System.out.println("Combined time example: " + j);  // O(m)
        }
    }

    // O(n x m)
    public static void combinedFourTimeExample(int n, int m){
        for (int i = 1; i <= n; i++){      // O(n)
            for (int j = 1; j <= n; j++){   // O(m)
                System.out.println("Quadratic time example:" + i + "and" + j);
            }
        }
    }

}

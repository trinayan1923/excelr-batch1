package core_java;
 
    //FibonacciSequence 
public class Demo019 {
        public static void main(String[] args) {
            int numberOfTerms = 10; 
            int[] fibonacciTerms = getFibonacciSequence(numberOfTerms);
    
            // the Fibonacci sequence
            for (int term : fibonacciTerms) {
                System.out.print(term + " ");
            }
        }
    
       
        public static int[] getFibonacciSequence(int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("Number of terms must be greater than zero.");
            }
    
            int[] fibonacci = new int[n];
            if (n >= 1) {
                fibonacci[0] = 0; // First term
            }
            if (n >= 2) {
                fibonacci[1] = 1; // Second term
            }
    
            for (int i = 2; i < n; i++) {        //upto n terms
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
    
            return fibonacci;
        }
    }


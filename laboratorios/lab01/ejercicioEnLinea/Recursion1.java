public class Recursion1 { 
    // Recursion-1 > triangle  
    public int triangle(int rows) {
        if (rows == 0) return 0; // C1
        if(rows == 1) return 1; // C1
        else return triangle(rows - 1) + rows; // C2*T(n - 1) + C3
    }
    // Recursion-1 > Factorial
    public int factorial(int n) {
        if(n == 1 || n == 2) return n; // C1
        else return factorial(n-1)*n; // C2*T(n-1)
    }
    // Recursion-1 > Bunny ears
    public int bunnyEars(int bunnies) {
        if(bunnies == 0) return 0; // C1
        else return bunnyEars(bunnies-1) + 2; // C2*T(n-1) + C3
    }
    // Recursion-1 > bunnyEars2 
    public int bunnyEars2(int bunnies) {
        if(bunnies == 0) return 0; // C1
        if(bunnies % 2 == 0) return bunnyEars2(bunnies - 1) + 3; // C2*T(n - 1) + C3
        else return bunnyEars2(bunnies - 1) + 2; // C2*T(n - 1) + C4
    }
    // Recursion-1 > fibonacci 
    public int fibonacci(int n) {
        if(n == 0) return 0; // C1
        if(n == 1 || n == 2) return 1; // C2
        else return fibonacci(n-2) + fibonacci(n-1); // C3*T(n-1) + C3*T(n-2)
    }
}
class Factorial {

    int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Factorial obj = new Factorial();
        int number = 5;   // constant value
        int result = obj.findFactorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}

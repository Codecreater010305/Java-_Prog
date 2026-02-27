class PositiveNegative {
    int num;

    PositiveNegative(int n) {
        num = n;
    }

    void check() {
        if (num > 0)
            System.out.println("Positive Number");
        else if (num < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative(-5);
        obj.check();
    }
}

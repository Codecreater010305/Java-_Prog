class MaxOfThree {
    int a, b, c;

    MaxOfThree(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        if (a > b && a > c)
            System.out.println("Maximum = " + a);
        else if (b > c)
            System.out.println("Maximum = " + b);
        else
            System.out.println("Maximum = " + c);
    }

    public static void main(String[] args) {
        MaxOfThree obj = new MaxOfThree(10, 20, 15);
        obj.findMax();
    }
}

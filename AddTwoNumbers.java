class AddTwoNumbers {

    int a = 10;
    int b = 20;

    void add() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers(); // object creation
        obj.add();                              // method call using object
    }
}

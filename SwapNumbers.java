class SwapNumbers {
    int num;

    SwapNumbers(int n) {
        num = n;
    }

    void swap(SwapNumbers obj) {
        int temp = num;
        num = obj.num;
        obj.num = temp;
    }

    public static void main(String[] args) {
        SwapNumbers obj1 = new SwapNumbers(10);
        SwapNumbers obj2 = new SwapNumbers(20);

        obj1.swap(obj2);

        System.out.println("After Swapping:");
        System.out.println("Obj1 = " + obj1.num);
        System.out.println("Obj2 = " + obj2.num);
    }
}

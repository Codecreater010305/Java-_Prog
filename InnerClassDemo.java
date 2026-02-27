class Outer {

    class Inner {
        void display() {
            System.out.println("This is an inner class");
        }
    }

    public static void main(String args[]) {
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}

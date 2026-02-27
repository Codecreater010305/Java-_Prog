class CelsiusToFahrenheit {

    double celsius = 25;   // temperature in Celsius

    void convert() {
        double fahrenheit;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }

    public static void main(String[] args) {
        CelsiusToFahrenheit obj = new CelsiusToFahrenheit(); // object creation
        obj.convert();                                      // method call using object
    }
}

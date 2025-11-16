package pract_6;

interface Convertable {
    void convert();
}

class TemperatureConverter implements Convertable {
    private double celsius;

    public TemperatureConverter(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public void convert() {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " °C = " + kelvin + " K, " + fahrenheit + " °F");
    }
}
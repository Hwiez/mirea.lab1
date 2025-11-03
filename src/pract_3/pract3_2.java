package pract_3;

public class pract3_2 {
    public static void main(String[] args) {
        // 1. Создание объектов Double через valueOf()
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.71");

        // 2. Преобразование String к double
        String str = "1.618";
        double d3 = Double.parseDouble(str);

        // 3. Преобразование Double ко всем примитивным типам
        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        double d = d1.doubleValue();
        boolean bool = (d1 != 0);
        char c = (char) d1.intValue();

        // 4. Вывод значения Double
        System.out.println("d1 = " + d1);

        // 5. Преобразование double к строке
        String dString = Double.toString(3.14);
        System.out.println("Строковое представление: " + dString);

        // Дополнительная проверка преобразований
        System.out.println("Преобразования d1:");
        System.out.println("byte: " + b + ", short: " + s + ", int: " + i);
        System.out.println("long: " + l + ", float: " + f + ", double: " + d);
    }
}

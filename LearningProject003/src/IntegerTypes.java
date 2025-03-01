public class IntegerTypes {
    public static void main(String[] args) {

        // byte - 1 byte
        // short - 2 bytes
        // int - 4 bytes
        // long - 8 bytes

        long speed = 300_000;
        long distance = 365 * 24 * 60 * 60 * speed;
//        System.out.println(distance);

        int a = 5;
        a = a + 1;
        a += 1;
        a++;
//        System.out.println(a);  // 8

        byte b = 127;
        b++;    // происходит переполнение, т.к диапазон [-128:127], поэтому выводится -128
        System.out.println(b);

        byte c = 10;
        c = (byte)(c + 10); // явное приведение типов (в правой части находится
        // выражение типа int и мы приводим его к типу byte

        // Необходимо учитывать, чтобы при явном приведении значение укладывалось в диапазон значений
        // другого типа

        // при использовании различных типов данных в выражении результат будет приводиться к наибольшему из
        // используемых типов
        System.out.println(c);
    }
}

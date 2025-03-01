public class Examples {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;

        int c = 1;
        byte d = (byte)c; // напрямую поместить значение переменной "с" с типом данных int в переменную
        // "d" с типом данных byte мы не можем, поэтому используем явное приведение типов
    }
}

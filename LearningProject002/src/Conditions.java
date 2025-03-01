public class Conditions {
    public static void main(String[] args) {
        int temperature = 24;
        if (temperature >= 25) {
            System.out.println("Кондиционер включен");
        } else if (temperature <= 22) {
            System.out.println("Кондиционер выключен");
        } else {
            System.out.println("Кондиционер не работает");
        }
    }
}

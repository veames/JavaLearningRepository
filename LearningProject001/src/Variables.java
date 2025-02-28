public class Variables {
    public static void main(String[] args) {

        // Variables

        int days = 10000;
        int years = days / 365;
        int months = (days % 365) / 30;
        int leftDays = (days % 365) % 30;

        System.out.printf("Years = %d\nMonths = %d\nDays = %d\n", years, months, leftDays);
    }
}

public class Main {

    public static void main(String[] args) {
        int ticketPrice = 10_000; // стоимость билета
        int rubl = 20; // стоимость 1 мили
        int mili = ticketPrice / rubl;
        System.out.println("Количество бонусных миль " + mili);
    }
}

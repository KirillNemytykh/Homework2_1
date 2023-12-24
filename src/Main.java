public class Main {
    public static void main(String[] args) {

        int TicketPrice = 13676; // стоимость билета
        int PriceBonusMile = 20; // стоимость одной бонусной мили

        System.out.println("Количество бонусных миль за полет");
        System.out.println((TicketPrice / PriceBonusMile) + " Бонусные мили");
    }
}
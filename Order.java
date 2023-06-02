package Restaurant;

public class Order {
    public static String title = "Welcome to Connects Coffee Espresso Bar";
    public static void stop3Second() { //돌아가는 메서드
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}

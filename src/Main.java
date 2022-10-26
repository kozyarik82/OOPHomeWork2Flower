public class Main {
    public static void main(String[] args) {
        Flower roza = new Flower(" Роза обыкновенная ", "", " Голландия ", 35.59f,0);
        Flower hrizantema = new Flower(" Хризантема ", "", " ", 19.50f, 10);
        Flower pion = new Flower(" Пион ", "", " Англия ", 69.90f, 1);
        Flower hypsophila = new Flower(" Гипсофила ", "", " Турция ", 19.50f, 10);

        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(hypsophila);

        Bouquet bouquet = new Bouquet(roza, pion, pion, hypsophila, hypsophila);

        System.out.println(" Стоимость букета " + bouquet.getCost() + " простоит " + bouquet.getLifeSpan() + " дней ");

    }

}
public class Main {
    public static void main(String[] args) {
//        Pirate p1 = new Pirate();
//        p1.drinkSomeRum();
//        p1.drinkSomeRum();
//        p1.drinkSomeRum();
//        p1.drinkSomeRum();
//        p1.howsItGoingMate();
//        System.out.println(p1.numberOfDrinks);
//        System.out.println(p1.state);
//        Ship s1 = new Ship();
//        s1.captain.drinkSomeRum();
//        Ship s2 = new Ship();
//        s2.captain.drinkSomeRum();
//        System.out.println(s1.currentScore());
//        s1.currentState();
//        System.out.println(s2.currentScore());
//        s2.currentState();
//        System.out.println(s1.battle(s2));
//        s2.currentState();

        Armada a1 = new Armada("a1");
        a1.printOut();
        Armada a2 = new Armada("a2");
        a2.printOut();
        System.out.println(a1.war(a2));
        a1.printOut();
        a2.printOut();
    }
}

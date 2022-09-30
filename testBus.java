package SA;

public class testBus {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        bus1.board(2);
        bus1.charge(-50);
        System.out.println("주유량 = " + bus1.fuel);
        bus1.busStatus(false);
        bus1.charge(10);
        bus1.currentBus();
        bus1.busStatus(true);
        bus1.board(45);
        bus1.board(5);
        bus1.charge(-55);
        bus1.currentBus();

    }

}

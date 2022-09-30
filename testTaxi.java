package SA;

public class testTaxi {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        System.out.println("taxi1 주유량 = "+taxi1.fuel);
        System.out.println("taxi1 상태 = "+taxi1.status);
        System.out.println("taxi2 주유량 = "+taxi2.fuel);
        System.out.println("taxi2 상태 = "+taxi2.status);



        taxi1.board(2, "서울역", 2);
        System.out.println("상태 = "+ taxi1.status);
        taxi1.charge(-80);
        System.out.println("주유량 = "+taxi1.fuel);
        taxi1.pay();
        taxi1.passenger(5);
        taxi1.board(3, "구로디지털단지역", 12);
        taxi1.charge(-20);
        System.out.println("주유량 = "+taxi1.fuel);
        taxi1.pay();//합계는 18000원인데 가이드라인에는 19000원으로 나와있다.

    }

}
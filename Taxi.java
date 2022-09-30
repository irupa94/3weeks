package SA;

public class Taxi extends transport {

    String destination;
    int distance;
    int maxPass = 4;
    int defaultDistance = 1;
    int defaultCost = 3000;
    int perDistance = 1000;
    static String status = "일반";
    int speed = 0;
    int total = 0;
    int cost;



    public Taxi() {
        this.num = (int)(Math.random()*100+1);

        System.out.println("택시 번호 : "+num);
        drive();
    }

    boolean drive() {
        if (fuel<=10) {
            status = "운행 불가";
            System.out.println("주유 필요");
            return false;
        }

        return true;

    }

    void board(int pass, String dest, int dis) {
        if(status == "일반") {

            if(pass > maxPass)
                System.out.println("최대 승객 수 초과");
            else {

                if(dis==1)
                    cost = defaultCost+ (perDistance*dis);
                else
                    cost = defaultCost+ (perDistance*(dis-1));
                status = "운행중";
                System.out.println("탑승 승객 수 = "+pass);
                System.out.println("잔여 승객 수 = "+ (maxPass-pass));
                System.out.println("기본 요금 확인 = "+defaultCost);
                System.out.println("목적지 = "+dest);
                System.out.println("목적지까지 거리 = "+ dis+"km");
                System.out.println("지불할 요금 = "+cost);
                total += cost;

            }
        }

    }

    int charge(int gas) {
        fuel += gas;
        if(fuel<=10) {
            status = "운행 불가";
        }
        return fuel;

    }

    int pay() {
        status = "일반";
        maxPass = 4;
        if(fuel<=10)
            System.out.println("운행불가");
        System.out.println("누적 요금 = "+ total);

        cost = 0;
        if(fuel<=10)
            System.out.println("주유 필요");
        return total;
    }

    void passenger(int pass) {
        if(pass > maxPass)
            System.out.println("최대 승객 수 초과");

    }

}
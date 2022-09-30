package SA;

public class Bus extends transport{

    int maxPass = 30;		// 최대 승객 수
    int currentPass = 0;	// 현재 승객 수
    int cost = 1000;		// 요금
    // 버스 번호 지정 [고유값으로 생성되어야 되기에 랜덤함수로 함]
    public Bus() {
        this.num = (int)(Math.random()*100+1);
        System.out.println("버스 번호 : "+num);
    }


    boolean busStatus(boolean change) {
        if(change == true)
            status = "운행중";
        else {
            status = "차고지행";
            currentPass = 0;
            maxPass = 30;
        }
        return change;
    }


    void currentBus() {
        System.out.println("상태 = "+status);
        System.out.println("주유량 = "+fuel);
        if(fuel<=10)
            System.out.println("주유 필요");
    }


    void drive() {
        if(fuel >10) {
            System.out.println("남은 기름 : "+ fuel );
            System.out.println("운행 가능");
        }
        else {
            System.out.println("주유가 필요합니다");
            System.out.println("운행 불가 = 차고지행");
            status = "차고지행";
        }
    }

    // 주유량
    int charge(int gas) {
        fuel += gas;
        if(fuel<=10) {
            status = "차고지행";
        }
        return fuel;

    }


    boolean available() {
        return maxPass >= currentPass;
    }

    int board(int pass) {
        if(pass >= (maxPass-currentPass))
            System.out.println("최대 승객 수 초과");
        else {
            if(available()) {
                currentPass += pass;
                System.out.println("탑승 승객 수 = "+pass+"명");
                System.out.println("잔여 승객 수 = "+(maxPass-currentPass)+"명");
                System.out.println("요금 확인 = "+(cost*pass));
            }
            if(!available()) {
                System.out.println("최대 승객 수 초과");
            }
        }
        return currentPass;

    }
}


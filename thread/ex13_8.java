public class ex13_8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        // 현재 스레드는 3개
        // main 스레드, th1 스레드, th2 스레드
        th1.start();
        th2.start();

        delay(2 * 1000);
        System.out.print("<<main 종료>>");
    }
        static void delay(long millis){
            try{
                // th1을 2초동안 잠자게?
                // 아니다! main 스레드가 잠든다.
                // 2초뒤에 main 종료가 출력된다.
                // th1.sleep(2000);

                // 따라서 클래스 이름인 Thread를 써줘야한다.
                Thread.sleep(millis);
            }catch(InterruptedException e){}
        }
    }


class ThreadEx8_1 extends Thread{
    public void run(){
        for(int i=0; i<300; i++) System.out.print("-");
        System.out.print("<<th1 종료>>");
    }
}

class ThreadEx8_2 extends Thread{
    public void run(){
        for(int i=0; i<300; i++) System.out.print("|");
        System.out.println("<<th2 종료>>");
    }
}

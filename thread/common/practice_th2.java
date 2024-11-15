package common;

//다음 코드의 실행결과 유추하기
//01234567890123456789
public class practice_th2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        //start() 대신 바로 run()? -> 멀티스레드x
        //main스레드와 run스레드가 싱글 스레드로 동작
        t1.run();

        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}

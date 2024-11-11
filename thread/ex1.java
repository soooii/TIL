public class ex1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r); // 생성자 Thread(Runnable Target)

        t1.start();
        t2.start();
    }
}

// 1. Thread를 상속해서 쓰레드를 구현
class  ThreadEx1_1 extends Thread {
    public void run() { // 쓰레드가 수행할 작업을 작성
        for(int i=0; i<5; i++){
            // 조상인 Thread의 getName() 호출
            System.out.println(this.getName());
        }
    }
}

// 2. Runnable 인터페이스를 구현해서 쓰레드를 구현
class ThreadEx1_2 implements Runnable {
    public void run() { // 쓰레드가 수행할 작업을 작성
        for(int i=0; i<5; i++){
            //Thread.currentThread() - 현재 실행중인 Thread 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}

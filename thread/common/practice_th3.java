package common;
// 6초 후 스레드가 지체없이 정지되도록 코드를 변경하시오
/*
practice_th3.stopped의 값이 바뀌어도 for문내의
Thread.sleep(3*1000); 문장에 의해 일시정지 상태에 있는 경우,
시간이 지나서 일시정지 상태를 벗어날 때까지 for문을 벗어날 수 없기 때문에
이런 현상이 발생한다
 */
public class practice_th3 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try{
            Thread.sleep(6*1000);
        }catch (Exception e){}

        stopped = true;
        //th1.interrupt(); //추가
        System.out.println("stopped");
    }
}

class Thread5 extends Thread{
    public void run(){
        for(int i=0; !practice_th3.stopped; i++){
            System.out.println(i);
            try{
                Thread.sleep(3*1000);
            }catch (Exception e){}
        }
    }
}

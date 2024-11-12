import javax.swing.*;

// 멀티 쓰레드 - 입력과 카운트다운 작업이 분리되어있다.
// 입력하는 동안 다른 작업이 수행될 수 있다.
public class ex13_5 {
    //A
    public static void main(String[] args) {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은" + input + "입니다.");
    }
}

//B
class ThreadEx5_1 extends Thread {
    public void run() {
        for(int i=10; i>0; i--){
            System.out.println(i);
            try{
                sleep(1000);
            }catch (Exception e){}
        }
    }
}

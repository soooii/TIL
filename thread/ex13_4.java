import javax.swing.*;

// 싱글 쓰레드 - 입력 전까지는 다른 작업 진행 못하고 멈춰있음
public class ex13_4 {
    public static void main(String[] args) {
        // A (입력)
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

        // B
        for(int i=10; i>0; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000); // 1초간 시간을 지연한다.
            }catch (Exception e){}
        }
    }
}

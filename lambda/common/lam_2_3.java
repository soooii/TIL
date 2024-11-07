package common;

import java.util.Scanner;
import java.util.function.Consumer;

public class lam_2_3 {
    // 3.출력기
    // 입력된 이름을 콘솔에 출력하는
    // Consumer<String> 타입의 람다식을 작성하세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Consumer<String> c = i -> System.out.println(i);
        // 주어진 객체를 받아서 처리하지만,
        // 그 처리 결과를 반환하지 않기 때문에 "소비한다"로 표현
        c.accept(name);
    }
}

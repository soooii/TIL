import java.util.Random;

public class practice_str4 {

    //4.임의의 로또번호(1~45)를 정렬해서 출력하시오.
    public static void main(String[] args) {
        new Random()
                .ints(1,46)
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);

    }
}

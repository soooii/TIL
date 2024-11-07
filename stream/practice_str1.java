import java.util.Arrays;
import java.util.stream.IntStream;

public class practice_str1 {

    //1. 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
    public static void main(String[] args) {
        IntStream.rangeClosed(1,6)
                .boxed()
                .flatMap(num1 -> IntStream.rangeClosed(1,6)
                        .boxed()
                        .map(num2->new Integer[] {num1,num2}))
                .filter(arr -> arr[0]+arr[1] == 6)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));
    }

    // IntStream은 기본 타입인 int를 처리하는 스트림이므로,
    // 객체 배열(Integer[])을 다루기 위해서는 Stream<Integer[]>으로
    // 변환(boxed)한 후 배열을 객체로 다뤄야 함.





}


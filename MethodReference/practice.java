import java.util.function.Function;
import java.util.function.Supplier;

public class practice {
    public static void main(String[] args) {
        // 1.매개변수 x
        // Supplier는 입력 X, 출력 O
        // Supplier<MyClass> s = () -> new MyClass();
        // 클래스이름::메서드이름
        // 해당 예제는 메서드 없지만 연산자 new
        // Supplier<MyClass> s2 = MyClass::new;
        // MyClass m = s.get();
        // System.out.println(m);
        // System.out.println(s.get());

        // 2.매개변수 1개
        // Function<Integer,MyClass> f = (i) -> new MyClass(i);
        Function<Integer,MyClass> f = MyClass::new;
        MyClass m = f.apply(100);
        System.out.println(m);
        System.out.println(m.iv);
        System.out.println(f.apply(200).iv);

        // 3.배열 (배열의 길이를 줘야함)
        // Integer가 배열길이
        // Function<Integer, int[]> f2 = (i) -> new int[i];
        Function<Integer,int[]> f2 = int[] :: new; //메서드 참조
        int[] arr = f2.apply(100);
        System.out.println(arr.length);
        System.out.println(f2.apply(100).length); //배열 길이



    }
}

class MyClass{
    int iv;
    MyClass(int iv) {
        this.iv = iv;
    }
}

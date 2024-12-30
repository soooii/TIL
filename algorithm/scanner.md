# 😊 오늘 공부한 내용

### Scanner
- import java.util.* 필요

---

### 사용법 예제

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        sc.nextLong();
        sc.nextFloat();
        sc.nextDouble();
        sc.nextBoolean();
        
        sc.next(); // String형 공백 기준으로 읽음
        sc.nextLine(); // String형 개행 기준 한 줄 읽음
    }
}

```

💡sc.nextInt() 후에 sc.nextLine()을 사용하기위해서는 그 전에 sc.nextLine()을 추가해줘야 함~
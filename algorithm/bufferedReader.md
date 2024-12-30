# 😊 오늘 공부한 내용

### BufferdReader
- Scanner와 유사
- Enter 기준 경계 인식
- import java.io.* 필요 
- throws IOException 처리 필요

---

### 사용법 예제

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
    }
}

```

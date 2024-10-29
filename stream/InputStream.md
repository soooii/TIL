# 😊 오늘 공부한 내용
### IO(입출력 스트림)
- 데이터 입출력 - [java.io](http://java.io) 패키지 제공

---

### 바이트(byte) 기반 스트림
- 데이터를 컴퓨터 기본 단위인 **byte 단위**로 나누어 읽거나 씀
- **모든 타입의 데이터** 가능
- 주요 클래스:
    - `InputStream`
    - `OutputStream`

### 문자(char) 기반 스트림
- **텍스트 기반 문서**를 다루기 위해 사용
- **문자 데이터만** 처리 가능
- 주요 클래스:
    - `Reader`
    - `Writer`
---

### 바이트 기반 스트림

##### `InputStream`
- 바이트 입력 스트림의 **최상위 클래스**
- 모든 바이트 입력 스트림 클래스들은 `InputStream`을 상속하여 구현됨
- 다양한 **개발 목적에 따라** 적합한 스트림 클래스를 선택하여 사용

##### 주요 메서드
- **`int read()`**
    - 문자를 **1 byte씩 읽어 반환**
    - 더 이상 읽을 문자가 없으면 `-1` 반환

- **`int read(byte[] b)`**
    - 주어진 배열 `b`에 읽은 문자를 저장
    - 실제로 읽은 바이트 수를 반환

- **`int read(byte[] b, int offset, int len)`**
    - 주어진 배열 `b`에 **정해진 범위만큼** 읽어서 저장
    - `offset`(시작 위치)과 `len`(읽을 길이) 지정 가능

- **`int available()`**
    - 현재 **스트림에서 읽어올 수 있는 데이터의 크기**를 반환

- **`void close()`**
    - 스트림 사용을 종료하여 **자원 해제**

---

# FileInputStream
- **파일에서 바이트 단위로** 데이터를 읽어들이기 위해 사용하는 스트림

    ```java
    new FileInputStream("경로/파일명");
    ```

---

## read() vs read(byte[] b)

- **`read()`**
    - **1 byte씩** 데이터를 읽어들임

- **`read(byte[] b)`**
    - 배열을 사용하여 **한 번에 여러 개의 데이터**를 가져옴
    - **반복 횟수를 줄이고 파일 읽기 속도를 향상**시킴

---
## 실습

### read() 이용 코드 실습해보기
```java
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ex {
    public static void main(String[] args) {
        int read=0;

        InputStream in = null;

        try{
            in = new FileInputStream("my_file.txt");
            while(true){
                read = in.read(); // 파일 읽기

                if(read == -1){ //끝
                    break;
                }
                System.out.print((char)read); //문자 하나씩
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
```
### read(byte[] b) 이용 코드 실습해보기
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//바이트 배열씩 읽기
public class ex2 {
    public static void main(String[] args) {
        int read=0; // 파일 읽어올 변수
        InputStream in = null; // 스트림 선언
        byte[] buffer = new byte[5]; // 데이터 담을 배열
        try{
            in = new FileInputStream("my_file.txt");
            while(true){
                // buffer(배열에 읽은 문자 저장)
                // read(읽은 수 만큼 크기 반환)
                // buffer크기만큼 읽는다
                read = in.read(buffer);
      
                if(read==-1){
                    break;
                }
                //buffer에 정해진 범위만큼 읽어서 저장
                System.out.print(new String(buffer,0,read));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
```

---
## 🤔 어려웠던 점
- read(byte[] b) 실습 코드를 작성하면서 구조를 이해하는 것이 어려웠다.
- 특히 read = in.read(buffer) 부분은 buffer만만큼 파일을 읽어서 read에 읽은 수의 크기를 반환하는데, read가 buffer 크기보다 작게 반환되는 경우에는 남은 데이터를 다 읽었거나 파일의 끝에 도달했다는 것을 알려준다는 것을 새롭게 알게되었다.

## 😌 느낀점
- 다음에는 OutputStream을 공부할 것이다. 입출력 구조를 이해하면서 Java랑 더 가까워보자!

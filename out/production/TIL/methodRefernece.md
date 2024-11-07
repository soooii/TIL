# 😊 오늘 공부한 내용

---

### 메서드 참조
- 람다식을 더 간단히 만든 것
- 클래스 이름 `::` 메서드 이름

💡 메서드 참조가 이해가 안된다면 람다식으로 바꿔보자

```java
// String과 Integer은 각각 입력과 출력
Function<String, Integer> f = (String s) -> Integer.parseInt(s);

// 메서드 참조 (클래스이름 :: 메서드이름)
// 함수형 인터페이스에 입력의 정보가 있기 때문에 없어도 된다
Function<String, Integer> f = Integer::parseInt;

```
---

### 생성자와 메서드 참조
1. **매개변수가 없는 경우**
    - `Supplier<MyClass> s = () -> new MyClass();`
    - `Supplier<MyClass> s = MyClass::new;`

2. **매개변수가 1개인 경우**
    - `Function<Integer, MyClass> s = (i) -> new MyClass(i);`
    - `Function<Integer, MyClass> s = MyClass::new;`

3. **매개변수가 2개인 경우**
    - `BiFunction<Integer, Integer, MyClass> s = MyClass::new;`
    - `BiFunction<첫번째 매개변수 타입, 두번째 매개변수 타입, 반환타입>`

---

### 배열 생성과 메서드 참조
- **람다식**
    - `Function<Integer, int[]> f = x -> new int[x];`

- **메서드 참조** (Integer는 배열의 길이)
    - `Function<Integer, int[]> f2 = int[]::new;`

---

### 참고
- [자바의 정석 - 기초편] ch14-13,14 메서드 참조, 생성자의 메서드 참조 https://www.youtube.com/watch?v=I55ALQndw50
- [Java] BiFunction 인터페이스 사용 방법 https://developer-talk.tistory.com/716
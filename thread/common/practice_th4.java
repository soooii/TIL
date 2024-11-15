package common;

/*
동물원에 동물 3마리가 있다.
각 동물은 울음소리가 다르고 2마리의 동물은 동시에 운다.
나머지 1마리 동물은 2마리 동물이 모두 울고나서 마지막에 운다.
클래스는 총 2개를 사용하고 하나의 클래스에는 main 메서드가 있다.
Runnable 인터페이스로 멀티스레드를 구현하고 반드시 join을 사용한다.
- 각 동물은 10번씩만 운다.
 */
public class practice_th4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Animal("동물1"));
        Thread t2 = new Thread(new Animal("동물2"));
        Thread t3 = new Thread(new Animal("동물3"));

        t1.start();
        t2.start();

        //main스레드가 t1,t2가 모두 종료될 때까지 기다린다.
        t1.join();
        t2.join();

        t3.start();
        t3.join();



    }
}

class Animal implements Runnable{
    private String animal;

    public Animal(String animal){
      this.animal = animal;
    }

    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(animal);}
    }
}

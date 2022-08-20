package lec12.java;

import lec12.Person;

public class JavaMain {
    public static void main(String[] args) {

        // 이름없는 동행 클래스는 Companion으로 호출해야한다.
        Person.Factory.newBaBy("ABC");

        Person.newBaBy("ABC");
    }
}

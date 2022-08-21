package lec16.java;

import lec11.StringUtilsKt;
import lec16.확장함수Kt;

public class JavaMain {

    public static void main(String[] args) {
        // 자바에서 코틀린의 확장함수 사용
        char abc = 확장함수Kt.lastChar("ABC");
        System.out.println("abc = " + abc);
    }
}

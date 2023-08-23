package chapter09;

import java.util.stream.Stream;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {

    int i = 3;
    String s = "";

    try {
      System.out.println(s.length());
      int res = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } catch (NullPointerException e) {
      System.out.println("문자열의 내용이 없습니다.");
    }finally {
      System.out.println("프로그램 종료");
    }
  }
}

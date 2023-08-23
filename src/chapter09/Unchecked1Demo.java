package chapter09;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Unchecked1Demo {
  public static void main(String[] args) {
    String s = "Time id money";
    StringTokenizer st = new StringTokenizer(s);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken()); //1회성이라 더 할 수 없음
    }
//    System.out.println(st.nextToken());
//    >> NoSuchElementException
  }
}

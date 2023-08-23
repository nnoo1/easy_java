package chapter08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";
    StringTokenizer st = new StringTokenizer(s);
    System.out.println(st);
    System.out.println(st.countTokens()); //공백

    StringTokenizer st1 = new StringTokenizer(s, ",");
    System.out.println(st1.countTokens());

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

  }
}

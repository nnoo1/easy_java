package chapter09;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    ArrayList nums = new ArrayList();
    nums.add(10); //Intefer로 10이 오토박싱
    nums.add(3.14); //Double로 3.14가 오토박싱
    nums.add("30");
    nums.add("hello");


    //배열이 아니라 포이치 안됨
    for (int i = 0; i < nums.size(); i++) {
      if(nums.get(i)instanceof Integer)
        System.out.println((Integer)(nums.get(i))*2);
      else if (nums.get(i)instanceof Double)
        System.out.println((Double) (nums.get(i)) * 2);
//    else
//      System.out.println("숫자타입이 아닙니다.");
      else if (nums.get(i)instanceof System)
        System.out.println(Integer.parseInt((String)nums.get(i)));
    }

  }
}

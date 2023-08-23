//package chapter09;
//
//import java.util.ArrayList;
//
//public class GenericTest2 {
//  public static void main(String[] args) {
//    int i = 30;
//
//    ArrayList nums = new ArrayList<>();
//    nums.add(10); //Intefer로 10이 오토박싱
////    nums.add(3.14); //컴파일시 타입체크하므로 Integer가 아닌 원소는 추가할 수 없음
////    nums.add("30");
////    nums.add("hello");
//
//    for (int i = 0; i < num.size(); i++) {
//      System.out.println((nums.get(i))*2);
//    }
//    String s = "world";
//    //사용할 때 타입을 정해준다
//    ArrayList<String> strs = new ArrayList<>();
//    strs.add("hello");
//    strs.add(s);
//    strs.add("");
//    strs.add(null);
//
//
//    for (int i = 0; i < nums.size(); i++) {
//      String getStr = strs.get(i);
//      if (getStr != null) {
//        System.out.println(getStr.length());
//      } else {
//        System.out.println("아무것도 없습니다.");
//      }
//    }
//
//  }
//}

package test_ch9;

public class ActionExample {
  public static void main(String[] args) {
    Action action = new Action() {
      @Override
      public void work() {
        System.out.println("복사를 합니다.");
      }
    };
      action.work();
  }
}

//하나의 파일에 작성하려면 public을 없애야함
interface Action {
  public void work();
}
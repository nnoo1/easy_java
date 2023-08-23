package chapter09;


public class GenericMethodDemo {
  public static void main(String[] args) {
    Integer[] ia = {1, 2, 3, 4, 5,};
    Character[] ca = {'a', 'b', 'c', 'd', 'e'};
    Box[] ba = {new Box(), new Box()};
    ba[0].set(10);
    ba[1].set(20);

    Utils.showArray(ia);
    Utils.showArray(ca);
    Utils.showArray(ba);

    System.out.println(Utils.getLast(ia));
    System.out.println(Utils.getLast(ca));


  }
}

class Utils {
  static <T> void showArray(T[] array) {
//   System.out.println(Arrays.toString(array));
    for (T t : array) {
      System.out.printf("%s ",t);
    }
    System.out.println("");
  }

//  static void showArray(Character[] array) {
//    System.out.println(Arrays.toString(array));
//  }

  static <T> T getLast(T[] array) {
    return array[array.length-1];
  }

}

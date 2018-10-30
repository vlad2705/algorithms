package search;

public class Search {
  public static void linearSearch(int[] lst, int v) {
    for (int i = 0; i < lst.length; i++) {
      if (lst[i] == v) {
        System.out.println("found! It is at " + i);
        return;
      }
    }
    System.out.println("the element is not in the array");
  }
}

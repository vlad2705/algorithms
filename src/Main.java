import search.Search;
import sort.Sort;

public class Main {
  public static void main(String[] args) {
    int[] lst = {4, 9, 7, 1, 3, 6, 5};
    Sort.selectionSort(lst);
    Search.linearSearch(lst, 5);
  }
}

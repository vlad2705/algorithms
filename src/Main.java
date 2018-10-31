import search.Search;
import sort.Sort;

public class Main {
  public static void main(String[] args) {
    int[] lst1 = {4, 9, 7, 1, 3, 6, 5};
    Sort.selectionSort(lst1);
    Search.linearSearch(lst1, 5);
    Sort.bubbleSort(lst1);
    Sort.mergeSort(lst1);
  }
}

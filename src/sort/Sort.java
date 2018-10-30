package sort;

import java.util.Arrays;

public class Sort {
  public static void selectionSort(int[] lst) {
    for (int i = 0; i < lst.length - 1; ++i) {
      int indexOfMinValue = getIndexOfMinValue(i, lst);
      swap(i, indexOfMinValue, lst);
    }
    System.out.println(Arrays.toString(lst));
  }
  
  private static int getIndexOfMinValue(int startIndex, int[] lst) {
    int smallest = lst[startIndex];
    int index = startIndex;
    for (int j = startIndex + 1; j < lst.length; ++j) {
      if (lst[j] < smallest) {
        smallest = lst[j];
        index = j;
      }
    }
    return index;
  }
  
  private static void swap(int firstIndex, int secondIndex, int[] lst) {
    int tmp = lst[firstIndex];
    lst[firstIndex] = lst[secondIndex];
    lst[secondIndex] = tmp;
  }
}

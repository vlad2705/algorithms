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
  
  public static void bubbleSort(int[] lst) {
    boolean swapped;
    do {
      swapped = false;
      for (int i = 0; i < lst.length - 1; ++i) {
        if (lst[i] > lst[i + 1]) {
          swap(i, i + 1, lst);
          swapped = true;
        }
      }
    } while (swapped);
    System.out.println(Arrays.toString(lst));
  }
  
  public static int[] mergeSort(int[] lst) {
    if (lst.length < 2) return lst;
    int[] left, right;
    if (lst.length % 2 == 0) {
      left = new int[lst.length / 2];
      right = new int[lst.length / 2];
    } else {
      left = new int[lst.length / 2];
      right = new int[lst.length / 2 + 1];
    }
    for (int i = 0; i < lst.length; ++i) {
      if (i < lst.length / 2) {
        left[i] = lst[i];
      } else {
        right[i - lst.length / 2] = lst[i];
      }
    }
    left = mergeSort(left);
    right = mergeSort(right);
    lst = merge(left, right);
    System.out.println(Arrays.toString(lst));
    return lst;
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
  
  private static int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int i = 0, j = 0, index = 0;
    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        result[index++] = left[i++];
      } else{
          result[index++] = right[j++];
      }
    }
    while (i < left.length) {
      result[index++] = left[i++];
    }
    while(j < right.length) {
      result[index++] = right[j++];
    }
    return result;
  }
}

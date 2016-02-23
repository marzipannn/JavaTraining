/**
 * Created by Cinnamon on 2/23/16.
 */
public class Sort {

    private String stringArray[];

    private void swapElements(int a, int b) {
        String aux;

        aux = stringArray[a];
        stringArray[a] = stringArray[b];
        stringArray[b] = aux;
    }

    private int partition(int low, int high) {
        String pivotElem = stringArray[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i = i + 1;
            } while (stringArray[i].compareTo(pivotElem) < 0);
            do {
                j = j - 1;
            } while (stringArray[j].compareTo(pivotElem) > 0);
            if (i >= j)
                return j;
            swapElements(i, j);
        }
    }

    private void quicksort(int low, int high) {
        int pivot;

        if (low < high) {
            pivot = partition(low, high);
            quicksort(low, pivot);
            quicksort(pivot + 1, high);
        }
    }

    public void qsort(String strings[]) {
        stringArray = strings;
        quicksort(0, strings.length - 1);
    }

    public static void main(String a[]){

        String[] s = {"Z", "012", "this", "is", "an", "array", "of", "strings"};
        System.out.println("BEFORE SORT:");
        for (String str : s) {
            System.out.println(str);
        }
        Sort sorter = new Sort();
        sorter.qsort(s);
        System.out.println("AFTER SORT:");
        for (String str : s) {
            System.out.println(str);
        }
    }
}
package _java._se._01._array;

public class FindMax {
    public static void main(String[] args) {
        int a[] = {5, 10, 0, -5, -16, -2};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }

        System.out.println("Max= " + max);
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

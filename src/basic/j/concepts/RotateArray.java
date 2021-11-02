package basic.j.concepts;

import java.util.Scanner;

public class RotateArray {

    /*
    algorithm - given a k ,  split the array by k and then reverse both the parts
    and then reverse the entire array to get the rotation by k
     */

    //i starting index and j is ending
    public void reverse(int[] a, int i,int j) {
      int li = i;
      int ri = j;
      while (li < ri) {
          int temp = a[li];
          a[li] = a[ri];
          a[ri] = temp;

          li++;
          ri--;
      }

    }

    public void rotate (int[] a ,int k) {

        k = k % a.length;
        if (k < 0) {
            k = k+a.length;
        }
        //part 1 - split
        reverse(a,0,a.length - k - 1);
        //part 2
        reverse(a, a.length - k, a.length - 1);

        //reverse the entire array
        reverse(a,0,a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[scanner.nextInt()];
        Scanner scanner1 = new Scanner(System.in);

        for (int i = 0 ; i < a.length ; i++) {
            a[i] = scanner1.nextInt();
        }

        RotateArray rotateArray = new RotateArray();
         rotateArray.rotate(a,3);


    }
}

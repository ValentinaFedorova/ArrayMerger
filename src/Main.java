import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = new int[] { 5,7,7,8,15};
        int[] arr2 = new int[] { 1,1,2,4,6,7,9,10,18,19,20};
        int flag1 = 0;
        int flag2 = 0;

        int [] newarr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length+arr2.length; i++) {
            if (arr1[flag1]<arr2[flag2]){
                newarr[i] = arr1[flag1];
                flag1 = flag1 + 1;
                if (flag1 >= arr1.length){
                    System.arraycopy(arr2,flag2,newarr,i+1,arr2.length-flag2);
                    break;
                }
            }
            else {
                newarr[i] = arr2[flag2];
                flag2 = flag2 + 1;
                if (flag2 >= arr2.length){
                    System.arraycopy(arr1,flag1,newarr,i+1,arr1.length-flag1);
                    break;
                }
            }

        }
        for (int j = 0; j < newarr.length; j++) {
            System.out.print(newarr[j]+" ");

        }
    }





}

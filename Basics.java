import java.util.Arrays;
import java.util.ArrayList;


public class Basics {
    public static void main(String[] args) {
        // printNumbers();
        // printOddNumbers();
        // System.out.println(sigmaSum(255));

        // int[] arr1 = {1,2,3,4,5,6,7};
        // int[] arr2 = {-2,5,0,-3,12,8};
        // iterateArr(arr1);
        // findMax(arr2);
        oddArray(255);

    }
        public static void printNumbers() {
            for (int i = 1; i<= 255; i++){
                System.out.println(i);
            }
        }

                public static void printOddNumbers() {
            for (int i = 1; i<= 255; i+=2){
                System.out.println(i);
            }
        }

            public static int sigmaSum(int num) {
            int sum = 0;
            for (int i = 1; i<= num; i++){
                sum = sum + i;
            }
            return sum;
        }

        public static void iterateArr (int[] inputArr) {
            for (int i = 0; i<inputArr.length; i++){
                    System.out.println(inputArr[i]);
            }
        }

        public static void findMax(int[] inputArr){
            int maxValue = inputArr[0];
            for (int i = 1; i<inputArr.length; i++){
                if(inputArr[i] > maxValue) {
                    maxValue = inputArr[i];
                }
            }
            System.out.println(maxValue);
        }

        public static void oddArray(int num){
            ArrayList<Integer> y = new ArrayList<Integer>();
                for (int i = 1; i<= 255; i+=2){
                y.add(i);
            }
            System.out.println(y);
        }
}
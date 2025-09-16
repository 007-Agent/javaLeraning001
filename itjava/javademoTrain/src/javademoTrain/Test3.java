package javademoTrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        // String text = "An apple a day keeps an aardvark away from ants and
        // applesauce";

        // String[] arr = text.split(" ");
        // List<String> result = new ArrayList<>();
        // for(String s : arr){
        // if(!s.isEmpty() && s.indexOf('a') != -1){
        // result.add(s);
        // }
        // }
        // System.out.println(Arrays.toString(result.toArray()));

        // ------------------------------------------------------------

        // int[] arr = {1, 2, 3, -4, 5};

        // boolean allPositive = true;

        // for (int i = 0; i < arr.length; i++){
        // if(arr[i] < 0){
        // allPositive = false;
        // }
        // }
        // System.out.println(allPositive);

        // -----------------------------------------------------------

        // int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {4, 5, 6, 7, 8};

        // Set<Integer> commonElements = new HashSet<>();

        // for (int num1 : arr1) {
        // for (int num2 : arr2) {
        // if (num1 == num2) {
        // commonElements.add(num1);
        // break;
        // }
        // }
        // }

        // System.out.println("Общие элементы:");
        // for (int elem : commonElements) {
        // System.out.println(elem);
        // }

        // ---------------------------------------------------------------------

        // int[] arr = { 123, 1000, -999, 10000, 45, -12345, 0 };

        // for (int num : arr) {
        //     String str = String.valueOf(Math.abs(num));
        //     if (str.length() > 3) {

        //         System.err.println(num);
        //     }
        // }

        // ------------------------------------------------------------


        // String str = "12,34,56";
        // String[] parts = str.split(",");
        
        // int sum = 0;
        
        // for (String part : parts) {
        //     sum += Integer.parseInt(part.trim());
        // }
        
        // System.out.println("Сумма: " + sum);

        // ---------------------------------------------------------------------

        //  int num = 123789;

        //   String str = String.valueOf(num);
        //    StringBuilder result = new StringBuilder();
        //   for(char c : str.toCharArray()){
        //         if(c % 2 == 1){
        //             result.append(c);
        //         }
        //   }
        //   int[] array = new int[result.length()];
        //   for(int i = 0; i < array.length; i++){
        //     array[i] = result.charAt(i) - '0';
        //   }
        //  System.out.println(Arrays.toString(array));

        // --------------------------------------------------------------------

        // String str = "abc123def";
        // int position = -1; 
        // for (int i = 0; i < str.length(); i++) {
        //     char c = str.charAt(i)
        //     if (Character.isDigit(c)) {
        //         position = i; 
        //         break; 
        //     }
        // }



    }
}

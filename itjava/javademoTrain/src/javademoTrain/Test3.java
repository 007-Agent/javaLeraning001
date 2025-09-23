package javademoTrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
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
        // String str = String.valueOf(Math.abs(num));
        // if (str.length() > 3) {

        // System.err.println(num);
        // }
        // }

        // ------------------------------------------------------------

        // String str = "12,34,56";
        // String[] parts = str.split(",");

        // int sum = 0;

        // for (String part : parts) {
        // sum += Integer.parseInt(part.trim());
        // }

        // System.out.println("Сумма: " + sum);

        // ---------------------------------------------------------------------

        // int num = 123789;

        // String str = String.valueOf(num);
        // StringBuilder result = new StringBuilder();
        // for(char c : str.toCharArray()){
        // if(c % 2 == 1){
        // result.append(c);
        // }
        // }
        // int[] array = new int[result.length()];
        // for(int i = 0; i < array.length; i++){
        // array[i] = result.charAt(i) - '0';
        // }
        // System.out.println(Arrays.toString(array));

        // --------------------------------------------------------------------

        // String str = "abc123def";
        // int position = -1;
        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i)
        // if (Character.isDigit(c)) {
        // position = i;
        // break;
        // }
        // }

        // -----------------------------------------------------------

        // int[] arr = { 1, 0, 2, 3, 0, 5 };

        // ArrayList<Integer> tempResult = new ArrayList<>();
        // for (int i = 0; i < arr.length; i += 2) {
        // tempResult.add(arr[i]);
        // }
        // int[] result = new int[tempResult.size()];
        // for (int i = 0; i < tempResult.size(); i++) {
        // result[i] = tempResult.get(i);
        // }

        // System.out.print("result: ");
        // System.out.println(Arrays.toString(result));

        // ----------------------------------------------------------------

        // char[] chars = {'1', '2', '3', '4', '5'};
        // String str = String.valueOf(chars);
        // System.out.println(str);

        // -----------------------------------------------------------------------

        // String size1 = "13px";
        // String size2 = "15px";
        // String number1 = size1.replace("px", "");
        // String number2 = size2.replace("px", "");
        // int num1 = Integer.parseInt(number1);
        // int num2 = Integer.parseInt(number2);
        // int result = num1 + num2;
        // String str = String.valueOf(result);
        // String pixel = str + "px";
        // System.out.println(pixel);

        // -------------------------------------------------------------------

        // int[] arr = { 1, 2, 3 };
        // int length = arr.length * 2;
        // int[] newArr = new int[length];
        // int j = 0;
        // for (int i = 0; i < arr.length; i++) {
        // newArr[j] = arr[i];
        // newArr[j + 1] = arr[i];
        // j += 2;
        // }
        // System.out.println(Arrays.toString(newArr));

        // -------------------------------------------------------------------------

        // String str = "345h5929k33";
        // boolean isAllDigits = true;

        // for (int i = 0; i < str.length(); i++) {
        // char c = str.charAt(i);
        // if (!Character.isDigit(c)) {
        // isAllDigits = false;
        // break;
        // }
        // }

        // if (isAllDigits) {
        // System.out.println("Строка состоит из одних цифр!");
        // } else {
        // System.out.println("Строка состоит не из одних цифр");
        // }

        // ---------------------------------------------------------

        // int num = 12345;
        // String str = String.valueOf(num);

        // for (int i = str.length() - 1; i >= 0; i--){
        // char c = str.charAt(i);
        // int digit = c - '0';
        // if(digit % 2 == 0){
        // System.out.println("первая чётная цифра - " + digit);
        // break;
        // }

        // }

        // -------------------------------------------------------------

        // String str = "abcdef";
        // StringBuilder sb = new StringBuilder();
        // for(int i = 1; i < str.length(); i+=2){
        // sb.append(str.charAt(i));
        // }
        // System.out.println(sb);

        // --------------------------------------------------------------

        // int[] arr = {1, 2, 3, 0, 4, 0, 5, 0};
        // int count = 0;
        // for(int i = 0; i < arr.length; i++){
        // if(arr[i] != 0){
        // count++;
        // }
        // }
        // int[] arrNew = new int[count];

        // int index = 0;
        // for(int i = 0; i < arr.length; i++){
        // if (arr[i] != 0) {
        // arrNew[index] = arr[i];
        // index++;
        // }
        // }
        // System.out.println(Arrays.toString(arrNew));

        // ----------------------------------------------------------------

        // int[] arr = {123, 102, 345, 350};

        // for(int num : arr){
        // String str = String.valueOf(num);
        // if(str.contains("0")){
        // System.out.println("данное число содержит 0" + " - " + str);
        // }
        // }

        // ---------------------------------------------------------------------------------

        // String[] arr = { "1", "2", "3", "4", "5" };
        // int result = 0;
        // for (String num : arr) {
        //     int count = Integer.parseInt(num);
        //     result += count;
        // }
        // System.out.println(result);

        // -------------------------------------------------------------------------

        // String str = "AbCdE";
        // StringBuilder result = new StringBuilder();

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (Character.isUpperCase(ch)) {
        //         result.append(Character.toLowerCase(ch));
        //     } else if (Character.isLowerCase(ch)) {
        //         result.append(Character.toUpperCase(ch));
        //     } else {
        //         result.append(ch);
        //     }
        // }

        // System.out.println(result.toString());

        // -------------------------------------------------------------------

        // StringBuilder sb = new StringBuilder();
        // sb.append("-");
        // for(int i = 0; i < 6; i++){
        //     sb.append((i + "-"));
        // }
        // System.out.println(sb);

        // ---------------------------------------------

        // char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        // String[] str = new String[arr.length / 2];
        // if(arr.length % 2 == 0){
        //     System.out.println("длина чётная!");
        //     for(int i = 0; i < arr.length / 2; i++){
        //       str[i] = "" + arr[2 * i] + arr[2 * i + 1];
             
        //     }
        //     System.out.println(Arrays.toString(str));
        // }

        // --------------------------------------------------------------------------
        // int[] arr = new int[10];
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = new Random().nextInt(100) + 1;
        // }
        // System.out.println(Arrays.toString(arr));

        // --------------------------------------------------------------------

//         byte[] arr = {1, 2, 8};

       
//         String[] monthNames = {"янв", "фев", "мар", "апр", "май", "июн",
//                                "июл", "авг", "сен", "окт", "ноя", "дек"};
// String[] result = new String[arr.length];
// for (int i = 0; i < arr.length; i++) {
          
//             int monthIndex = arr[i] - 1;

//             if (monthIndex >= 0 && monthIndex < monthNames.length) {
//                 result[i] = monthNames[monthIndex];
//             } else {
//                 result[i] = "неизвестно"; 
//             }
//         }

//      System.out.println(java.util.Arrays.toString(result));

// ------------------------------------------------------------
 


    }

}

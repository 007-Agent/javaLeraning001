package javademoTrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {

    // int[] arr1 = {1, 2, 3, 4, 5};
    // int[] arr2 = {4, 5, 6, 7, 8};
    // List<Integer> common = new ArrayList<>();

    // for(int i = 0; i < arr1.length; i++){
    // for(int j = 0; j < arr2.length; j++){
    // if(arr1[i] == arr2[j]){
    // common.add(arr1[i]);
    // }
    // }
    // }
    // System.out.println(common);

    // ........................................................

    // String str = "1203405";
    // int index = str.lastIndexOf("0");
    // System.out.println(index);

    // ......................................................

    // String str = "abc def jhi";
    // String[] arr = str.split(" ");
    // int result = arr.length;
    // System.out.println(result);

    // .....................................................
    // int[] numbers = {12, 345, 6789, -12345, 99, 1000, -999, 123};
    // int[] arr = new int[numbers.length];
    // int index = 0;
    // for(int num : numbers){
    // String strNum = Integer.toString(Math.abs(num));
    // if(strNum.length() > 3){
    // arr[index] = num;
    // index++;
    // System.err.println(strNum);
    // }
    // }
    // System.out.println(Arrays.toString(arr));

    // .........................................................
    //
    // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; int[]
    // array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    // int count = (array.length - 4 + 4) / 5;
    // int[] arr1 = new int[count];
    // int index = 0;
    // for(int i = 4; i < array.length; i+=5){
    // arr1[index] = array[i];
    // index++;
    // }
    // String str = Arrays.toString(arr1);
    // System.out.println(str);

    ///////////////////////////////////////////////////////////////////

    // String[] array = {"index.html", "style.css", "about.html", "script.js",
    // "contact.html"};
    // ArrayList<String> htmlFiles = new ArrayList<>();

    // for (String str : array) {
    // if (str.contains(".html")) {
    // htmlFiles.add(str);
    // }
    // }
    // System.out.println(htmlFiles);

    // .......................................................
    // String input = "пример строки для преобразования";

    // String[] str = input.split(" ");
    // for(int i = 0; i < str.length; i++){
    // String word = str[i];
    // String lastChar = Character.toString(word.charAt(word.length() -
    // 1)).toUpperCase();
    // System.out.println(lastChar);
    // }

    //////////////////////////////////////////////////////

    // String str = "12034050607";
    // int index = 0;
    // int coint = 0;
    // for(int i = 0; i < str.length(); i++){
    // if(str.charAt(i) == '0'){
    // index = i;
    // coint++;
    // if(coint == 3){
    // System.out.println("позиция третьего нуля " + index);
    // break;

    // }
    // }
    // }

    // .........................................................

    // String str = "1,2,10,100,3";

    // // Разбиваем строку по запятым на массив строк
    // String[] parts = str.split(",");

    // int max = Integer.MIN_VALUE;
    // for (String part : parts) {
    // int num = Integer.parseInt(part.trim());
    // System.out.println("Максио: " + num);
    // if (num > max) {
    // max = num;
    // }
    // }

    // System.out.println("Максимальное число: " + max);

    // .......................................................

    // String str = "abcde";
    // char[] charArray = str.toCharArray();

    // // Вывод массива для проверки
    // for (char c : charArray) {
    // System.out.print(c + " ");
    // }

    // ....................................................

    // String str = "kebab-case";
    // String[] result = str.split("-");
    // result[0] = "snake";
    // System.out.println(Arrays.toString(result));
    // String snake = String.join("_", result);
    // System.out.println(snake);

    // .........................................................

    // String str = "023m0df0dfg0";

    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == '0') {
    // System.out.println("Ноль найден в позиции: " + i);
    // }
    // }

    // .............................................................

    // int[] arr = {1, 2, 3, 4, 5, 6};

    // int mid = arr.length / 2;
    // int sumFirstHalf = 0;
    // int sumSecondHalf = 0;
    // for (int i = 0; i < mid; i++) {
    // sumFirstHalf += arr[i];
    // }
    // for (int i = mid; i < arr.length; i++) {
    // sumSecondHalf += arr[i];
    // if (sumSecondHalf != 0) {
    // double result = (double) sumFirstHalf / sumSecondHalf;
    // System.out.println("Результат деления: " + result);
    // } else {
    // System.out.println("Деление на ноль невозможно");
    // }
    // }
    // .........................................................

    // String[] arr = {"ab", "cd", "ef"};

    // ArrayList<Character> list = new ArrayList<>();

    // for (String s : arr) {
    // for (char c : s.toCharArray()) {
    // list.add(c);
    // }
    // }
    // System.out.println(list);

    // int[] arr1 = {1, 2, 3};
    // int[] arr2 = {4, 5, 6};

    // for (int i = 0; i < arr1.length; i++) {
    // System.out.println(arr1[i] + "," + arr2[i]);
    // }

    // ..........................................................

    // StringBuilder sb = new StringBuilder();
    // int j, b;
    // int a = 8;
    // while(a !=0 ) {
    // b = a%2;

    // sb.append(b);
    // a = a/2;
    // }
    // String binaryReversed = sb.toString();
    // String binary = new StringBuilder(binaryReversed).reverse().toString();

    // // Создаем массив
    // int[] binaryArray = new int[binary.length()];

    // // Заполняем массив цифрами двоичного числа
    // for (int i = 0; i < binary.length(); i++) {
    // binaryArray[i] = binary.charAt(i) - '0'; // преобразуем символ в число
    // }
    // // Выводим массив
    // for (int digit : binaryArray) {
    // System.out.print(digit + " ");
    // }

    // ......................................................

    // String str = "120340506074501107";
    // StringBuilder sb = new StringBuilder();

    // int index = 0;
    // int count = 0;
    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == '0') {
    // index = i;
    // count++;
    // sb.append(index);
    // }
    // }
    // int[] binaryArray = new int[sb.length()];
    // for (int i = 0; i < sb.length(); i++) {
    // binaryArray[i] = sb.charAt(i) - '0';
    // }
    // System.out.println(Arrays.toString(binaryArray));

    // ...............................................

    // int arr1[] = {123, 334, 456, 556, 789};

    // int[] filteredArr = Arrays.stream(arr1)
    // .filter(num -> {
    // String numStr = String.valueOf(num);
    // long distinctCount = numStr.chars().distinct().count();
    // return numStr.length() != distinctCount;
    // }).toArray();
    // System.out.println(Arrays.toString(filteredArr));

    // ................................................

    // StringBuilder sb = new StringBuilder();

    // for (int i = 0; i < 5; i++){
    // sb.append("x");
    // }
    // System.out.println(sb.toString());
    // char[] arr = new char[5];
    // for(int i = 0; i < 5; i++){
    // arr[i] = 'x';
    // }
    // System.err.println(Arrays.toString(arr));

    // ................................................

    // int[] arr = {1, 0, 2, 3, 0, 5};
    // int[] filteredArr = Arrays.stream(arr).filter(num -> {

    // return num != 0;
    // }).toArray();
    // System.out.println(Arrays.toString(filteredArr));

    // ..............................................

    // for(int num = 10; num <= 1000; num++){
    // String numStr = Integer.toString(num);
    // char firstChar = numStr.charAt(0);
    // if(firstChar % 2 == 0){
    // System.out.print(numStr + " ");
    // }
    // }

    // ------------------------------------------------------

    // int num = 12345;
    // int count = 0;
    // String str = String.valueOf(num);

    // for (int i = 0; i < str.length(); i++) {
    // char c = str.charAt(i);
    // int digit = c - '0'; // Преобразуем символ в цифру
    // if (digit % 2 == 0) { // Проверяем, четная ли
    // count++;
    // }
    // }
    // System.out.println("Количество четных цифр: " + count);

    // StringBuilder sb = new StringBuilder();
    // for(int i = 1; i < 10; i++ ){
    // sb.append(i);
    // }
    // System.out.println(sb);

    // String str = "123 456 789";
    // String[] parts = str.split(" ");
    // int result = 0;
    // for(String elem : parts){

    // int digit = Integer.parseInt(elem) ;

    // result += digit;
    // }
    // System.out.println(result);

    // String str = "123 456 789";
    // String[] parts = str.split(" "); // разбиваем строку по пробелам
    // int sum = 0;
    // for (String part : parts) {
    // int number = 0;
    // for (int i = 0; i < part.length(); i++) {
    // char c = part.charAt(i);
    // int digit = c - '0'; // преобразовываем символ в цифру
    // number = number * 10 + digit; // собираем число
    // }
    // sum += number; // добавляем к общей сумме
    // }
    // System.out.println("Сумма чисел: " + sum);

    // -----------------------------------------------------------

    // String str = "word1 word2 word3";
    // int N = 2; // Сколько слов хотим получить

    // String[] words = str.split(" ");

    // String result = "";

    // for (int i = 0; i < N && i < words.length; i++) {
    // if (i > 0) {
    // result += " "; // добавляем пробел между словами
    // }
    // result += words[i]; // добавляем слово к результату
    // }

    // System.out.println("Первые " + N + " слов: " + result);

    // ----------------------------------------------------------------

    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Введите целое число: ");
    // int number = scanner.nextInt();
    // if (isValidNumber(number)) {
    // System.out.println("Да, у числа " + number + " есть только один делитель,
    // кроме 1 и самого числа.");
    // } else {
    // System.out.println("Нет, число " + number + " не подходит.");
    // }

    // public static boolean isValidNumber(int n) {
    // if (n <= 1) {
    // return false;
    // }
    // double sqrt = Math.sqrt(n);
    // int root = (int) sqrt;
    // if (root * root != n) {
    // return false; // Не квадрат
    // }
    // return isPrime(root);
    // }
    // public static boolean isPrime(int num) {
    // if (num <= 1) {
    // return false;
    // }
    // for (int i = 2; i <= Math.sqrt(num); i++) {
    // if (num % i == 0) {
    // return false; // Есть делитель, не простое
    // }
    // }
    // return true; // Простое
    // }

    // ----------------------------------------------------------------

    // String result = "";
    // for(int i = 0; i < 3; i++){
    // String str = "xxx ";
    // result += str;

    // }
    // System.out.println(result);

    // ---------------------------------------------------------------

    // int[] arr = { 1, 0, 2, 3, 0, 5 };

    // ArrayList<Integer> tempResult = new ArrayList<>();
    // for (int i = 0; i < arr.length; i += 2) {
    //   tempResult.add(arr[i]);
    // }
    // int[] result = new int[tempResult.size()];
    // for (int i = 0; i < tempResult.size(); i++) {
    //   result[i] = tempResult.get(i);
    // }

    // System.out.print("result: ");
    // System.out.println(Arrays.toString(result));

    // -------------------------------------------------------------
  }

}
package javademoTrain;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    
	public static void main(String[] args){
String text = "apple banana apricot avocado berry almond";
String[] words = text.split(" ");
 ArrayList<String> aWordsList = new ArrayList<>();
System.out.println(Arrays.toString(words));
for(String word : words){
  if(!word.isEmpty() && word.charAt(0) == 'a' || word.charAt(0) == 'A'){
	aWordsList.add(word);
  }
}	
// String[] aWords = new String[aWordsList.size()];
//         aWords = aWordsList.toArray(aWords);

//         // Выводим результат
//         for (String w : aWords) {
//             System.out.println(w);
//         }
//////////////////////////////////////////////

//  int num = 12345;
// String str = Integer.toString(num);
// int[] digits = new int[str.length()];
// for (int i = 0; i < str.length(); i++) {
//             digits[i] = str.charAt(i) - '0'; 
//         }
// System.out.println(Arrays.toString(digits)); 
    

//  int num = 12345;
//  String str = Integer.toString(num);
//  char[] chars = str.toCharArray();

		
//     int num = 1357;
// 	int count = 0;
// String str = Integer.toString(num);
//     for (int i = 0; i < str.length(); i++){
// 		int digit = str.charAt(i) - '0';
// 		if(digit % 2 != 0){
			 
//            count++;
// 		   if(count == 4){
// 			System.out.println("Все числа являются нечётными!");
// 		   }
		   
// 		} else {
// 			System.out.println("Ошибка в числах!");
// 		}
		
// 	}

	//  float[] arr = {1.11f, 2.23f, 3.45f, 4.66f, 5.98f};
    //  int[] emptyArray = new int[arr.length];
     
	//   for (int i = 0; i < arr.length; i++) {
    //         emptyArray[i] = Math.round(arr[i]);
    //     }
	//  System.out.println(Arrays.toString(emptyArray));

	// String str = "dfffeff";
	// char[] chars = str.toCharArray();
    // System.out.println(chars);
	
	// ..........................................................

    // int[] arr = {1, 2, 3, 4, 5, 6};

	// int[] lastTwo = Arrays.copyOfRange(arr, arr.length - 2, arr.length);
	// System.out.println(Arrays.toString(lastTwo));

   ////////////////////////////////////////////////////  
    //    String str = "abcba";
	// String newStr = new StringBuilder(str).reverse().toString();
	// System.out.println(newStr);
	// if(str.equals(newStr)){
	// 	System.out.println("Да, слово ровно обратному ему");
	// } else {
	// 	System.out.println("No");
	// }
///////////////////////////////////////////////////
//    String str = "123-456-789";
//    StringBuilder sb = new StringBuilder();

//    for(int i = 0; i < str.length(); i++){
// 	char ch = str.charAt(i);
// 	if (ch == '-') {
//         sb.append(' ');
//     } else {
//         sb.append(ch);
//     }
//    }
//    String result = sb.toString();
// System.out.println(result);

// int[] arr = {1, 2, 3, 0, 4, 5};
// int position = -1;
// int count = 0;
// for(int i = 0; i < arr.length; i++){
// 	if(arr[i] == 0){
// 		position = i;
// 		count++;
// 		if(count == 1){
// 			System.out.print("0 был найден на позиции - " + position);
// 		}
// 	} 
// }

///////////////////////////////////////////////////

// int[] arr = {1, 2, 3, 4, 5, 6};
// int[] slice = Arrays.copyOfRange(arr, 0, 3); 
// System.out.println(Arrays.toString(slice)); // [1, 2, 3]


// int[] arr = {1, 2, 3, 4, 5, 6};
// int[] slice = new int[3];
// for (int i = 0; i < 3; i++) {
//     slice[i] = arr[i];
// }
// System.out.println(Arrays.toString(slice)); // [1, 2, 3]

// int[] arr = {1, 2, 3, 4, 5, 6};
// int[] slice = new int[3];
// System.arraycopy(arr, 0, slice, 0, 3);
// System.out.println(Arrays.toString(slice));
	
// 	  String str = "abcdef";
//       String sb = str.substring(0, 3);
// 	  System.out.println(sb);
		//////////////////////////////////////////
		
//         int num = 125321;
// String str = Integer.toString(num);
// int[] digits = new int[str.length()];

// for (int i = 0; i < str.length(); i++) {
//     digits[i] = str.charAt(i) - '0';  // преобразуем символ цифры в число
// }
//         int sumFirstThree = digits[0] + digits[1] + digits[2];
//         int sumLastThree = digits[3] + digits[4] + digits[5];

//         if (sumFirstThree == sumLastThree) {
//             System.out.println("Суммы равны");
//         } else {
//             System.out.println("Суммы не равны");
//         }

		

		/////////////////////////////////////////

	// int num1 = 12;
    // int num2 = 16;
	
	// for(int i = 1; i < 10; i++){
	// 	if(num1 % i == 0 && num2 % i == 0){
	// 		System.out.println(i);
	// 	}
	// }

	/////////////////////////////////////////////////

	// byte num = 1;
	// String[] months = {
    //         "Январь", "Февраль", "Март", "Апрель",
    //         "Май", "Июнь", "Июль", "Август",
    //         "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
    //     };

	// 	for(int i = 1; i < months.length; i++){
	// 		if(i == num){
	// 			System.out.println(months[i]);
	// 		}
	// 	}

     //////////////////////////////////////////////////////////////

        // String[] arr = {"ab", "cd", "ef"};
        // int totalLength = 0;
        // for (String s : arr) {
        //     totalLength += s.length();
        // }
		// char[] chars = new char[totalLength];
        // int index = 0;
        // for (String s : arr) {
        //     for (int i = 0; i < s.length(); i++) {
        //         chars[index++] = s.charAt(i);
        //     }
        // }
        // System.out.println(java.util.Arrays.toString(chars));

        // int[] arr = {1, 2, 3, 4, 5};
		// StringBuilder sb = new StringBuilder();
        // for (int num : arr) {
        //     sb.append(num);
        // }
		//  String result = sb.toString();
        // System.out.println(result);



        //   int[] arr = {1, 2, 3, 4, 5};
        //   int sum = 0;
		//   for(int num : arr){
		// 	 sum = sum + (num * num);
		//   }
		//   System.out.println(sum);

 
		// int[] arr = {1, 2, 3, 0, 4, 5};
		// for(int i = 0; i < arr.length; i++){
		// 	System.out.println(arr[i]);
		// 	if(arr[i] == 0){
		// 		break;
		// 	}
		// }

		//////////////////////////////////////////
		
        // int[] arr = {-1, 2, -3, 33, 5, 11};

		// int sum = 0;
	    // for(int i = 0; i < arr.length; i++){
		// 	if(arr[i] > 0 && arr[i] < 10){
		// 		sum = sum + arr[i];
		// 	}
		// }
		// System.out.print(sum);


		// String[] strArr = {"123", "456", "789"};
        // int[] intArr = new int[strArr.length];
        // System.out.println(intArr);
		// for(int i = 0; i < strArr.length; i++){
		// 	intArr[i] = Integer.parseInt(strArr[i]);
		// }

		// for(int num : intArr){
		// 	System.out.println(num);
		// }

		///////////////////////////////////////////////////
		/// 
		/// 
		// int[] arr = {1, 2, -3, 4, -5};
        
        // int sumPositive = 0;
        // for (int num : arr) {
        //     if (num > 0) {
        //         sumPositive += num;
        //     }
        // }
        
        // System.out.println("Сумма положительных элементов: " + sumPositive);
		
		///////////////////////////////////////
		
		// int[] arr = {1, 2, 3, 4, 5};

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }

        // double average = (double) sum / arr.length;

        // System.out.println("Среднее арифметическое: " + average);

		///////////////////////////////////////////////////////////////////////
		

		// int[] arr = {1, 2, 3, 4, 5};
        // int sum = 0;

        // for (int num : arr) {
        //     sum += num * num; // квадрат элемента и добавление к сумме
        // }

        // System.out.println("Сумма квадратов элементов массива: " + sum);
}
}		 


  

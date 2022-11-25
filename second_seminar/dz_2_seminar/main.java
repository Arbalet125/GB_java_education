/////////////////////////////////////////////////////////////////////////////////////////////////
///1 - Напишите программу, чтобы проверить, содержит ли данная строка только цифры.//////////////
///(с возможностью ввода или нет решайте сами)///////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////

/* package GB_java_education.second_seminar.dz_2_seminar;

import java.util.Scanner;

public class main {
    String regex = "[0-9]+"; //почитал в интернете, вроде, это самый простой способ задать цифры.
    
    Scanner iScanner = new Scanner(System.in); // пусть пользователь все-таки вводит число.
    System.out.println("Введите число");
    int my_number = Integer.parseInt(iScanner.nextLine());
    iScanner.close();


    System.out.println(my_number.matches(regex)); // метод match вроде должен все проверять
    
} */

/////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////
////////Второе задание копирует первое, так что повторять не вижу смысла/////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////
//Напишите программу для объединения данной строки с самим собой заданное/////////////////////////
//количество раз(количество и строку мы вводим)//////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////

/* 
package GB_java_education.second_seminar.dz_2_seminar;
import java.util.Scanner;
import java.util.Arrays;
public class ьain {    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        System.out.println("Введите исходную строку:");
        String var = iScanner.nextLine();
        System.out.println("Исходная строка: " + var);
        System.out.println("Введите количество объеденений строки:");
        int n = Integer.parseInt(iScanner.nextLine());
        String result = repeat_str(var, n);
        System.out.println("После повторения" + n + "раз, результат: " + result);
        iScanner.close();
   }
public static String repeat_str(String var, int n) {
       if (var == null || var.isEmpty()) {
           return "";
       }
       if (n <= 0) {
           return var;
       }
       if (Integer.MAX_VALUE / n < var.length()) {
           throw new OutOfMemoryError("Слишком большое число, введите другое");
       }
       StringBuilder x = new StringBuilder(var.length() * n);
       for (int i = 1; i <= n; i++) {
           x.append(var);
       }
       return x.toString();
   }
} */



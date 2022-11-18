/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
* Задание:
* Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая вычислила бы ваш вес на Луне.
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package GB_java_education.first_seminar.DZ_1_seminar;

import java.util.Scanner;
public class weight_on_moon {
    public static void main(String[] args) {
		
        
        Scanner iScanner = new Scanner(System.in); // пусть пользователь сам решает, какой у него вес
        System.out.println("Введите ваш вес в кг");
        int my_weight = Integer.parseInt(iScanner.nextLine());
        iScanner.close();

		int moon_gravity = 17;   
		int earth_gravity = 100; 
		int moon_weight;

		
		moon_weight = (moon_gravity / earth_gravity) * my_weight;

		System.out.print("Мой вес на Луне равен: " + moon_weight + " кг.");
	}
}

// package GB_java_education.sixth_seminar;

// import java.util.HashSet;

/////////////////////////////////////////////////////////////////////////////////////////////////
///// Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24////
/////////////////////////////////////////////////////////////////////////////////////////////////

/* 
public class main
{
	public int[] initArray(){
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 25)); // Пытался сделать через array[i] = random.nextInt(25), но выдало ошибку. Так и не понял почему
        }
        return array;
    }
  
} */

/////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////
// Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент/ 
// уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.//////////
// Для вычисления процента используйте формулу://////////////////////////////////////////////////
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
/////////////////////////////////////////////////////////////////////////////////////////////////

/* public class main
{
	public int[] initArray(){
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 25)); // Пытался сделать через array[i] = random.nextInt(25), но выдало ошибку. Так и не понял почему
        }
        return array;
    }
    
    public double getPercentUniqueValues(int[] array){
        Set<Integer> mySet = new HashSet<>()
        for (int x : array) {
            mySet.add(x);
        }
        int res = 0;
        res = (mySet.size)*100/array.length;
        return res;      
    }

    int[] myArray = initArray();
    System.out.print(myArray.length);
    System.out.println(getPercentUniqueValues(myArray)+"%");
} */




/////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////Реализовать алгоритм сортировки слиянием на java(целые числа)/////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////

/* package GB_java_education.third_seminar.dz_3_seminar;

public class main {
    
int[] actual = { 5, 1, 6, 2, 3, 4 }; //иницициация массива

System.out.println(sortArray(actual, actual.length))

    public static void sortArray(int[] a, int n) { //сначала напишем функцию для сортировки массива
    if (n < 2) {    // проверим, не слишком ли короткий массив
        return;
    }
    int mid = n / 2; // найдем средний индекс
    int[] l = new int[mid]; 
                                    //создаем подмассивы...
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        l[i] = a[i];
    }                                 // ...и заполняем их
    for (int i = mid; i < n; i++) {
        r[i - mid] = a[i];
    }
    sortArray(l, mid); 
                            //рекурсивно вызываем функцию sortArray для обоих подмассивов
    sortArray(r, n - mid);

    merge(a, l, r, mid, n - mid); // наконец вызываем функцию для слияния этих массивов

}

public static void merge(   //собственно функция для слияния
  int[] a, int[] l, int[] r, int left, int right) { //где left - это начальный элемент подмассива, а right - конечный
 
    int i = 0, j = 0, k = 0; // временные переменные
    
    // стандартное сравнение и помещение большего элемента в исходный массив:  
    while (i < left && j < right) {
        if (l[i] <= r[j]) {
            a[k++] = l[i++]; 
        }
        else {
            a[k++] = r[j++];
        }
    }
    while (i < left) {
        a[k++] = l[i++];
    }
    while (j < right) {
        a[k++] = r[j++];
    }
}
} */

/////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//- Создать массив на 20 чисел./////////////////////////////////////////////////////////////////////////////////////////////////////
//- Ввести в него значения с клавиатуры.////////////////////////////////////////////////////////////////////////////////////////////
//- Создать два массива на 10 чисел каждый./////////////////////////////////////////////////////////////////////////////////////////
//- Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький./////////////
//- Вывести второй отсортированный маленький массив на экран, каждое значение выводить с новой строки(хранение наибольших чисел)////
//- Вывести первый отсортированный маленький массив на экран, каждое значение выводить с новой строки(хранение наименьших чисел)////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* package GB_java_education.third_seminar.dz_3_seminar;

import java.util.Scanner;

public class main {
     public static void main(String[] args) throws Exception
        int [] bigArray = new int [20];
        for (int i=0; i < bigArray.length; i++) {
            Scanner iScanner = new Scanner(System.in); 
            System.out.println("Введите " + i + "-ый элемент массива");
            int n = Integer.parseInt(iScanner.nextLine());
            iScanner.close();
        int [] smallArray1 = new int [10];
        int [] smallArray2 = new int [10];
        smallArray1 = Arrays.copyOfRange(bigArray, 0, 9);
        smallArray2 = Arrays.copyOfRange(bigArray, 10, 20);

        for (int i=0; i < smallArray2.length; i++)
        {
            System.out.println(smallArray2[i]);
        }
     }
} */

/////////////////////////////////////////////////////////////////////////////////////////////////
// - Создать два списка LinkedList и ArrayList///////////////////////////////////////////////////
// Нужно создать два списка – LinkedList и ArrayList.////////////////////////////////////////////
// - Провести 10 тысяч вставок, удалений/////////////////////////////////////////////////////////
// Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.//// 
// (исключетельно методами, за 10 тыс элементов можно взять числп от 1 до 10_001)////////////////
// - Измерить, сколько времени занимает 10 тысяч вставок для каждого списка./////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////

/* import java.sql.Date;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


package GB_java_education.third_seminar.dz_3_seminar;

public class main {
    public static void main(String[] args) throws Exception
    {
       ArrayList arrayList = new ArrayList();
       LinkedList linkedList = new LinkedList();

       insert10000(arrayList);
       get10000(arrayList);
       set10000(arrayList);
       remove10000(arrayList);
       
       insert10000(linkedList);
       get10000(linkedList);
       set10000(linkedList);
       remove10000(linkedList);
    
    System.out.println(getTimeMsOfInsert(new ArrayList()));
    System.out.println(getTimeMsOfInsert(new LinkedList()));
    }
    public static long  getTimeMsOfInsert(List list)
    {
        
        Date timeBefore = new Date();
        insert10000(list);
        
        Date timeAfter = new Date();
        long msDelay = timeAfter.getTime() - timeBefore.getTime();
        return msDelay;
    }
    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}

   }
   public static void insert10000(List list)
   {
       for (int i = 0; i < 10000; i++)
       {
           list.add(i, i);
       }
   }
   public static void get10000(List list)
   {
       for (int i = 0; i < 10000; i++)
       {
           list.get(i);
       }
   }
   public static void set10000(List list)
   {
       for (int i = 0; i < 10000; i++)
       {
           list.set(i, i);
       }
   }
   public static void remove10000(List list)
   {
       for (int i = 0; i < 10000; i++)
       {
           list.remove(0);
       }
} */

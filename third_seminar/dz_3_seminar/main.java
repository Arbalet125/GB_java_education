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


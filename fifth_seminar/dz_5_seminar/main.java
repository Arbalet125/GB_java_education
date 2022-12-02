////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
// Слова с одинаковой длиной не должны “потеряться”.
////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* 
package GB_java_education.fifth_seminar.dz_5_seminar;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
  
public class GFG {
  
    static String[] sort(String[] str, int n)
    {
        TreeMap<Integer, ArrayList<String>> map = new TreeMap<Integer, ArrayList<String> >();
  
        for (int i = 0; i < n; i++) {
  
            map.putIfAbsent(str[i].length(), new ArrayList<String>());
            map.get(str[i].length()).add(str[i]);
        }
  
        int temp = 0;
  
        for (Entry<Integer, ArrayList<String> >
                 e : map.entrySet()) {
  
            for (int i = 0; i < e.getValue().size(); i++) {
  
                str[temp] = e.getValue().get(i);
                temp++;
            }
        }
        return str;
    }
  
    static void printArraystring(String str[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(str[i] + " ");
    }
  
    public static void main(String args[])
    {
        String[] arr = {"Если", "вы", "можете", "мечтать", "об", "этом", "вы", "можете", "это", "сделать"};
        int n = arr.length;
  
        arr = sort(arr, n);
  
        printArraystring(arr, n);
    }
} */
/* package GB_java_education.first_seminar.DZ_1_seminar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class calc {
    public class calculator{
        static int power(int a, int b){
            int result = 1;
            for (int i=1; i<=b; i++){
                result = result*a;
            }
            return result;
        }	
     
public static void main(String[] args){
    
    String tempB;
    String tempA;
    int a;
    int b;

    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
    String str;

    while ((str = br.readLine()) != null) {
        if (str.contains("a")) {
            tempA = str.chars()
                    .filter(c -> !Character.isLetter(c))
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining())
                    .trim();

        } else if (str.contains("b")) {
            tempB = str.chars()
                    .filter(c -> !Character.isLetter(c))
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining())
                    .trim();

        } else {
            System.out.println("Неверный формат!\n запишите в виде:\nb [число]\na [число]");
            break;
        }

    }
    br.close();

    a = Integer.parseInt(tempA);
    b = Integer.parseInt(tempB);

    int res = power(3,2);
    


    try (FileWriter fw = new FileWriter("output.txt", false)){
        fw.write(res);
        fw.flush();
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }  
}
}
} */
package GB_java_education.first_seminar;
public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        int var;
        var = 1024;
        int var2 = 2024;
        int var3 = var + var2;
        System.out.println(var3);
        
        
        long num = 12L; // int num = 12 - если целое число, но 12L - длинное число, поэтому большое
        float num2 = 10.15F; //double num2 = 10.15 - если мало чисел после запятой, float - много чисел после запятой
        System.out.println(num+num2);

        if (var >= var2) {
            System.out.println("Этот код не отобразиться");
        }
        else {
            System.out.println("Правильный ответ");
        }
    
        int count;
        for (count = 0; count < 5; ++count){
            System.out.println("count = " + count); //println - новая строка; printf - если хочешь остаться на прежней строке
        }
        System.out.println("OneOne\nTwoTwo"); //\n переводит курсор на новую строку (все, что дальше \n будет в новой строке, при том кавычки не закрываем)
        System.out.println("A\tB\tC"); // \t стаавит длинный пробел между правой и левой стороной литеры \t. Кавычки тоже не закрываем
        System.out.println("D\tE\tF");

        int x,y;
        double i;
        x=3;
        y=2;
        i = (double) x/y; // если бы было int мы бы получили только целое число, т.е. еденицу, но если явно указать тип переменной, получим нужное
        System.out.println(i);
    }


}
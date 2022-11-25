//package GB_java_education.second_seminar;

//Paths - это совсем простой класс с единственным статическим методом get(). 
//Его создали исключительно для того, чтобы из переданной строки или URI получить объект типа Path.

//Вот пример его работы:

/* import java.nio.file.Path;
import java.nio.file.Paths;

public class main {

   public static void main(String[] args) {

       Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");
   }
  */

//Какие же полезные методы есть у Path?

//Вот некоторые из них и примеры их работы:
//getFileName() //— возвращает имя файла из пути;

//getParent() // — возвращает «родительскую» директорию по отношению к текущему пути (то есть ту директорию, которая находится выше по дереву каталогов);

//getRoot() // — возвращает «корневую» директорию; то есть ту, которая находится на вершине дерева каталогов;

//startsWith(), endsWith() //— проверяют, начинается/заканчивается ли путь с переданного пути:

/* import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

   public static void main(String[] args) {

       Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

       Path fileName = testFilePath.getFileName();
       System.out.println(fileName);

       Path parent = testFilePath.getParent();
       System.out.println(parent);

       Path root = testFilePath.getRoot();
       System.out.println(root);

       boolean endWithTxt = testFilePath.endsWith("Desktop\\testFile.txt");
       System.out.println(endWithTxt);

       boolean startsWithLalala = testFilePath.startsWith("lalalala");
       System.out.println(startsWithLalala);
   }
} */

// Вывод в консоль:

// testFile.txt
// C:\Users\Username\Desktop
// C:\
// true
// false

// Обрати внимание на то, как работает метод endsWith(). Он проверяет, заканчивается ли текущий путь на переданный путь. Именно на путь, а не на набор символов.

// Сравни результаты этих двух вызовов:

/* import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

   public static void main(String[] args) {

       Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

       System.out.println(testFilePath.endsWith("estFile.txt"));
       System.out.println(testFilePath.endsWith("Desktop\\testFile.txt"));
   }
} */

// Вывод в консоль:

// false
// true

// В метод endsWith() нужно передавать именно полноценный путь, а не просто набор символов: в противном случае результатом всегда будет false, даже если текущий путь действительно заканчивается такой последовательностью символов (как в случае с “estFile.txt” в примере выше).

// Кроме того, в Path есть группа методов, которая упрощает работу с абсолютными (полными) и относительными путями.

// Давай рассмотрим эти методы:

// boolean isAbsolute() — возвращает true, если текущий путь является абсолютным:

/* import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

   public static void main(String[] args) {

       Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

       System.out.println(testFilePath.isAbsolute());
   }
} */

// Вывод в консоль:

// true

// Path normalize() — «нормализует» текущий путь, удаляя из него ненужные элементы. Ты, возможно, знаешь, что в популярных операционных системах при обозначении путей часто используются символы “.” (“текущая директория”) и “..” (родительская директория). Например: “./Pictures/dog.jpg” обозначает, что в той директории, в которой мы сейчас находимся, есть папка Pictures, а в ней — файл “dog.jpg”

// Так вот. Если в твоей программе появился путь, использующий “.” или “..”, метод normalize() 
// позволит удалить их и получить путь, в котором они не будут содержаться:

/* import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

   public static void main(String[] args) {


       Path path5 = Paths.get("C:\\Users\\Java\\.\\examples");

       System.out.println(path5.normalize());

       Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
       System.out.println(path6.normalize());
   }
} */

// Вывод в консоль:

// C:\Users\Java\examples
// C:\Users\examples


// Path relativize() — вычисляет относительный путь между текущим и переданным путем.

// Например:

/* import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

   public static void main(String[] args) {

       Path testFilePath1 = Paths.get("C:\\Users\\Users\\Users\\Users");
       Path testFilePath2 = Paths.get("C:\\Users\\Users\\Users\\Users\\Username\\Desktop\\testFile.txt");

       System.out.println(testFilePath1.relativize(testFilePath2));
   }
} */

// Вывод в консоль:

// Username\Desktop\testFile.txt

// Полный список методов Path довольно велик. Найти их все ты сможешь в документации Oracle.

///////////////////////////////////////////////////////////////////////////

// Мы же перейдем к рассмотрению Files.
// Files
// Files — это утилитный класс, куда были вынесены статические методы из класса File. Files — это примерно то же, что и Arrays или Collections, только работает он с файлами, а не с массивами и коллекциями :)

// Он сосредоточен на управлении файлами и директориями. Используя статические методы Files, мы можем создавать, удалять и перемещать файлы и директории.

// Для этих операций используются методы createFile() (для директорий — createDirectory()), move() и delete().

// Вот как ими пользоваться:

/* import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {

   public static void main(String[] args) throws IOException {

       //создание файла
       Path testFile1 = Files.createFile(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt"));
       System.out.println("Был ли файл успешно создан?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

       //создание директории
       Path testDirectory = Files.createDirectory(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory"));
       System.out.println("Была ли директория успешно создана?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory")));

       //перемещаем файл с рабочего стола в директорию testDirectory. Перемещать надо с указанием имени файла в папке!
       testFile1 = Files.move(testFile1, Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt"), REPLACE_EXISTING);

       System.out.println("Остался ли наш файл на рабочем столе?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

       System.out.println("Был ли наш файл перемещен в testDirectory?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt")));

       //удаление файла
       Files.delete(testFile1);
       System.out.println("Файл все еще существует?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt")));
   }
} */

//Здесь мы сначала создаем файл (метод Files.createFile()) на рабочем столе, далее создаем там же папку (метод Files.createDirectory()). После этого мы перемещаем файл (метод Files.move()) с рабочего стола в эту новую папку, а в конце — удаляем файл (метод Files.delete()).

// Вывод в консоль:

// Был ли файл успешно создан?
// true
// Была ли директория успешно создана?
// true
// Остался ли наш файл на рабочем столе?
// false
// Был ли наш файл перемещен в testDirectory?
// true
// Файл все еще существует?
// false

//
// Обрати внимание: так же, как и методы интерфейса Path, многие методы Files возвращают объект Path.

// Большинство методов класса Files принимают на вход также объекты Path. 
//Тут твоим верным помощником станет метод Paths.get() — активно им пользуйся.

// Что еще интересного есть в Files? То, чего очень не хватало старому классу File — метод copy()! 
// Мы говорили о нем в начале лекции, самое время с ним познакомиться!

/* import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {

   public static void main(String[] args) throws IOException {

       //создание файла
       Path testFile1 = Files.createFile(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt"));
       System.out.println("Был ли файл успешно создан?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

       //создание директории
       Path testDirectory2 = Files.createDirectory(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2"));
       System.out.println("Была ли директория успешно создана?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2")));

       //копируем файл с рабочего стола в директорию testDirectory2.
       testFile1 = Files.copy(testFile1, Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile111.txt"), REPLACE_EXISTING);

       System.out.println("Остался ли наш файл на рабочем столе?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

       System.out.println("Был ли наш файл скопирован в testDirectory?");
       System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile111.txt")));
   }
}

Вывод в консоль:

Был ли файл успешно создан?
true
Была ли директория успешно создана?
true
Остался ли наш файл на рабочем столе?
true
Был ли наш файл скопирован в testDirectory?
true */
 
// Теперь ты умеешь копировать файлы программно! :)

// Но класс Files позволяет не только управлять самими файлами, но и работать с его содержимым. 

// Для записи данных в файл у него есть метод write(), а для чтения — целых 3: read(), readAllBytes() и readAllLines()

// Мы подробно остановимся на последнем. Почему именно на нем?

// Потому что у него есть очень интересный тип возвращаемого значения — List<String>! 
// То есть он возвращает нам список строк файла. Конечно, это делает работу с содержимым очень удобной, ведь
// весь файл, строку за строкой, можно, например, вывести в консоль в обычном цикле for:

/* import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

   public static void main(String[] args) throws IOException {

       List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"), UTF_8);

       for (String s: lines) {
           System.out.println(s);
       }
   }
}

Вывод в консоль:

Я помню чудное мгновенье:
Передо мной явилась ты,
Как мимолетное виденье,
Как гений чистой красоты.
 */

// Очень удобно! :)

// Такая возможность появилась еще в Java 7.

// В версии Java 8 появился Stream API, который добавил в Java некоторые элементы функционального программирования. В том числе более богатые возможности работы с файлами.

// Представь, что у нас есть задача: найти в файле все строки, которые начинаются со слова «Как», привести их к UPPER CASE и вывести в консоль.

// Как выглядело бы решение с использованием класса Files в Java 7?

// Примерно вот так:

/* import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

   public static void main(String[] args) throws IOException {

       List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"), UTF_8);

       List<String> result = new ArrayList<>();

       for (String s: lines) {
           if (s.startsWith("Как")) {
               String upper = s.toUpperCase();
               result.add(upper);
           }
       }

       for (String s: result) {
           System.out.println(s);
       }
   }
}

Вывод в консоль:

КАК МИМОЛЕТНОЕ ВИДЕНЬЕ,
КАК ГЕНИЙ ЧИСТОЙ КРАСОТЫ. */

// Мы вроде справились, но не кажется ли тебе, что для такой простой задачи наш код получился немного...многословным?

// С использованием Java 8 Stream API решение выглядит намного более элегантным:

/* import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

   public static void main(String[] args) throws IOException {

       Stream<String> stream = Files.lines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"));

       List<String> result  = stream
               .filter(line -> line.startsWith("Как"))
               .map(String::toUpperCase)
               .collect(Collectors.toList());
       result.forEach(System.out::println);
   }
} */

// Мы добились того же результата, но с гораздо меньшим объемом кода! Причем нельзя сказать, что мы потеряли в «читабельности». Думаю, ты легко сможешь прокомментировать что делает этот код, даже не будучи знакомым со Stream API.

// Но если вкратце, Stream — это последовательность элементов, над которыми можно выполнять разные функции. Мы получаем объект Stream из метода Files.lines(), после чего применяем к нему 3 функции:
// С помощью метода filter() отбираем только те строки из файла, которые начинаются с «Как».

// Проходимся по всем отобранным строкам с помощью метода map() и приводим каждую из них к UPPER CASE.

// Объединяем все получившиеся строки в List с помощью метода collect().

// На выходе мы получаем тот же результат:

// КАК МИМОЛЕТНОЕ ВИДЕНЬЕ,
// КАК ГЕНИЙ ЧИСТОЙ КРАСОТЫ.

// Если тебе будет интересно узнать больше о возможностях этой библиотеки, рекомендуем прочесть вот эту статью.

// Мы же вернемся к нашим баранам, то есть файлам :)

// Последняя возможность, которую мы сегодня рассмотрим — это проход по дереву файлов.

// Файловая структура в современных операционных системах чаще всего имеет вид дерева: у него есть корень и есть ветки, от которых могут отделяться другие ветки и т.д.

// Роль корня и веток выполняют директории.
// Например, в роли корня может выступать директория “С://”. 
// От него отходят две ветки: “C://Downloads” и “C://Users”. 
// От каждой из этих веток отходят еще по 2 ветки: 
// “C://Downloads/Pictures”, “C://Downloads/Video”, 
// “C://Users/JohnSmith”, “C://Users/Pudge2005”. 

// От этих веток отходят другие ветки и т.д. — так и получается дерево. 

// В Linux это выглядит примерно так же, только там в роли корня выступает директория /
// Files, Path - 2Теперь представь, что у нас есть задача: зная корневой каталог, мы должны пройтись по нему, заглянуть в папки всех уровней и найти в них файлы с нужным нам содержимым. Мы будем искать файлы, содержащие строку «This is the file we need!»

// Нашим корневым каталогом будет папка «testFolder», которая лежит на рабочем столе.

// Внутри у нее вот такое содержимое:
// Files, Path - 3Внутри папок level1-a и level1-b тоже есть папки:
// Files, Path - 4Files, Path - 5Внутри этих «папок второго уровня» папок уже нет, только отдельные файлы:
// Files, Path - 6Files, Path - 73 файла с нужным нам содержимым мы специально обозначим понятными названиями — FileWeNeed1.txt, FileWeNeed2.txt, FileWeNeed3.txt

// Именно их нам и нужно найти по содержимому с помощью Java.
// Как же нам это сделать?

// На помощь приходит очень мощный метод для обхода дерева файлов — Files.walkFileTree().

// Вот что нам нужно сделать. 

// Во-первых, нам понадобится FileVisitor. FileVisitor — это специальный интерфейс, в котором описаны все методы для обхода дерева файлов.

// В частности, мы поместим туда логику считывания содержимого файла и проверки, содержит ли он нужный нам текст.

// Вот как будет выглядеть наш FileVisitor:

/* import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

   @Override
   public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

       List<String> lines = Files.readAllLines(file);
       for (String s: lines) {
           if (s.contains("This is the file we need")) {
               System.out.println("Нужный файл обнаружен!");
               System.out.println(file.toAbsolutePath());
               break;
           }
       }

       return FileVisitResult.CONTINUE;
   }
} */

// В данном случае наш класс наследуется от SimpleFileVisitor. Это класс, реализующий FileVisitor, в котором нужно переопределить всего один метод: visitFile(). Здесь мы и описываем что нужно делать с каждым файлом в каждой директории.

// Если тебе нужна более сложная логика обхода, стоит написать свою реализацию FileVisitor. Там понадобится реализовать еще 3 метода:
// preVisitDirectory() — логика, которую надо выполнять перед входом в папку;

// visitFileFailed() — что делать, если вход в файл невозможен (нет доступа, или другие причины);

// postVisitDirectory() — логика, которую надо выполнять после захода в папку.

// У нас такой логики нет, поэтому нам достаточно SimpleFileVisitor.

// Логика внутри метода visitFile() довольно проста: прочитать все строки из файла, проверить, есть ли в них нужное нам содержимое, и если есть — вывести абсолютный путь в консоль.

// Единственная строка, которая может вызвать у тебя затруднение — вот эта:

// return FileVisitResult.CONTINUE;

// На деле все просто. Здесь мы просто описываем что должна делать программа после того, как выполнен вход в файл, и все необходимые операции совершены. В нашем случае необходимо продолжать обход дерева, поэтому мы выбираем вариант CONTINUE.

// Но у нас, например, могла быть и другая задача: найти не все файлы, которые содержат «This is the file we need», а только один такой файл. После этого работу программы нужно завершить. В этом случае наш код выглядел бы точно так же, но вместо break; было бы:

// return FileVisitResult.TERMINATE;

// Что ж, давай запустим наш код и посмотрим, работает ли он.

/* import java.io.IOException;
import java.nio.file.*;

public class Main {

   public static void main(String[] args) throws IOException {

       Files.walkFileTree(Paths.get("C:\\Users\\Username\\Desktop\\testFolder"), new MyFileVisitor());
   }
}

Вывод в консоль:

Нужный файл обнаружен!
C:\Users\Username\Desktop\testFolder\FileWeNeed1.txt
Нужный файл обнаружен!
C:\Users\Username\Desktop\testFolder\level1-a\level2-a-a\FileWeNeed2.txt
Нужный файл обнаружен!
C:\Users\Username\Desktop\testFolder\level1-b\level2-b-b\FileWeNeed3.txt */
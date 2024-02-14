import java.time.LocalDate;

/**
 * MyClass деген класс тузунуз. Ал класста озунуз жонундо маалымат сактаган полелер болсун
 * (атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз).Параметри
 * эки башка болгон эки конструктор тузунуз. MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
 * Эки объектке эки башка конструктор иштесин.Объекттердин маанилерин консольго чыгарыныз.
 */

public class Main {
    public static void main(String[] args) {

        String[] lessons = {"Java", "Soft Skills", "English"};
        MyClass bashKazan = new MyClass("Nurkyz", "Zikirdinova", LocalDate.of(2004, 07, 04), lessons);
        MyClass ashKazan = new MyClass("Nurkyz", "Zikirdinova", LocalDate.of(2004, 07, 04), "Chicken in sweet and sour sauce");


       bashKazan.getInfo();
       System.out.println();
       ashKazan.getInfo();

    }
}
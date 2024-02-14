import java.time.LocalDate;
import java.util.Arrays;

public class MyClass {
    String name;
    String surname;
    LocalDate dateOfBirth;
    String [] lesson;
    String favFood;


    @Override
    public   String toString() {
        return name +"  "+
                surname+"  "+
                dateOfBirth+"  "+
                Arrays.toString(lesson)+"  "+
                favFood;
    }


    public  MyClass(String name, String surname,  LocalDate dateOfBirth,   String [] lesson){
        this.name = name;
        this.surname= surname;
        this.dateOfBirth = dateOfBirth;
        this.lesson = lesson;

    }

    public  MyClass(String name, String surname,  LocalDate dateOfBirth,  String favFood){
        this.name = name;
        this.surname= surname;
        this.dateOfBirth= dateOfBirth;
        this.favFood= favFood;
    }
    public void getInfo() {
        System.out.println("Name    Surname       Date of birth ");
        System.out.println(name+"  "+surname+"   "+dateOfBirth);


        if (lesson != null) {
           System.out.println("Lessons: ");
            for (String lesson : lesson) {
                System.out.println (lesson);
            }
        }if(favFood!=null){
            System.out.println("Favorite food: "+favFood);
        }
    }
}
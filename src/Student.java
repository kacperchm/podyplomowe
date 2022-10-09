public class Student {
    String name;
    String lastName;
    char gender;
    String kierunek;
    int year;

    public Student(String name, String lastName, char gender, String kierunek, int year) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.kierunek = kierunek;
        this.year = year;
    }

    public void info(Student student) {
        System.out.println("Nazywam się " + student.name + " " + student.lastName + " jestem na " + student.year + " roku kierunku " + student.kierunek);
    }
}

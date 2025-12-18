import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> students = StudentLoader.loadStudents("studentsEN.txt");

        // 1) Find students with grade 5 and print them
        System.out.println("Students with grade 5:");
        students.stream()
                .filter(s -> s.getScore() == 5)
                .forEach(System.out::println);

        // 2) Calculate average grade
        double average = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0);

        System.out.println("\nAverage grade: " + average);

        // 3) Count students with grade 5
        long countOfFives = students.stream()
                .filter(s -> s.getScore() == 5)
                .count();

        System.out.println("\nNumber of students with grade 5: " + countOfFives);
    }}

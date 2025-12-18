import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentLoader {

    public static List<Student> loadStudents(String filePath) throws IOException {

        List<Student> students = new ArrayList<>();

        Files.lines(Path.of(filePath)).forEach(line -> {
            String[] parts = line.split(" ");
            String name = parts[0];
            String surname = parts[1];
            int score = Integer.parseInt(parts[2]);

            students.add(new Student(name, surname, score));
        });

        return students;
    }
}

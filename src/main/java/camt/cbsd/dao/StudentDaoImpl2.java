package camt.cbsd.dao;

import camt.cbsd.entity.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 15/4/2560.
 */

@Profile("secondDataSource")
@ConfigurationProperties(prefix="server")
@Repository
public class StudentDaoImpl2 extends AbstractStudentDao {

    @PostConstruct
    private void init() {
        imageBaseUrl = baseUrl + imageUrl;
        ;
        students = new ArrayList<>();

        Student student = new Student(1, "SE-001", "Tanaphum", "Wichaita",
                3.00, "images/tanaphum.gif", true, 0,
                "The me");
        students.add(student);
        student = new Student(2, "SE-002", "Nana", "Wic",
                4.00, "images/Nana.gif", true, 0,
                "The Wic");
        students.add(student);

    }
    @Override
    public List<Student> getStudents(){
        return students;
    }

    @Override
    public Student findById(long id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().get();

    }
}


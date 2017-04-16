package camt.cbsd.dao;

import camt.cbsd.entity.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Created by Admin on 15/4/2560.
 */

@Profile("secondDataSource")
@ConfigurationProperties(prefix="server")
@Repository
public class StudentDaoImpl2 extends AbstractStudentDao {

    @PostConstruct
    private void init(){
        imageBaseUrl = baseUrl + imageUrl;;
        students = new ArrayList<>();

        Student student = new Student(1,"SE-001","Tanaphum","Wichaita",
                3.00,"images/tanaphum.gif",true,0,
                "The me");
        students.add(student);
        student = new Student(2,"SE-002","Nana","Wic",
                4.00,"images/Nana.gif",true,0,
                "The Wic");
=======
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAMT on 3/24/2017.
 */
@Profile("secondDataSource")
@ConfigurationProperties(prefix = "server")
@Service
public class StudentDaoImpl2 implements StudentDao {
    List<Student> students;
    String baseUrl;
    String imageUrl;

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    String imageBaseUrl;
    @PostConstruct
    private void init(){
        imageBaseUrl = baseUrl + imageUrl ;
        students = new ArrayList<>();
        Student student = new Student(1,"SE-000","Chartchai","D",
                5.00,imageBaseUrl + "temp.gif",true,0,
                "The Special One");
>>>>>>> b04d23fe73bc31a48b6e25d53769cb18bf29ab8f
        students.add(student);

    }

<<<<<<< HEAD

    @Override
    public Student addStudent(Student student) {
        if(students.add(student))
            return student;
        else
            return null;
=======
    @Override
    public List<Student> getStudents(){
        return students;
    }

    @Override
    public Student findById(long id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().get();
>>>>>>> b04d23fe73bc31a48b6e25d53769cb18bf29ab8f
    }
}

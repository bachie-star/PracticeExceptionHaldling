import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    int maxStudents;
    int currentStudents;
    List<String>registerStudent=new ArrayList<>();

    public Course(String courseName,int maxStudents,int currentStudents){
        if(maxStudents <=0 ){
            throw new IllegalArgumentException("Maximum students must be greater than zero");
        }
        else {
            this.courseName=courseName;
            this.maxStudents=maxStudents;
            this.currentStudents=currentStudents;
        }
    }

    public void registerStudent(String studentName , int age)throws InvalidAgeException,CourseFullException,AlreadyRegisteredException{
        if (age < 16){
            throw new InvalidAgeException("Age is too small");//throw a custom exception
        } else if (currentStudents>=maxStudents) {
            throw new CourseFullException("The course is already full right now");//throw a custom exception

        } else if (registerStudent.contains(studentName)) {
            throw new AlreadyRegisteredException("The student is already registered");//throw a custom exception

        }
        else {
            registerStudent.add(studentName);//if the there is no exception the student name should be added to the list
            currentStudents++;//increasing the current number of students
            System.out.println("Student registerd successfully");//a message
        }

    }

    public static void main(String[] args) throws InvalidAgeException, CourseFullException,AlreadyRegisteredException {

        Course course=new Course("Physics",70,33);
        try{
            course.registerStudent("Batch",20);
            course.registerStudent("Batch",26);
        }catch (InvalidAgeException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        catch (CourseFullException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        catch (AlreadyRegisteredException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}

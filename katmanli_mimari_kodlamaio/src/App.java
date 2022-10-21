import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class App {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        Category category = new Category(4, "ML");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category);

        Course course = new Course(3, "Python ile ML giriş", "Python ile makine öğrenmesi için temel kurs", 50);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course);

        Instructor instructor = new Instructor(2,"Serdar" , "Güzel");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);

    }
}

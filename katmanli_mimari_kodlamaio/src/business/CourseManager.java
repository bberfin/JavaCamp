package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    
    Course[] courses = {new Course(1, "Java & React", "Yazılım Geliştirici Kampı",50), new Course(2, "C# & Angular", "Yazılım Yetiştirici Kampı",50)};
    
    private CourseDao courseDao;
    private Logger[] loggers;
    
    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        
        for (Course crs : courses) {
            if(crs.getCourseName() == course.getCourseName()){
                throw new Exception("Bu kurs zaten mevcut.");
            }
            if (course.getCoursePrice() < 0) {
                throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
            }

        }

        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " -> kurs eklendi.");
        }
    }    
}

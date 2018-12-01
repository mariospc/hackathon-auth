import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

public class Lecture {

    public Lecture() {
    }

    public Lecture(Course course, Date date, Classroom classroom, Boolean cancel) {
        this.course = course;
        this.date = date;
        this.classroom = classroom;
        this.cancel = cancel;
    }

    private Course course;
    private Date date;
    private Classroom classroom;
    private Boolean cancel;

}

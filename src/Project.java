import java.time.LocalDateTime;

public class Project {

    private static int counter=1;
    private int number=0;
    private String course;
    private String subject;
    private LocalDateTime date;


    public Project(){
        this.number = counter++;
    }

    public Project(String course, String subject, LocalDateTime date) {
        this.number = counter++;
        this.course = course;
        this.subject = subject;
        this.date=date;
    }

    public int getNumber() {
        return number;
    }

    public String getCourse() {
        return course;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getDate() {
        return date;
    }


    public void setCourse(String course) {
        this.course = course;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Project{" +
                "number=" + number +
                ", course='" + course + '\'' +
                ", subject='" + subject + '\'' +
                ", date=" + date +
                '}';
    }
}

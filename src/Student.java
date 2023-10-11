public class Student {
    private static int counter=1;
    private int number=0;
    private String name;
    private String firstname;
    private Training training;

    public Student(){
        number=counter++;

    }

    public Student(String nom, String prenom, Training training) {
        number=counter++;
        this.name = nom;
        this.firstname = prenom;
        this.training = training;

    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public Training getTraining(){
        return training;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setTraining(Training training){
        this.training=training;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", training=" + training +
                '}';
    }
}

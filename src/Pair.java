import Exceptions.ExceptionGrade;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Pair {

//    private  =  [["Java", 2], ["Python", 3], ["C", 4], []];
    private int number=0;
    private Project project;
    private Student student1;
    private Student student2;

    private double gradeReport;
    private double gradeStudent1;
    private double gradeStudent2;

    private LocalDateTime effectiveDate;


    public Pair(){
    }

    public Pair(Project project, Student student1, Student student2) { //Faut pas que les deux eleves soient les memes (sinon throw erreur)
        //Faut aussi vérifier que les deux eleves soient bien inscrits dans la matière du projet (sinon ca n'a pas de sens)
        this.project = project;
        this.student1 = student1;
        this.student2 = student2;
    }

    public Project getProject() {
        return project;
    }

    public Student getStudent1() {
        return student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public double getGradeReport() {
        return gradeReport;
    }

    public double getGradeStudent1() {
        return gradeStudent1;
    }

    public double getGradeStudent2() {
        return gradeStudent2;
    }

    public LocalDateTime getEffectiveDate(){
        return effectiveDate;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setStudent1(Student student1) {//Faut pas que deux etudiants soient les memes( sinon throw erreur)
        this.student1 = student1;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }//Faut pas que deux etudiants soient les memes( sinon throw erreur)

    public void setGradeReport(double gradeReport) throws ExceptionGrade {
        if(gradeReport<0 || gradeReport>20){
            throw new ExceptionGrade("Erreur : la notation doit être comprise entre 0 et 20. Fin du programme");
        }
        else {
            this.gradeReport = gradeReport;
        }
    }

    public void setGradeStudent1(double gradeStudent1) throws ExceptionGrade {
        if(gradeStudent1<0 || gradeStudent1>20){
            throw new ExceptionGrade("Erreur : la notation doit être comprise entre 0 et 20. Fin du programme");
        }
        else {
            this.gradeStudent1 = gradeStudent1;
        }
    }

    public void setGradeStudent2(double gradeStudent2) throws ExceptionGrade{
        if(gradeStudent2<0 || gradeStudent2>20){
            throw new ExceptionGrade("Erreur : la notation doit être comprise entre 0 et 20. Fin du programme");
        }
        else {
            this.gradeStudent2 = gradeStudent2;
        }
    }

    public void setEffectiveDate(LocalDateTime effectiveDate){
        this.effectiveDate = effectiveDate;
    }

    public double[] ComputeGrade(){
        LocalDateTime date1 = this.project.getDate(); //Date de rendu officiel
        LocalDateTime date2 = this.effectiveDate; //Date effective
        long numberDays= ChronoUnit.DAYS.between(date1, date2); //la ca renvoie la difference de dates, nb de jours
        double noteFinaleEtudiant1 = (gradeReport + gradeStudent1)/2;
        double noteFinaleEtudiant2 =(gradeReport + gradeStudent2)/2;

        return new double[]{noteFinaleEtudiant1 - numberDays, noteFinaleEtudiant2 - numberDays}; //Renvoyer le max entre ça et 0 (pas de note négative)

    }


    @Override
    public String toString() {
        return "Pair{" +
                "number=" + number +
                ", project=" + project +
                ", student1=" + student1 +
                ", student2=" + student2 +
                ", gradeReport=" + gradeReport +
                ", gradeStudent1=" + gradeStudent1 +
                ", gradeStudent2=" + gradeStudent2 +
                ", effectiveDate=" + effectiveDate +
                '}';
    }
}

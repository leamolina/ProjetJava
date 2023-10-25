import java.time.LocalDateTime;


public class Test {
    public static void main(String[] args) {
        System.out.println("bonjour Léa Bis");
        System.out.println("Bonjour Shirelle");
        System.out.println("Bonjour Ana");

        //Trainings:git
        Training train1 = new Training(NameTraining.MIAGE_IF, PromotionTraining.Initiale);
        Training train2 = new Training(NameTraining.IDD, PromotionTraining.Initiale);
        Training train3 = new Training(NameTraining.MIAGES_ITN, PromotionTraining.En_Alternance);
        Training train4 = new Training(NameTraining.IDD, PromotionTraining.Formation_Continue);

        //Students:
        Student student1 = new Student("Molina", "Léa", train1);
        Student student2 = new Student("Cohen", "Anaëlle", train2);
        Student student3 = new Student("Azuelos", "Shirelle", train3);
        Student student4 = new Student("Dupont", "Jean", train1);


        //Projects:
        Project project1 = new Project("Java", "Sujet du projet 1", LocalDateTime.of(2023, 12, 01, 23, 00, 00));
        Project project2 = new Project("Python", "Sujet du projet 2", LocalDateTime.of(2023, 12, 12, 00, 00, 00));
        Project project3 = new Project("C", "Sujet du projet 3", LocalDateTime.of(2024, 01, 01, 00, 00, 00));
        Project project4 = new Project("Javascript", "Sujet du projet 4", LocalDateTime.of(2023, 10, 11, 23, 00, 00));


        //Pair:
        Pair pair1 = new Pair(project1, student1, student2);
        Pair pair2 = new Pair(project1, student3, student4);
        Pair pair3 = new Pair(project2, student1, student3);

        //Test des toString:
        System.out.println(train2);
        System.out.println(student2);
        System.out.println(project2);
        System.out.println(pair2);
    }

}
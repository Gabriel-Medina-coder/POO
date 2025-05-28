package U1_TI_01_Calificaciones;

public class Main {
    public static void main(String[] args) {
        
        Estudiante student1 = new Estudiante();
        Estudiante student2 = new Estudiante();
        Estudiante student3 = new Estudiante();
        Estudiante student4 = new Estudiante();
        Estudiante student5 = new Estudiante();

        student1.setStudentName("Alice");
        student1.setStudentID("S001");
        student1.setGrades(0,9.7);
        student1.setGrades(1,8.5);
        student1.setGrades(2,8.0);
        student1.setGrades(3,9.0);
        student1.setGrades(4,8.5);


        student2.setStudentName("Bob");
        student2.setStudentID("S002");
        student2.setGrades(0,9.5);
        student2.setGrades(1,10.0);
        student2.setGrades(2,8.0);
        student2.setGrades(3,8.5);
        student2.setGrades(4,8.0);
        

        student3.setStudentName("Charlie");
        student3.setStudentID("S003");
        student3.setGrades(0,9.5);
        student3.setGrades(1,10.0);
        student3.setGrades(2,9.0);
        student3.setGrades(3,8.5);
        student3.setGrades(4,9.5);

        student4.setStudentName("Diana");
        student4.setStudentID("S004");
        student4.setGrades(0,9.0);
        student4.setGrades(1,8.5);
        student4.setGrades(2,9.5);
        student4.setGrades(3,9.0);
        student4.setGrades(4,8.0);

        student5.setStudentName("Ethan");
        student5.setStudentID("S005");
        student5.setGrades(0,9.5);
        student5.setGrades(1,8.0);
        student5.setGrades(2,10.0);
        student5.setGrades(3,6.5);
        student5.setGrades(4,9.0);
        

        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Average: " + student1.calculateAverage());
        System.out.println("Approved: " + (student1.isApproved() ? "Yes" : "No"));

        System.out.println("\nStudent Name: " + student2.getStudentName());
        System.out.println("Student ID: " + student2.getStudentID());
        System.out.println("Average: " + student2.calculateAverage());
        System.out.println("Approved: " + (student2.isApproved() ? "Yes" : "No"));

        System.out.println("\nStudent Name: " + student3.getStudentName());
        System.out.println("Student ID: " + student3.getStudentID());
        System.out.println("Average: " + student3.calculateAverage());
        System.out.println("Approved: " + (student3.isApproved() ? "Yes" : "No"));

        System.out.println("\nStudent Name: " + student4.getStudentName());
        System.out.println("Student ID: " + student4.getStudentID());
        System.out.println("Average: " + student4.calculateAverage());
        System.out.println("Approved: " + (student4.isApproved() ? "Yes" : "No"));

        System.out.println("\nStudent Name: " + student5.getStudentName());
        System.out.println("Student ID: " + student5.getStudentID());
        System.out.println("Average: " + student5.calculateAverage());
        System.out.println("Approved: " + (student5.isApproved() ? "Yes" : "No"));

    };
}

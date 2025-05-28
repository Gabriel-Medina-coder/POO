package U1_TI_01_Calificaciones;

public class Estudiante {
    private String studentName;
    private String studentID;
    private double[] grades = new double[5];

    public double calculateAverage() {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public boolean isApproved() {
        return calculateAverage() >= 7.0;
    }

    //Getters
    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public double[] getGrades(int i) {
        return grades;
    }
    //Setters

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGrades(int index, double grade) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = grade;
        }
    }

}

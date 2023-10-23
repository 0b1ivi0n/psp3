package classes;

public class Teenager {
    private String fullName;
    private String gender;
    private int age;
    private int schoolNumber;
    private double performance;
    public Teenager(String fullName, String gender, int age, int schoolNumber, double performance) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.schoolNumber = schoolNumber;
        this.performance = performance;
    }

    public void printInfo(){
        System.out.println("ФИО: " + fullName );
        System.out.println("Гендер: " + gender);
        System.out.println("Возраст: " + age);
        System.out.println("Номер школы: " + schoolNumber);
        System.out.println("Успеваеомсть: " + performance);
    }

    public void printRole() {
        System.out.println("Я подросток");
    }
}

package classes;

public class Child {
    private String fullName;
    private String gender;
    private int age;
    private int kindergartenNumber;
    public Child(String fullName, String gender, int age, int kindergartenNumber) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.kindergartenNumber = kindergartenNumber;
    }

    public void printInfo(){
        System.out.println("ФИО: " + fullName );
        System.out.println("Гендер: " + gender);
        System.out.println("Возраст: " + age);
        System.out.println("Номер детского сада: " + kindergartenNumber);
    }

    public void printRole() {
        System.out.println("Я ребенок");
    }

}

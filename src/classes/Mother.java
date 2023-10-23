package classes;

public class Mother extends Parent {
    private final String gender = "woman";
    public Mother(String fullName, int age, int childNumber, String workPlace) {
        super(fullName, age, childNumber, workPlace);
    }

    public void printInfo(){
        System.out.println("ФИО: " + fullName );
        System.out.println("Гендер: " + gender);
        System.out.println("Возраст: " + age);
        System.out.println("Число детей: " + childNumber);
        System.out.println("Место работы: " + workPlace);
    }

    public void printRole() {
        System.out.println("Я мать");
    }
}

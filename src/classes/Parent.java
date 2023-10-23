package classes;

public abstract class Parent implements Object, Human {

    protected String fullName;
    protected int age;
    protected int childNumber;
    protected String workPlace;

    public Parent(String fullName, int age, int childNumber, String workPlace) {
        this.fullName = fullName;
        this.age = age;
        this.childNumber = childNumber;
        this.workPlace = workPlace;
    }

}

package Main;

import classes.*;

public class Main {
    public static void main(String[] args) {
        Father father = new Father("Иван Иванович Иванов", 35, 2, "ООО \"Рога и копыта\"");
        father.printInfo();
        father.printRole();

        Child child = new Child("Анна Петровна Петрова", "женский", 5, 12);
        child.printInfo();
        child.printRole();

        Teenager teenager = new Teenager("Сергей Николаевич Смирнов", "мужской", 15, 34, 4.5);
        teenager.printInfo();
        teenager.printRole();

        Mother parent = new Mother("Елена Александровна Кузнецова", 35, 2,  "ООО \"Рога и копыта\"");
        parent.printInfo();
        teenager.printRole();

    }
}
package com.company;

public class Main {

    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Гарри Поттер", 85, 64, 87, 93, 89);
        Griffindor hermioneGranger = new Griffindor("Гермиона Грейнджер", 80, 93, 80, 97, 84);
        Griffindor ronWeasley = new Griffindor("Рон Уизли", 70, 88, 67, 73, 94);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 83, 91, 87, 94, 81, 77, 76);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 63, 80,66, 84, 79, 54, 48);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 64, 75, 53, 75, 80, 65, 70);

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 79, 65, 80, 67, 73, 68);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 69, 85, 79, 88, 83, 90);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 65, 75, 80, 45, 77, 88);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 73, 55, 81, 94, 82);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 80, 90, 59, 63, 70);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 63, 68, 77, 81, 63);

        System.out.println(harryPotter);
        System.out.println();
        dracoMalfoy.compareStudents(harryPotter);
        System.out.println();
        cedricDiggory.compareStudentsHufflepuff(justinFinchFletchley);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 85, 64, 87, 93, 89),
                new Griffindor("Гермиона Грейнджер", 80, 93, 80, 97, 84),
                new Griffindor("Рон Уизли", 70, 88, 67, 73, 94)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 83, 91, 87, 94, 81, 77, 76),
                new Slytherin("Грэхэм Монтегю", 63, 80,66, 84, 79, 54, 48),
                new Slytherin("Грегори Гойл ", 64, 75, 53, 75, 80, 65, 70),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 79, 65, 80, 67, 73, 68),
                new Ravenclaw("Падма Патил", 69, 85, 79, 88, 83, 90),
                new Ravenclaw("Маркус Белби", 65, 75, 80, 45, 77, 88)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 73, 55, 81, 94, 82),
                new Hufflepuff("Седрик Диггори", 80, 90, 59, 63, 70),
                new Hufflepuff("Джастин Финч-Флетчли", 63, 68, 77, 81, 63)
        };

        PrintService printService = new PrintService();
        printService.print(griffindors);
        printService.print(slytherins);
        printService.print(ravenclaws);
        printService.print(hufflepuffs);

    }
}

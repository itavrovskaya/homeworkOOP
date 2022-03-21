package com.company;

public class Hogwarts {

    private String name;
    private int powerOfMagic;
    private int apparation;

    public Hogwarts(String name, int powerOfMagic, int apparation) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.apparation = apparation;
    }

    public String toString() {
        return "Студент " + name + ", имеет силу магии: " + powerOfMagic + ", расстояние трансгрессии: " + apparation;
    }

    public void compareStudents(Hogwarts student) {
        if (this.getPowerOfMagic() > student.getPowerOfMagic()) {
            System.out.println(this.getName() + " имеет выше уровень магии, чем " + student.getName());
        } else if (this.getPowerOfMagic() == student.getPowerOfMagic()) {
            System.out.println("Сила магии студента - " + this.getName() +
                    " равна силе магии студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " имеет выше уровень магии, чем " + this.getName());
        }
        if (this.getApparation() > student.getApparation()) {
            System.out.println(this.getName() + " умеет трансгрессировать на большее расстояние, чем " + student.getName());
        } else if (this.getApparation() == student.getApparation()) {
            System.out.println("Расстояние трансгрессии студента - " + this.getName() +
                    " равно расстоянию трансгрессии студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " трансгрессирует на большее расстояние, чем " + this.getName());
        }
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getApparation() {
        return apparation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setApparation(int apparation) {
        this.apparation = apparation;
    }


}

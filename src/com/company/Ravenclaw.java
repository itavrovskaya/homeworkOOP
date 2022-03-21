package com.company;

public class Ravenclaw extends Hogwarts{

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagic, int apparation, int intelligence, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, apparation);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public String toString() {
        return super .toString() + ", уровень ума: " + intelligence + ", уровень мудрости: " + wisdom +
                ", уровень остроумия: " + wit + ", уровень креативности: " + creativity;
    }

    public void compareStudentsRavenclaw(Ravenclaw student) {
        if (this.getIntelligence() > student.getIntelligence()) {
            System.out.println(this.getName() + " более умный(ая), чем " + student.getName());
        } else if (this.getIntelligence() == student.getIntelligence()) {
            System.out.println("Студент - " + this.getName() +
                    " и студент - " + student.getName() + " одинаково умны");
        } else {
            System.out.println(student.getName() + " более умный(ая), чем " + this.getName());
        }
        if (this.getWisdom() > student.getWisdom()) {
            System.out.println(this.getName() + " более мудрый(ая), чем " + student.getName());
        } else if (this.getWisdom() == student.getWisdom()) {
            System.out.println("Уровень мудрости студента - " + this.getName() +
                    " равен уровню мудрости студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более мудрый(ая), чем " + this.getName());
        }
        if (this.getWit() > student.getWit()) {
            System.out.println(this.getName() + " более остроумный(ая), чем " + student.getName());
        } else if (this.getWit() == student.getWit()) {
            System.out.println("Остроумие студента - " + this.getName() +
                    " равно остроумию студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более остроумный(ая), чем " + this.getName());}
        if (this.getCreativity() > student.getCreativity()) {
            System.out.println(this.getName() + " более креативный(ая), чем " + student.getName());
        } else if (this.getCreativity() == student.getCreativity()) {
            System.out.println("" +
                    "Креативность студента - " + this.getName() +
                    " равна креативности студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более креативный(ая), чем " + this.getName());}
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}

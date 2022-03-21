package com.company;

public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int apparation, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, apparation);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public void compareStudents(Slytherin student) {
        if (this.getCunning() > student.getCunning()) {
            System.out.println(this.getName() + " более хитрый(ая), чем " + student.getName());
        } else if (this.getCunning() == student.getCunning()) {
            System.out.println("Хитрость студента - " + this.getName() +
                    " равна хитрости студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более хитрый(ая), чем " + this.getName());
        }
        if (this.getDetermination() > student.getDetermination()) {
            System.out.println(this.getName() + " более решительный(ая), чем " + student.getName());
        } else if (this.getDetermination() == student.getDetermination()) {
            System.out.println("Уровень решительности студента - " + this.getName() +
                    " равен уровню решительности студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более решительный(ая), чем " + this.getName());
        }
        if (this.getAmbition() > student.getAmbition()) {
            System.out.println(this.getName() + " более амбициозный(ая), чем " + student.getName());
        } else if (this.getAmbition() == student.getAmbition()) {
            System.out.println("Амбициозность студента - " + this.getName() +
                    " равна амбициозности студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более амбициозный(ая), чем " + this.getName());}
        if (this.getResourcefulness() > student.getResourcefulness()) {
            System.out.println(this.getName() + " более находчивый(ая), чем " + student.getName());
        } else if (this.getResourcefulness() == student.getResourcefulness()) {
            System.out.println("" +
                    "Находчивость студента - " + this.getName() +
                    " равна находчивости студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более находчивый(ая), чем " + this.getName());}
        if (this.getLustForPower() > student.getLustForPower()) {
            System.out.println(this.getName() + " жаждет власти больше, чем " + student.getName());
        } else if (this.getLustForPower() == student.getLustForPower()) {
            System.out.println("Жажда власти студента - " + this.getName() +
                    " равна жажде власти студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " жаждет власти больше, чем " + this.getName());}
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}

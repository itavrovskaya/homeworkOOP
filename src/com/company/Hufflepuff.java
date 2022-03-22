package com.company;

public class Hufflepuff extends Hogwarts{

    private int hardworking;
    private int loyalty;
    private int fairness;

    public Hufflepuff(String name, int powerOfMagic, int apparation, int hardworking, int loyalty, int fairness) {
        super(name, powerOfMagic, apparation);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.fairness = fairness;
    }

    public void compareStudentsHufflepuff(Hufflepuff student) {
        if (this.getHardworking() > student.getHardworking()) {
            System.out.println(this.getName() + " более трудолюбивый(ая), чем " + student.getName());
        } else if (this.getHardworking() == student.getHardworking()) {
            System.out.println("Трудолюбивость студента - " + this.getName() +
                    " равна трудолюбивости студент - " + student.getName());
        } else {
            System.out.println(student.getName() + " более трудолюбивый(ая), чем " + this.getName());
        }
        if (this.getLoyalty() > student.getLoyalty()) {
            System.out.println(this.getName() + " более верный(ая), чем " + student.getName());
        } else if (this.getLoyalty() == student.getLoyalty()) {
            System.out.println("Верность студента - " + this.getName() +
                    " верность студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более верный(ая), чем " + this.getName());
        }
        if (this.getFairness() > student.getFairness()) {
            System.out.println(this.getName() + " более честный(ая), чем " + student.getName());
        } else if (this.getFairness() == student.getFairness()) {
            System.out.println("Честность студента - " + this.getName() +
                    " равна честности студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более честный(ая), чем " + this.getName());}
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getFairness() {
        return fairness;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setFairness(int fairness) {
        this.fairness = fairness;
    }

    public String toString() {
        return super .toString() + ", уровень трудолюбия: " + hardworking + ", уровень верности: " + loyalty +
                ", уровень честности: " + fairness;
    }
}

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
}

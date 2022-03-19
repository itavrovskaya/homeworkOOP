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

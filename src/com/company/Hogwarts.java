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

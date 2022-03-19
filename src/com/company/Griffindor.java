package com.company;

public class Griffindor extends Hogwarts{

    private int chivalry;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int apparation, int chivalry, int honor, int courage) {
        super(name, powerOfMagic, apparation);
        this.chivalry = chivalry;
        this.honor = honor;
        this.courage = courage;
    }

    public int getChivalry() {
        return chivalry;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setChivalry(int chivalry) {
        this.chivalry = chivalry;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
}

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

    public String toString() {
        return  super .toString() + ", уровень благородства: " + chivalry + ", уровень чести: " + honor +
                ", уровень мужества: " + courage;
    }

    public void compareStudentsGriffindor(Griffindor student) {
        if (this.getChivalry() > student.getChivalry()) {
            System.out.println(this.getName() + " более благороден(на), чем " + student.getName());
        } else if (this.getChivalry() == student.getChivalry()) {
            System.out.println("Благородность студента - " + this.getName() +
                    " равна благородности студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более благороден(на), чем " + this.getName());
        }
        if (this.getHonor() > student.getHonor()) {
            System.out.println(this.getName() + " имеет более высокий уровень чести, чем " + student.getName());
        } else if (this.getHonor() == student.getHonor()) {
            System.out.println("Уровень чести студента - " + this.getName() +
                    " равен уровню чести студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " имеет более высокий уровень чести, чем " + this.getName());
        }
        if (this.getCourage() > student.getCourage()) {
            System.out.println(this.getName() + " более мужественнен(на), чем " + student.getName());
        } else if (this.getCourage() == student.getCourage()) {
            System.out.println("Мужество студента - " + this.getName() +
                    " равно мужеству студента - " + student.getName());
        } else {
            System.out.println(student.getName() + " более мужественнен(на), чем " + this.getName());}
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

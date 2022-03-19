package com.company;

public class PrintService {

    public void print(Griffindor[] griffindors) {
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя: " + griffindor.getName() + "; Сила магии: " + griffindor.getPowerOfMagic() +
                    ", расстояние трансгрессии: " + griffindor.getApparation() +
                    ", благородство: " + griffindor.getChivalry() + ", честь: " + griffindor.getHonor() + ", храбрость: " +
                    griffindor.getCourage() + ";");}
        System.out.println( );
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getName() + "; Сила магии: " + slytherin.getPowerOfMagic() +
                    ", расстояние трансгрессии: " + slytherin.getApparation() +
                    ", хитрость " + slytherin.getCunning() + ", решительность " +
                    slytherin.getDetermination() + ", амбициозность " + slytherin.getAmbition() +
                    ", находчивость " + slytherin.getResourcefulness() + ", жажда власти " +
                    slytherin.getLustForPower() + ";");}
        System.out.println( );
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя: " + ravenclaw.getName() + "; Сила магии: " + ravenclaw.getPowerOfMagic() +
                    ", расстояние трансгрессии: " + ravenclaw.getApparation() +
                    ", ум " + ravenclaw.getIntelligence() + ", мудрость " + ravenclaw.getWisdom() +
                    ", остроумие " + ravenclaw.getWit() + ", творчество " + ravenclaw.getCreativity() + ";");}
        System.out.println( );
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя: " + hufflepuff.getName() + "; Сила магии: " + hufflepuff.getPowerOfMagic() +
                    ", расстояние трансгрессии: " + hufflepuff.getApparation() +
                    ", трудолюбивость " + hufflepuff.getHardworking() + ", верность " + hufflepuff.getLoyalty() +
                    ", честность " + hufflepuff.getFairness() + ";");}
    }
}

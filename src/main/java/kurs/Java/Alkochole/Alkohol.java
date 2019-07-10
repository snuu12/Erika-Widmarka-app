package kurs.Java.Alkochole;


public enum Alkohol {

    BEER(0.05),
    VODKA(0.4),
    WINE(0.112),
    HOOCH(0.56);


    private  double strenght;

    Alkohol(double strenght){
       this.strenght=strenght;
    }

    public double getStrenght() {
        return strenght;
    }

    public void setStrenght(double strenght) {
        this.strenght = strenght;
    }
}

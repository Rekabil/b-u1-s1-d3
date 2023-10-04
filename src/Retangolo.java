package src;

import java.util.Random;

public class Retangolo {

    private String name;
    private int lato;
    private int altezza;

            public Retangolo(String name, int lato, int altezza){
                Random rndm = new Random();
                this.name = name;
                this.lato = lato;
                this.altezza = altezza;
            }

            public void stampaRetangolo() {
                System.out.println("Perimetro del "+ this.name+ " : " + (this.lato+this.altezza)*2);
                System.out.println("Area del "+ this.name+ " : " + (this.lato*this.altezza));
            }
}

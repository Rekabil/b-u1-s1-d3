import src.Retangolo;
import src.SIM;

public class Main {
public static void main(String[] args) {
System.out.println("Esercizio 1");

Retangolo ret1 = new Retangolo("Ret1", 15,21);
    Retangolo ret2 = new Retangolo("Ret2", 14,5);
    Retangolo ret3 = new Retangolo("Ret3", 2,7);

ret1.stampaRetangolo();
    System.out.println("Esercizio 2");

    SIM me = new SIM("3994052415" , 0);

    me.stampaSIM();
}


}

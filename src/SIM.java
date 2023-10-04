package src;

public class SIM {

    private String number;
    private int credit;

    public SIM(String number, int credit){
        this.number = number;
        this.credit = credit;
    }
    public void stampaSIM() {

        System.out.println("Phone number : " + this.number);
        System.out.println("Credit Remaining: " + this.credit);
        for (int i =1; i < 6 ; i++) {
            System.out.println(i +": Call:  " + "Duration:");
        }
    }

}

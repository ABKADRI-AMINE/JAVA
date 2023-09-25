package ex3td2;

import ex3td2.Ratio;

public class Main {
    public static void main(String[] args) {
        Ratio chif1 = new Ratio(1,4);
        Ratio chif2 = new Ratio(3,8);

        chif1.addition(chif2);
        System.out.println(chif1.toString());
        Ratio chif3 = new Ratio(7,3);
        Ratio chif4 = new Ratio(3,5);

        chif3.addition(chif4);
        System.out.println(chif3.toString());
        Ratio chif5 = new Ratio(1,2);
        Ratio chif6 = new Ratio(2,7);
        System.out.println(chif5.egale(chif6));
        chif5.produit(chif6);

        System.out.println(chif5.toString());
    }
}
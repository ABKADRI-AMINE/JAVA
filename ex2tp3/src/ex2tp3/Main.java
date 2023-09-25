package ex2tp3;

public class Main {
    public static void main(String[] args) {
        TabUtils tableu = new TabUtils();
        int[] t1 = {1,2,3,4,5,6};
//        int[] t2 = {1,2,3,4,5,6};
        int[] t2 = {1,2,3,4,5,6,7,8,9};
        try{
            for (int i = 0; i < t1.length; i++) {
                System.out.println(tableu.compareTab(t1,t2)[i]);
            }
        }
        catch (Exception err){
            System.out.println(err);
        }

    }
}
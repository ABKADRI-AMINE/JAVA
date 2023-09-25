package ex2tp3;

public class TabUtils {
    public int[] compareTab(int[] t1,int[] t2) throws Exception{

        int t3[] = new int[100];
        if(t1.length == t2.length){
            for (int i = 0; i < t1.length; i++) {
                if (t1[i] != t2[i]) {
                    t3[i] = 1;
                }
                else{
                    t3[i] = 0;
                }
            }
        }
        else {
            throw new Exception("Erreur,Veuillez Entrer deux tableaux ayant la meme dimensions!");
        }

        return t3;

    }
}

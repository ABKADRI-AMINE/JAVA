public class Main {
    public static void main(String[] args) {
        TabUtils tab =new TabUtils();
        int []t1={1,2,3,4};
        int []t2={1,2,3,3};
        for (int i = 0; i < t1.length; i++) {
            System.out.println(tab.CompareTab(t1,t2)[i]);
        }

    }
}
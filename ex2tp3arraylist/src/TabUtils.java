public class TabUtils {
    public int [] CompareTab(int []t1,int[]t2){
         int [] t3=new int[100];
        if(t1.length==t2.length){
            for(int i=0;i< t1.length;i++){
                if(t1[i]==t2[i]){
                    t3[i]=0;
                }
                else{
                    t3[i]=1;
                }
            }

        }
        return t3;
    }
}

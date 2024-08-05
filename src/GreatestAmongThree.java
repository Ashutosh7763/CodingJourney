public class GreatestAmongThree {
    public static void main(String[] args) {
        int max[]={4,7,9,12,12,55,87,-16,200,700,500,400};
        int gt=max[0],i;
        for(i=0;i<max.length;i++)
        {
            if(max[i]>=gt){
                gt=max[i];
            }
        }
        System.out.println(gt);
        int sgt=max[0];
        for(i=0;i<max.length;i++)
        {
            if(max[i]>=sgt && gt!=max[i]){
                sgt=max[i];
            }
        }
        System.out.println(sgt);
        int tgt=max[0];
        for(i=0;i<max.length;i++)
        {
            if(max[i]>=tgt && gt!=max[i] && sgt!=max[i] ){
                tgt=max[i];
            }
        }
        System.out.println(tgt);
    }
}

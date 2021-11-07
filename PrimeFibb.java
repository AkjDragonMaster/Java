public class PrimeFibb {
    public static void main(String[] args) {
        int fibb = 2 , no1 = 1, no0 = 0, i = 2;
        while(fibb < 100){
            fibb = no1 + no0;
            for (int j = 0; j < fibb/i; j++) {
                if(fibb%i != 0){
                    System.out.print(fibb+" ");
                }else{
                    i++;
                }
            } 
            no0 = no1;
            no1 = fibb;
        }
    }
}

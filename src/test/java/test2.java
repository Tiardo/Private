public class test2 {
    public static void main(String[] args) {
    int i,r;
    boolean d;
        for( i=2; i < 100; i++){

            d=true;
             for(r=2; r<= i/r; r++)
                 if((i%r) == 0) d=false;
             if(d)

            System.out.println(i);
        }



    }


}

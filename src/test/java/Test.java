public class Test {
    public static void main(String args[] ) {
        double xer, ser;
        int y;

        y = 0;
        for(xer = 1; xer <= 100; xer++) {
            ser = xer * 3.7854;
            System.out.println(xer + "888" + ser + "888");
            y++;
            if(y == 10) {
                System.out.println();
                y = 0;
            }
        }
    }
}
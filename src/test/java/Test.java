public class Test {
    public static void main(String[] args) {
        double meter;
        int counter, duim;

        counter = 0;
        for(duim = 1; duim <= 100; duim++) {
            meter = duim * 39.37;
            System.out.println(duim + " дюймов равно " + meter + " метров ");
            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
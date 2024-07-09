public class MobNo {
    static int count = 0;
    public static void main(String[] args) {

        String baseNumber = "+919258899";
        generateAllNumber(baseNumber);

    }

    public static void generateAllNumber(String baseNumber) {
        for (int i = 100; i < 1000; i++) {
            String lastNumber = String.format("%03d", i);
            boolean condition1=Integer.parseInt(lastNumber)%2==1;
            boolean condition2=(Integer.parseInt(lastNumber)/10)%10==0;
            if (lastNumber.contains("0") && condition1 &&condition2) {
                String fullNumber = baseNumber + lastNumber;
                System.out.println(fullNumber);
                count++;
            }
        }
        System.out.println("Total number generated = "+count);
    }
}

package horseracing;

public class Test {
    public static void main(String[] args) {
        // String temp = "blahblah";
        // System.out.printf("Hello%10sgood%10sbye", temp, "cha");

        for (int i = 0; i < 5; i++) {
            String s1 = "" + ((int)(Math.random()*10) + 1);
            String s2 = "" + (int)(Math.random()*10) + 1;
            String s3 = "" + (int)(Math.random()*10) + 1;
            String s4 = "" + (int)(Math.random()*10) + 1;

            System.out.println("+-----+-----+-----+-----+");
            System.out.printf("|%-5s|%5s|%5s|%5s|\n", s1, s2, s3, s4);
        }
        System.out.println("+-----+-----+-----+-----+");

    }
}

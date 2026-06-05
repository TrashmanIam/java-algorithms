package java8.lambda.theory;

public class simpleExample {

    public static void main(String [] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello R1 world !!");
            }
        };
        //SAME
        Runnable r2 = () -> System.out.println("Hello R2 world !!");

        r1.run();
        r2.run();

    }

}

package concepts;

public class ExceptionsCaughtTest {

    public static void main(String[] args) {

        //Output: "NullPointerException caught" with Stacktrace
        String str = null;
        try {
            str.toCharArray();
        } catch (Exception e) {
            System.out.println("NullPointerException caught");
            e.printStackTrace();
        }

        //Output: Stacktrace for ClassNotFoundException
        try {
            Class cls = Class.forName("com.reflection.test");
            Object obj = cls.newInstance();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}

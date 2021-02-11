

public class Main {
    public static void main(String[] args) {

        Testing classForTesting = new Testing();
        TestsHandler.start(classForTesting.getClass());

        System.out.println("--------");
        ClassExplorer.outClassInfo(String.class);
    }
}

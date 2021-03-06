public class Testing {

    @Test(priority = 5)
    public void testMethod1() {
        System.out.println("Test method priority = 5");
    }

    @Test(priority = 11)
    public void testMethod2() {
        System.out.println("Test method priority = 11");
    }

    @Test(priority = 10)
    public void testMethod3() {
        System.out.println("Test method priority = 10");
    }

    @Test(priority = 7)
    private void testMethod4() {
        System.out.println("Test method priority = 7");
    }

    @AfterSuite
    public void afterMethod() {
        System.out.println("AfterSuiteMethod");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuiteMethod");
    }

}

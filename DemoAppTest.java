package RamaSaiAdvancedJavaPractice.JDBC;

public class DemoAppTest{
    static{
        System.out.println("inside static block");
    }
public DemoAppTest()
{
    System.out.println("inside constructor");
}
public static void main(String[] args)
{
    System.out.println("Demo app main");
    System.out.println("======");
    try {
        Class.forName("RamaSaiAdvancedJavaPractice.JDBC.Demo");
        Class.forName("RamaSaiAdvancedJavaPractice.JDBC.Test");
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    System.out.println("======");

}
}
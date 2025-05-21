
package vinay;

public interface i1 {
    void HI();
    void BYE();
}

public interface i2 {
    default void sub() {
        System.out.println("bye");
    }
}

public class Demo implements i1, i2 {
    public void HI() {
        System.out.println("Hello from HI");
    }

    public void BYE() {
        System.out.println("Goodbye from BYE");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.HI();    // Prints: Hello from HI
        demo.BYE();   // Prints: Goodbye from BYE
        demo.sub();   // Prints: bye
    }
}
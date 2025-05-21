
package vinay;

public class audi {
    public void drive() {
        System.out.println("Driving an Audi car");
    }
}

public class lamborgini extends audi {
    public void spo() {
        System.out.println("sports car");
    }

    public static void main(String[] args) {
        lamborgini car = new lamborgini();
        car.drive(); // Prints: Driving an Audi car
        car.spo();   // Prints: sports car
    }
}
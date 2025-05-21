package vinay;

public class hit1 {
    public void hero1() {
        System.out.println("viswaksen");
    }
}

class hit2 extends hit1 {
    public void hero2() {
        System.out.println("adivisesh");
    }
}

public class hit3 extends hit2 {
    public void hero3() {
        System.out.println("nani");
    }

    public static void main(String[] args) {
        hit3 movie = new hit3();
        movie.hero1(); // Prints: viswaksen
        movie.hero2(); // Prints: adivisesh
        movie.hero3(); // Prints: nani
    }
}
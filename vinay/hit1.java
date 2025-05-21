
package vinay;
interface movie {
    void hero1();
}

public class hit1 implements movie {
    

    public void hero1() {
        System.out.println("viswaksen");
    }

    public static void main(String[] args) {
        hit1 movie = new hit1();
        movie.hero1();
    }
}

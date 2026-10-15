/** 인사 약속 */
public interface Greet {
    public class GreetMain {
        public static void main(String[] args) {
            Greet greet = new MorningGreet();
            greet.greeting();
        }
    }
    void greeting();
}


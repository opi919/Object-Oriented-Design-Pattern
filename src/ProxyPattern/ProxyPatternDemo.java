package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("text.jpg");

        image.display();
        image.display();
    }
}

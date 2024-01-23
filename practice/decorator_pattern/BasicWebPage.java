package practice.decorator_pattern;

public class BasicWebPage implements WebPage {
    private String content;

    public BasicWebPage(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Basic webpage content = " + content);
    }

}

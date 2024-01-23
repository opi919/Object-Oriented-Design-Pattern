package practice.decorator_pattern;

public class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage webPage) {
        super(webPage);
    }

    public void display() {
        authorization();
        super.display();
    }

    private void authorization() {
        System.out.println("Checking user authorization...");

        System.out.println("User is authorized.");
    }
}

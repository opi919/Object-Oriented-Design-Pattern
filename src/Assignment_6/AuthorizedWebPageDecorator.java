package Assignment_6;

public class AuthorizedWebPageDecorator extends WebPageDecorator {
    public AuthorizedWebPageDecorator(WebPage decoratedWebPage) {
        super(decoratedWebPage);
    }

    @Override
    public void display() {
        checkAuthentication();
        super.display();
    }

    private void checkAuthentication() {
        System.out.println("Checking user authorization...");

        System.out.println("User is authorized.");
    }
}

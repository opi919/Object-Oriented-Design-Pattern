package Assignment_6;

public class Main {
    public static void main(String[] args) {
        WebPage basicWebPage = new BasicWebPage("this is a basic webpage");

        WebPage authorizedWebPage = new AuthorizedWebPageDecorator(basicWebPage);
        // authorizedWebPage.display();

        WebPage paginatedWebPage = new PaginatedWebPageDecorator(authorizedWebPage, 5);

        paginatedWebPage.display();
    }
}

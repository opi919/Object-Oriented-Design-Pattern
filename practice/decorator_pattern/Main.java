package practice.decorator_pattern;

public class Main {
    public static void main(String[] args) {
        WebPage basicWebPage = new BasicWebPage("i am basic webpage");
        basicWebPage.display();

        WebPage authorizedWebPage = new AuthorizedWebPage(basicWebPage);
        authorizedWebPage.display();

        WebPage paginatedWebPage = new PaginatedWebPage(authorizedWebPage, 5);
        paginatedWebPage.display();
    }
}

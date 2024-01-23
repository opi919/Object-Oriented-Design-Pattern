package practice.decorator_pattern;

public class WebPageDecorator implements WebPage {
    protected WebPage decoratedWebPage;

    public WebPageDecorator(WebPage decoratWebPage) {
        this.decoratedWebPage = decoratWebPage;
    }

    @Override
    public void display() {
        decoratedWebPage.display();
    }

}

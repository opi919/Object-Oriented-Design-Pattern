package Assignment_6;

public class WebPageDecorator implements WebPage {
    protected WebPage decoratedWebPage;

    public WebPageDecorator(WebPage decoratedWebPage) {
        this.decoratedWebPage = decoratedWebPage;
    }

    @Override
    public void display() {
        decoratedWebPage.display();
    }

}

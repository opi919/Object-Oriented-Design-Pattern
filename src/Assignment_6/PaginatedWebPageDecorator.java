package Assignment_6;

public class PaginatedWebPageDecorator extends WebPageDecorator {
    private int pageSize;

    public PaginatedWebPageDecorator(WebPage decoratedWebPage, int pageSize) {
        super(decoratedWebPage);
        this.pageSize = pageSize;
    }

    @Override
    public void display() {
        super.display();
        addPagination();
    }

    private void addPagination() {
        System.out.println("Adding pagination to the web page. Page size: " + pageSize);
    }

}

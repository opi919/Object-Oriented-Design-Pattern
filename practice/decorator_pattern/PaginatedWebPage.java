package practice.decorator_pattern;

public class PaginatedWebPage extends WebPageDecorator {
    private int pageSize;

    public PaginatedWebPage(WebPage webPage, int pageSize) {
        super(webPage);
        this.pageSize = pageSize;
    }

    public void display() {
        super.display();
        addPagination();
    }

    private void addPagination() {
        System.out.println("Adding pagination to the web page. Page size: " + pageSize);
    }

}

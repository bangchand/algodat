public class Book {
    private String title;
    private int page;

    public Book(String title, int page) {
        this.title = title;
        this.page = page;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPage() {
        return this.page;
    }

    @Override
    public String toString() {
        return "[" + title + ", " + page + " hal]";
    }
}
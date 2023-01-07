public class Book {
    private String title;
    private String author;
    private int publication;
    private int pages;

    public Book() {
    }

    public void setAuthor(String author) {
        int count = 0;
        for (int i = 0; i < author.length(); i++) {
            if (!((author.charAt(i) >= 'a' && author.charAt(i) <= 'z')
                    || (author.charAt(i) >= 'A' && author.charAt(i) <= 'Z')
                    || author.charAt(i) == ' ' || author.charAt(i) == '-')) {
                count++;
            }
        }
        if (count == 0) {
            this.author = author;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublication(int publication) {
        if (0 < publication && publication < 2023)
            this.publication = publication;
    }

    public void setPages(int pages) {
        if (10 < pages && pages < 5000)
            this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublication() {
        return publication;
    }

    public int getPages() {
        return pages;
    }

}

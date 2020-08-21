class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getYearOfPublishing() {
        return yearOfPublishing;
    }

    void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    String[] getAuthors() {
        return authors.clone();
    }

    void setAuthors(String[] authors) {
        this.authors = java.util.Arrays.copyOf(authors, authors.length);

    }
}
class Book {
    private String title;
    private String author;
    private int totalCopies;
    private int issuedCopies;

    Book(String title, String author, int totalCopies) {
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.issuedCopies = 0;
    }

    void issueBook() {
        if (issuedCopies < totalCopies) {
            issuedCopies++;
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("No copies available.");
        }
    }

    void returnBook() {
        if (issuedCopies > 0) {
            issuedCopies--;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("No book to return.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Total Copies: " + totalCopies);
        System.out.println("Available Copies: " + (totalCopies - issuedCopies));
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling", 5);
        b.display();

        b.issueBook();
        b.issueBook();
        b.display();

        b.returnBook();
        b.display();
    }
}

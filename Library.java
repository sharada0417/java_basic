// Base class
class Book {
    private String title;
    private String author;
    
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Getters and Setters (Encapsulation)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to be overridden by subclasses (Polymorphism)
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass for Printed Books
class PrintedBook extends Book {
    private int pages;
    private String publisher;
    
    // Constructor
    public PrintedBook(String title, String author, int pages, String publisher) {
        super(title, author); // Calling the parent constructor
        this.pages = pages;
        this.publisher = publisher;
    }
    
    // Getters and Setters
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + pages);
        System.out.println("Publisher: " + publisher);
    }
}

// Subclass for EBooks
class Ebook extends Book {
    private double fileSize;  // in MB
    private String format;    // e.g., PDF, ePub
    
    // Constructor
    public Ebook(String title, String author, double fileSize, String format) {
        super(title, author); // Calling the parent constructor
        this.fileSize = fileSize;
        this.format = format;
    }
    
    // Getters and Setters
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }
}

// Subclass for AudioBooks
class AudioBook extends Book {
    private double duration;  // in hours
    private String audioFormat; // e.g., MP3, WAV
    
    // Constructor
    public AudioBook(String title, String author, double duration, String audioFormat) {
        super(title, author); // Calling the parent constructor
        this.duration = duration;
        this.audioFormat = audioFormat;
    }
    
    // Getters and Setters
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Audio Format: " + audioFormat);
    }
}

// Main class to test the implementation
public class Library {
    public static void main(String[] args) {
        // Creating objects of different book types
        Book printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 180, "Scribner");
        Book ebook = new Ebook("1984", "George Orwell", 1.5, "PDF");
        Book audioBook = new AudioBook("The Hobbit", "J.R.R. Tolkien", 11.5, "MP3");

        // Displaying details of each book (Polymorphism in action)
        System.out.println("Printed Book Details:");
        printedBook.displayDetails();
        System.out.println("\nEbook Details:");
        ebook.displayDetails();
        System.out.println("\nAudioBook Details:");
        audioBook.displayDetails();
    }
}

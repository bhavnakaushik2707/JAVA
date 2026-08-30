public class Book {
    private String title;
    private String author;
    private String bookCode;
    private boolean loaned;
    public Book(String title, String author, String bookCode)
    {
        if (title == null||title.isBlank())
            {
                title = "Unknown";
            }
        if (author == null||author.isBlank())
            {
                author = "Unknown";
            }
        if (bookCode == null||bookCode.isBlank())
            {
            bookCode = "Unknown";
        }
        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
        loaned = false;
    }

    public boolean borrowBook()
    {
            if (loaned==false)
                {
            loaned = true;
            return true;
        }

        return false;
    }

    public boolean returnBook()
    {
        if (loaned) {
            loaned = false;
            return true;
        }
    return false;
    }

    public boolean isAvailable()
    {
        return loaned==false;
    }

    public String getTitle()  {
        return title;
    }

    public String getAuthor() 
    {
        return author;
    }

    public String getBookCode(){
        return bookCode;
    }

    public String toString() {
        return "Book= " + title+", Author="+ author+", Code="+ bookCode+", Available=" +isAvailable();
    }
}
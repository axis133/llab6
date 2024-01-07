import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<BookIssue> bookIssues;

    public Catalog() {
        bookIssues = new ArrayList<>();
    }

    public void addBookIssue(String bookTitle, String readerName, String issueDate) {
        BookIssue bookIssue = new BookIssue(bookTitle, readerName, issueDate);
        bookIssues.add(bookIssue);
    }

    public List<BookIssue> getAllBookIssues() {
        return bookIssues;
    }

    public class BookIssue {
        private String bookTitle;
        private String readerName;
        private String issueDate;

        public BookIssue(String bookTitle, String readerName, String issueDate) {
            this.bookTitle = bookTitle;
            this.readerName = readerName;
            this.issueDate = issueDate;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public String getReaderName() {
            return readerName;
        }

        public String getIssueDate() {
            return issueDate;
        }
    }
}



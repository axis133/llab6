import java.util.List;

public class CatalogUse {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        catalog.addBookIssue("Книга 1", "Читатель 1", "2024-01-01");
        catalog.addBookIssue("Книга 2", "Читатель 2", "2024-02-01");
        catalog.addBookIssue("Книга 3", "Читатель 3", "2024-03-01");

        List<Catalog.BookIssue> bookIssues = catalog.getAllBookIssues();
        for (Catalog.BookIssue bookIssue : bookIssues) {
            System.out.println("Книга: " + bookIssue.getBookTitle() +
                    ", Читатель: " + bookIssue.getReaderName() +
                    ", Дата выпуска: " + bookIssue.getIssueDate());
        }
    }
}
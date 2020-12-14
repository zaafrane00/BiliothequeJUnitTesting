package JUnitTp;
public class Book {
    public int id;
    public String title;
    public String  price;

    public Book(int id, String title, String price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

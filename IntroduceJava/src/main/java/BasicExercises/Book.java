package BasicExercises;

public class Book {
    private String name;
    private String author;
    private int publish;
    private int pages;
    public Book(String name,String author,int publish,int pages){
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublish(int publish){
        this.publish = publish;
    }
    public int getPublish(){
        return publish;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public static void main(String[] args) {
        Book book = new Book("Sóng","Xuân Quỳnh",1967,4);
        System.out.println("Bài thơ : " + book.getName());
        System.out.println("Tên tác giả : " + book.getAuthor());
        System.out.println("Năm sản xuất : " + book.getPublish());
        System.out.println("Số trang : " + book.getPages());
    }
}

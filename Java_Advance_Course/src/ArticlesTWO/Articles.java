package ArticlesTWO;

public class Articles {
    private String title;
    private String content;
    private String author;


    public Articles (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString(){//Science - planets: Bill
        return this.title + " - " + this.content + ": " + this.author;
    }
}

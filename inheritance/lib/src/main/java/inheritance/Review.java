package inheritance;

public class Review {

    private String body;
    private String author;
    private int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public String printStar(int star) {
       String print = "";
        if (star > 0) {
            for (int i = 1; i <= star; i++) {
                print = print + "*";
            }
        }else {
            print = "Zero Stars";
        }
        return print;
    }

    @Override
    public String toString() {
        return '{' +
                "body='" + body + '\'' +
                ", author='" + author + '\'' + ", "
                 + printStar(stars) +
                '}';
    }
}

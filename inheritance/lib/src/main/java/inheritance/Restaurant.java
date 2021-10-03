package inheritance;

import java.util.LinkedList;

public class Restaurant {

    private String name;
    private double rate;
    private int price;

    public Restaurant(String name, double rate, int price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
    }

    LinkedList<Review> reviews = new LinkedList<>();

    public LinkedList<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
        this.reviews.add(review);
        updateRate();
    }

    public void updateRate(){
        double value = 0;
        for (int i = 0; i < getReviews().size(); i++) {
            value = value + getReviews().get(i).getStars();
        }
        value = value / (getReviews().size());
        this.rate = value;
    }

    public double verifyRate(double rate) {
        int value = 5;
        while (rate > 5 || rate < 0){
            System.out.println("Choose a number between 0 to 5");
            return value;
        }
        return rate;
    }

    public String priceCategory(int price) {
        if (price <= 10) {
            return "$";
        } else if (price < 10 || price <= 25) {
            return "$$";
        } if (price < 25 || price <= 50) {
            return "$$$";
        } else {
            return "$$$$";
        }
    }


    @Override
    public String toString() {
        return "Restaurant -> {" +
                "name='" + name + '\'' +
                ", rate=" + verifyRate(rate) + ", "
                + priceCategory(price) +
                '}';
    }
}

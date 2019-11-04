package Assets;

public abstract class Discount {

    private double minimumDiscountScore;
    private double discountPercentage;

    public Discount(double minimumDiscountScore, double discountPercentage) {
        this.minimumDiscountScore = minimumDiscountScore;
        this.discountPercentage = discountPercentage;
    }

    public double getMinimumDiscountScore() {
        return minimumDiscountScore;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void changeMinimumDiscountScore(double newMinDiscountScore) {
        minimumDiscountScore = newMinDiscountScore;
    }

    public void changeDiscountPercentage(double newDiscountPercentage) {
        discountPercentage = newDiscountPercentage;
    }

}

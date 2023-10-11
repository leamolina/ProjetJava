public class Training {

    private static int counter=1;
    private int number=0;
    private NameTraining name;
    private PromotionTraining promotion;

    public Training(){
        this.number = counter++;
    }

    public Training(NameTraining name, PromotionTraining promotion) {
        this.number = counter++;
        this.name = name;
        this.promotion = promotion;
    }

    public int getNumber() {
        return number;
    }

    public NameTraining getName() {
        return name;
    }

    public void setName(NameTraining name) {
        this.name = name;
    }

    public PromotionTraining getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionTraining promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Training{" +
                "number=" + number +
                ", name=" + name +
                ", promotion=" + promotion +
                '}';
    }
}

package Polymorphism.WildFarm;

public abstract class Food {
    private Integer quantity;

    protected Food(Integer quantity) {
        this.setQuantity(quantity);
    }

    private void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public final Integer getQuantity() {
        return quantity;
    }


}

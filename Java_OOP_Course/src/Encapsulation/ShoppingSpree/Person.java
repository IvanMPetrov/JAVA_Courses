package Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> productList;

    public Person(String name, double money, List<Product> productList) {
        setName(name);
        setMoney(money);
        this.productList = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException( "Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product){
        if (money < product.getCost()){
            String messege = String.format("%s can't afford %s",name,product.getName());

            throw new  IllegalArgumentException (messege);
        }
        productList.add(product);
        money -= product.getCost();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ");
        if (productList.isEmpty()){
            sb.append("Nothing is bought");
        }else {
            sb.append(productList.stream().map(Product::getName).collect(Collectors.joining(", ")));
        }
        return sb.toString();
    }
}

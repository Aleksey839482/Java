package OOP.Lesson_1.Seminar.Task_01.machine;

import OOP.Lesson_1.Seminar.Task_01.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Product> productList;
    public VendingMachine() {
        productList = new ArrayList<>();
    }
    public void add(Product product){
        productList.add(product);
    }
    public Product findByName(String nameProduct){
        for(Product product: productList){
            if(product.getName().equalsIgnoreCase(nameProduct)){  //сравнивает вне зависимости какая буква name == NamE
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список товаров:\n");
        for(Product product: productList){
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

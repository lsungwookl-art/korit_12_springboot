package test2_15;

class Product {
    private String name;

    private static int totalProducts = 0;

    public Product(String name) {
        this.name = name;
        totalProducts++;
    }
    public static int getTotalProducts() {
        return totalProducts;
    }
}
public class ProductCounter {
    public static void main(String[] args) {
        System.out.println("초기 상품 수:" + Product.getTotalProducts());
        new Product("사과");
        new Product("바나나");
        new Product("오렌지");

        System.out.println("총 상품 수:" + Product.getTotalProducts());
    }
}

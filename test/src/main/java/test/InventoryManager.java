package test5;

class OutOfStockException extends Exception {
    private int currentStock;
    private int requestedQuantity;

    public OutOfStockException(int currentStock, int requestedQuantity) {
        super("재고 부족: " + requestedQuantity + "개 주문 불가. 현재 재고: " + currentStock + "개.");
        this.currentStock = currentStock;
        this.requestedQuantity = requestedQuantity;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }
}

class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void decreaseStock(int quantity) throws OutOfStockException {
        if (quantity > this.stock) {
            throw new OutOfStockException(this.stock, quantity);
        }
        this.stock -= quantity;
        System.out.println(name + " 재고 차감 완료. 남은 재고: " + this.stock);
    }
    public int getStock() {
        return stock;
    }
}

public class InventoryManager {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", 10);
        int orderQuantity = 15;

        try {
            laptop.decreaseStock(orderQuantity);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("시스템 오류가 발생했습니다:" + e.getMessage());
        }
    }
}
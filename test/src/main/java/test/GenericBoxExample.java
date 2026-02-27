package test10;

class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
}

public class GenericBoxExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello World");
        System.out.println("문자열 상자 내용:" + stringBox.getContent());

        Box<Integer> integerBox = new Box<>(123);
        System.out.println("정수 상자 내용:" + integerBox.getContent());
    }
}
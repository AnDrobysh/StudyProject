package Lesson_6.example;

// Доступен всем
public class PublicClass {
    // Доступен только внутри этого класса
    private String privateField = "Private Field";

    // Доступен в пределах пакета и в наследуемых классах
    protected String protectedField = "Protected Field";

    // Доступен только в пределах пакета
    String defaultField = "Default Field";

    // Доступен всем
    public String publicField = "Public Field";

    // Приватный метод, доступен только внутри класса
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Публичный метод, доступен всем
    public void publicMethod() {
        System.out.println("This is a public method.");
        privateMethod(); // Вызов приватного метода
    }
}

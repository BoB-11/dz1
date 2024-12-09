public class Main {
    public static void main(String[] args) {

        // Создание объектов класса Product с разными скидками и данными
        Product product1 = new Product(10, 100.0, 0.75);      // 0.75% скидка
        Product product2 = new Product(5, 200.0, 42.575);     // 42.575% скидка
        Product product3 = new Product(3, 500.0, 59.1);       // 59.1% скидка

        // Вызов метода для расчета общей суммы и суммы со скидкой
        System.out.println("Товар 1:");
        Product.calculateTotal(product1);

        System.out.println("\nТовар 2:");
        Product.calculateTotal(product2);

        System.out.println("\nТовар 3:");
        Product.calculateTotal(product3);
    }
}

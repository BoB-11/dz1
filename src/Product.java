
    /**
     * Класс Product представляет товар с количеством, ценой и скидкой.
     * Этот класс используется для расчета общей стоимости товаров
     * как без скидки, так и со скидкой.
     */
    public class Product {

        // Количество товаров (целочисленное значение)
        private int quantity;

        // Цена одного товара (вещественное значение)
        private double price;

        // Скидка на товар в процентах (вещественное значение)
        private double discount;

        public Product(int quantity, double price, double discount) {
            this.quantity = quantity;
            this.price = price;
            this.discount = discount;
        }


        public static void calculateTotal(Product product) {
            // Общая сумма без скидки
            double totalAmount = product.quantity * product.price;

            // Общая сумма со скидкой
            double totalWithDiscount = totalAmount * (1 - product.discount / 100);

            // Округление до двух знаков после запятой
            totalAmount = Math.round(totalAmount * 100.0) / 100.0;
            totalWithDiscount = Math.round(totalWithDiscount * 100.0) / 100.0;

            // Вывод результатов
            System.out.println("Общая сумма без скидки: " + totalAmount);
            System.out.println("Общая сумма со скидкой: " + totalWithDiscount);
        }
    }



package fr.efrei.Domain;

public class Payment {
    private final int id;
    private final Order order;
    private final String method;

    private Payment(Builder builder) {
        this.id = builder.id;
        this.order = builder.order;
        this.method = builder.method;
    }

    public static class Builder {
        private final int id;
        private Order order;
        private String method;

        public Builder(int id) {
            this.id = id;
        }

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }


        public Payment build() {
            return new Payment(this);
        }
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public String getMethod() {
        return method;
    }



}

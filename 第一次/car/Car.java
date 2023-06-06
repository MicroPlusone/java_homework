class Car {
    private String color;
    private double price;
    private String model;

    public Car(String color, double price, String model) {
        this.color = color;
        this.price = price;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Car car = new Car("Red", 10000.0, "Toyota");
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Model: " + car.getModel());
    }
}


package cars;

public class Car {
    private String brand;
    private double sizeOfMotor;
    private Color color;
    private int price;

    public Car(String brand, double sizeOfMotor, Color color, int price) {
        this.brand = brand;
        this.sizeOfMotor = sizeOfMotor;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getSizeOfMotor() {
        return sizeOfMotor;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void decreasePrice(int percent) {
        int result = (int) (this.price * ((100 - percent) / 100.0));
        setPrice(result);
    }
}

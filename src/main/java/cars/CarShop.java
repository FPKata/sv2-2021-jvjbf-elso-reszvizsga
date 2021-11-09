package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String nameOfShop;
    private int maximumPrice;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String nameOfShop, int maximumPrice) {
        this.nameOfShop = nameOfShop;
        this.maximumPrice = maximumPrice;
    }

    public boolean addCar(Car car){
        if (car.getPrice() <= maximumPrice){
            cars.add(car);
            return true;
        }
        return false;
    }
    public List<Car> getCarsForSell(){
        return cars;
    }

    public int sumCarPrice(){
        int sum = 0;
        for (Car actual : cars){
            sum = sum + actual.getPrice();
        }
        return sum;
    }

    public int numberOfCarsCheaperThan(int number){
        int howMany = 0;
        for (Car actual : cars){
            if (actual.getPrice() < number){
                howMany++;
            }
        }
        return howMany;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> resultList = new ArrayList<>();
        for (Car actual : cars){
            if (actual.getBrand().equals(brand)){
                resultList.add(actual);
            }
        }
        return resultList;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public int getMaximumPrice() {
        return maximumPrice;
    }
}

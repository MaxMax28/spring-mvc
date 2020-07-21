package web.model;

public class Car {

    private int carId;
    private String name;
    private int series;

    public Car() {
    }

    public Car (int carId, String name, int series) {
        this.carId = carId;
        this.name = name;
        this.series = series;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", name='" + name + '\'' +
                ", series=" + series +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (carId != car.carId) return false;
        if (series != car.series) return false;
        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        int result = carId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + series;
        return result;
    }
}

public class Mazda extends Car {
    Integer numberOfCelinders;
    Integer tireSize;

    public Integer getNumberOfCelinders() {
        return numberOfCelinders;
    }

    public Integer getTireSize() {
        return tireSize;
    }

    public Mazda(Integer age, String model, Integer numberOfCelinders, Integer tireSize) {
        super(age, model);
        this.numberOfCelinders = numberOfCelinders;
        this.tireSize = tireSize;
    }     @Override
    public void print() {
        System.out.println(getInfo() + "numberOfCelinders: " + this.numberOfCelinders + "\ntireSize: " + this.tireSize);
    }
    }

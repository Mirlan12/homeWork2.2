public class BMW  extends Car {
    String color;
    Integer volume;

    public BMW(Integer age, String model, String color, Integer volume) {
        super(age, model);
        this.color = color;
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "color: " + this.color + "\n volume: " + this.volume );
    }
}


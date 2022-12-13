public class Mercedes extends Car implements Printable {
    Integer speed;
    String spoiler;

    public Integer getSpeed() {
        return speed;
    }

    public String getSpoiler() {
        return spoiler;
    }

    public Mercedes(Integer age, String model, Integer speed, String spoiler) {
        super(age, model);
        this.speed = speed;
        this.spoiler = spoiler;
    }
    @Override
    public void print() {
        System.out.println(getInfo() + "\nspeed: " +  this.speed + "\n spoiler: " + this.spoiler);
    }
    }

public class Car implements Printable {
    private Integer age;
    private String model;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(Integer age, String model) {
        this.age = age;
        this.model = model;
    }
    public String getInfo() {
        return "age: " + this.age + "\n model: " + this.model;
    }

    @Override
    public void print() {
        System.out.println(getInfo());

    }
}

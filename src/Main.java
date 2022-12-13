public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                createObject("m5"),
                createObject("AMG"),
                createObject("m3"),


        };
        for (Printable printable: printables) {
            printable.print();

        }
    }
    public static Printable createObject(String className){
        switch (className){
            case "m5":
                BMW m5 = new BMW(2010, "M5", "Black", 2);
                return m5;
            case "AMG":
                Mercedes AMG = new Mercedes(2020, "AMG", 200, "yes");
                return  AMG;
            case "m3":
                Mazda m3 = new Mazda(2009, "m3", 3, 10);
                return m3;
        }
        return null;
    }
}
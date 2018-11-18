public class Car {
    //Konstruktor
    String type = "";
    int capacity;
    int consumption;
    int kilometer;
    //int liter;
    int km;
    int amount;

    Car(String type, int capacity, int consumption) {
    }

    void fill(int amount) {
        this.amount = amount;
    }

    void drive(int km) {
        this.km = km;
    }

    public String toString(int liter, int distance){//int liter, int drive){
        liter += amount;
        if (liter > capacity) {
            liter = liter - capacity;
        } else {
            liter = liter;
        }
        distance = distance + km;
        String literOne = "liter";
        //String distanceOne = String.valueOf(distance);
        String distanceOne = "distance";
        return literOne;
        return distanceOne;


    }
}




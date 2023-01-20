public class Cereal {
    String name;
    String typee;
    int calories;
    int protein;
    int fat;
    int sodium;
    int fiber;
    int carbs;
    int sugar;
    int potassium;
    int vitamins;
    int shelf;
    Double weight;
    Double cups;
    Double rating;

    public Cereal() {
        name = "Name";
        //typee = " ";
        calories = 0;
        /*
        protein = 0;
        fat = 0;
        sodium = 0;
        fiber = 0;
        carbs = 0;
        sugar = 0;
        potassium = 0;
        vitamins = 0;
        shelf = 0;
        weight = 0.0;
        cups = 0.0;
        rating = 0.0;
        */
    }

    public Cereal(String a, int b) {
        name = a;
        calories = b;
      }

    public String getName() {
        return name;
    }

    /*
    public String getType() {
        return typee;
    }
    */

    public int getCalories() {
        return calories;
    }

    /*
    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getSugar() {
        return sugar;
    }

    public int getPotassium() {
        return potassium;
    }

    public int getVitamins() {
        return vitamins;
    }

    public int getShelf() {
        return shelf;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getCups() {
        return cups;
    }

    public Double getRating() {
        return rating;
    }
    */

    public void setName(String a) {
        name = a;
    }

    public void setCalories(int b) {
        calories = b;
    }

    public String toString() {
        return name + " " + calories;
    }
}

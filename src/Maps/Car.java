package Maps;

public class Car {
    String color;
    Car(String col){
        this.color = col;

    }
    public String toString(){
        return color + " car";
    }

    public boolean equals(Object o) {
        return ((Car) o).color.equals(this.color);
    }


    public int hashCode() {
        return color.length();
    }



}



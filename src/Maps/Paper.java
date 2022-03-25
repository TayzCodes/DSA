package Maps;

public  class Paper implements Comparable<Paper>{
    String color;
    Integer size ;
    Paper(String col, int size){
        this.color = col;
        this.size = size;

    }
    public String toString(){
        return "Maps.HashMapDemo.Paper "+ color + "size "+ size;
    }

    public boolean equals(Object o) {
        return ((Paper) o).color.equals(this.color);
    }

    public int hashCode() {
        return color.length();
    }

    @Override
    public int compareTo(Paper o) {
        return  o.size - this.size;
    }

}
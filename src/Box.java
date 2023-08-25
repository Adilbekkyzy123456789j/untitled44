public class Box <T> {
     private T size ;
     private T colour;

    public Box() {
    }

    public Box(T size, T colour) {
        this.size = size;
        this.colour = colour;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public T getColour() {
        return colour;
    }

    public void setColour(T colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Box:" +
                "size:" + size +
                "colour:" + colour;
    }
}

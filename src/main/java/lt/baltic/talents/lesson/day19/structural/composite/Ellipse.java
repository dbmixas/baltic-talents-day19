package lt.baltic.talents.lesson.day19.structural.composite;

// Leaf
public class Ellipse implements Graphic {

    private int id;

    public Ellipse(int id) {
        this.id = id;
    }

    //Prints the graphic.
    public void print() {
        System.out.println("Ellipse: " + id);
    }
}

package lt.baltic.talents.lesson.day19.structural.decorator;

public class Decorator {

    public static void main(String[] args) {

        // Create a decorated Window with horizontal and vertical scrollbars
        Window decoratedWindow = new HorizontalScrollBarDecorator(
                new VerticalScrollBarDecorator(new SimpleWindow()));

        // Print the Window's description
        System.out.println(decoratedWindow.getDescription());

    }
}

package lt.baltic.talents.lesson.day19.behavioral.command;

public class CommandPattern {

    public static void main(String[] args) {

        Light l = new Light();
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);

        Switch s = new Switch(switchUp,switchDown);

        s.flipUp();
        s.flipUp();
        s.flipDown();
        s.flipDown();
    }
}

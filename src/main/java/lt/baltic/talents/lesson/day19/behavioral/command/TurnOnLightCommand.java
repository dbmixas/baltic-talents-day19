package lt.baltic.talents.lesson.day19.behavioral.command;

public class TurnOnLightCommand implements Command{

    private Light theLight;

    public TurnOnLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOn();
    }
}

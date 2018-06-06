package lt.baltic.talents.lesson.day19.behavioral.command;

public class TurnOffLightCommand implements Command{

    private Light theLight;

    public TurnOffLightCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOff();
    }
}

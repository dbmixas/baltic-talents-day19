package lt.baltic.talents.lesson.day19.creational.abstractFactory;

public class OSXFactory implements IGUIFactory {

	@Override
	public IButton createButton() {
		return new OSXButton();
	}

}

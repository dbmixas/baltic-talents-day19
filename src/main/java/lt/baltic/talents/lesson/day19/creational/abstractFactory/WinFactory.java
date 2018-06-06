package lt.baltic.talents.lesson.day19.creational.abstractFactory;

public class WinFactory implements IGUIFactory {

	@Override
	public IButton createButton() {
		return new WinButton();
	}

}

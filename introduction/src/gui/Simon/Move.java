package gui.Simon;

public class Move implements MoveInterfaceJiaMing {
	
	ButtonInterfaceJiaMing b;
	
	public Move(ButtonInterfaceJiaMing b) {
		this.b = b;
	}

	@Override
	public ButtonInterfaceJiaMing getButton() {
		return b;
	}

}

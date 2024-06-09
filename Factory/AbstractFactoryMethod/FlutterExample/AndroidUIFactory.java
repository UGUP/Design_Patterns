package FlutterExample;

import FlutterExample.Components.Buttons.AndroidButton;
import FlutterExample.Components.Buttons.Buttons;
import FlutterExample.Components.Menu.AndroidMenu;
import FlutterExample.Components.Menu.Menu;


public class AndroidUIFactory implements UIFactory {

    @Override
    public Buttons createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}

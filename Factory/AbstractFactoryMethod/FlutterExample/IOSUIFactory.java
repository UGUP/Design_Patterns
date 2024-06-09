package FlutterExample;

import FlutterExample.Components.Buttons.Buttons;
import FlutterExample.Components.Buttons.IOSButton;
import FlutterExample.Components.Menu.IOSMenu;
import FlutterExample.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Buttons createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}

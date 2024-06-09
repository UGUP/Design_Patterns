package FlutterExample;

import FlutterExample.Components.Buttons.Buttons;
import FlutterExample.Components.Menu.Menu;

public interface UIFactory {
    public Buttons createButton();
    public Menu createMenu();
}

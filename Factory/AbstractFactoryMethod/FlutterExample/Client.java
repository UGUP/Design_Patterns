package FlutterExample;

import FlutterExample.Components.Buttons.Buttons;
import FlutterExample.Components.Menu.Menu;

import javax.swing.plaf.basic.BasicButtonUI;

public class Client {
    public static void main(String[] args) {
        Flutter flutter= new Flutter(SupportedPlatforms.Android);
        UIFactory uiFactory= flutter.createFactory();
        Buttons buttons= uiFactory.createButton();
        buttons.changeSize();
        Menu menu= uiFactory.createMenu();
        menu.createMenu();
    }
}

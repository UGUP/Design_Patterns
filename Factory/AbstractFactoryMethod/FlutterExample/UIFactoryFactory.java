package FlutterExample;

public class UIFactoryFactory {
   // Practical Factory Method || Static Factory Method
    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platforms) {
        if (platforms.equals(SupportedPlatforms.Android)){
            return new AndroidUIFactory();
        }
        else if (platforms.equals(SupportedPlatforms.IOS)){
            return new IOSUIFactory();
        }
        else{
            return null;
        }
    }
}

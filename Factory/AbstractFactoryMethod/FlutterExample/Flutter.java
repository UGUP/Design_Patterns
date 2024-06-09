package FlutterExample;

public class Flutter {
   private SupportedPlatforms platform;

   public Flutter(SupportedPlatforms platform) {
       this.platform = platform;
   }

    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate");
    }

    public UIFactory  createFactory(){
       return  UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}

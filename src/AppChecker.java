public class AppChecker {

    public static void main(String[] args) {
        AndroidApp androidApp = new AndroidApp( "Calkulator");
        androidApp.appInfo();
        androidApp.runAndroidApp();


        IphoneApp iphoneApp = new IphoneApp("Calkulator");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();

    }
}

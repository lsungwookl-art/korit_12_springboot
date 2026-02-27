package test4;

class SettingsManager {

    private static SettingsManager instance;

    private SettingsManager() {
    }
    public static SettingsManager getInstance() {
        if (instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }
}

public class Application {
    public static void main(String[] args) {
        SettingsManager settings1 = SettingsManager.getInstance();
        SettingsManager settings2 = SettingsManager.getInstance();

        if (settings1 == settings2) {
            System.out.println("두 인스턴스는 동일합니다.");
        } else {
            System.out.println("두 인스턴스는 다릅니다.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BloomLevel bloomLevel = new BloomLevel();
        bloomLevel.viewBloomLevels();
        System.out.println("-------------------");
        bloomLevel.addBloomLevel("Remember");
        bloomLevel.addBloomLevel("Test1");
        bloomLevel.viewBloomLevels();
        System.out.println("-------------------");
        bloomLevel.removeBloomLevel("Understand");
        bloomLevel.viewBloomLevels();

        System.out.println("-------------------");

        DispositionLevel dispositionLevel = new DispositionLevel();
        dispositionLevel.viewDispositionLevel();

    }
}

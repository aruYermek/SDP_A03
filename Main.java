public class Main {
    public static void main(String[] args) {
        ModernCamera digitalCamera = new Adapter();

        digitalCamera.takePhoto();
        digitalCamera.attachLens("50mm f/1.4");
        digitalCamera.attachFilter("Sepia");
    }
}
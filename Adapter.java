public class Adapter implements ModernCamera{
    private VintageFilmCamera filmCamera;

    public Adapter() {
        filmCamera = new VintageFilmCamera();
    }
    @Override
    public void takePhoto() {
        filmCamera.loadFilm();
        filmCamera.windFilm();
        System.out.println("Captured photo with a vintage film camera.");
    }

    @Override
    public void attachLens(String lens) {
        System.out.println("Attached vintage lens: " + lens);
    }

    @Override
    public void attachFilter(String filter) {
        System.out.println("Attached vintage filter: " + filter);
    }
}

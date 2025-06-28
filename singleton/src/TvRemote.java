public class TvRemote {

    public void pressPowerButton(){
        System.out.println("Power Button pressed");
    }

    private TvRemote() {} // Nobody can create object from outside .

    private static final TvRemote instance = new TvRemote();

    public static TvRemote getInstance() {
        return instance;
    }
}

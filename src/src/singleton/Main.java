package singleton;

public class Main {
    public static void main(String[] args) {
        TvRemote remote1 = TvRemote.getInstance();
        TvRemote remote2 = TvRemote.getInstance();
        remote1.pressPowerButton();
        System.out.println(remote1==remote2); //true
    }
}
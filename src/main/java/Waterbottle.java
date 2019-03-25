public class Waterbottle {
    private int volume;

    public Waterbottle(int volume) {
        this.volume = volume;
    }
    public int drinkTaken() {
        return this.volume - 10;
    }

    public int emptyWaterbottle() {
        return this.volume - 100;
    }

    public int fillWaterbottle() {
       return this.volume = 100;
    }
}

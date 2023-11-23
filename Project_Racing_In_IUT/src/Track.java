abstract class Track {
    private String trackName;

    public Track(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackName() {
        return trackName;
    }

    public abstract void trackInfo();
}

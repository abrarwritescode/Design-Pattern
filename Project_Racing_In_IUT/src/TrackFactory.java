// Factory for creating tracks
public class TrackFactory {
    public Track createTrack(String trackName) {
        switch (trackName) {
            case "Blue Moon Bay Speedway":
                return new BlueMoonBaySpeedway();
            case "BB Raceway":
                return new BBRaceway();
            case "Circuit de Spa-Francorchamps":
                return new CircuitDeSpaFrancorchamps();
            default:
                return null;
        }
    }
}

public class TrafficInformation {
    public final boolean canGo;
    public final String information;

    public TrafficInformation(boolean canGo, String information) {
        this.canGo = canGo;
        this.information = information;
    }

    @Override
    public String toString() {
        return "TrafficInformation{" +
                "canGo=" + canGo +
                ", information='" + information + '\'' +
                '}';
    }
}

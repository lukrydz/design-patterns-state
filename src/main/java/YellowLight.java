public class YellowLight extends Light {

    public YellowLight(TrafficLights trafficLights) {
        super(trafficLights);
    }

    @Override
    public String toString() {
        return "YellowLight{" +
                "trafficLights=" + trafficLights +
                '}';
    }

    @Override
    public TrafficInformation getTrafficInformation() {
        TrafficInformation info = new TrafficInformation(false, "Get ready, soon can go.");
        System.out.println(this);
        System.out.println(info);

        trafficLights.setLightColor(new GreenLight(trafficLights));

        return info;
    }

}

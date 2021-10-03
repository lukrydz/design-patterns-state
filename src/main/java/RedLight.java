public class RedLight extends Light {

    public RedLight(TrafficLights trafficLights) {
        super(trafficLights);
    }

    @Override
    public String toString() {
        return "RedLight{" +
                "trafficLights=" + trafficLights +
                '}';
    }

    @Override
    public TrafficInformation getTrafficInformation() {
        TrafficInformation info = new TrafficInformation(false, "Wait, its red!");
        System.out.println(this);
        System.out.println(info);

        trafficLights.setLightColor(new YellowLight(trafficLights));

        return info;
    }

}

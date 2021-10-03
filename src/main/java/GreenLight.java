public class GreenLight extends Light {

    public GreenLight(TrafficLights trafficLights) {
        super(trafficLights);
    }

    @Override
    public TrafficInformation getTrafficInformation() {
        TrafficInformation info = new TrafficInformation(true, "You can go");
        System.out.println(this);
        System.out.println(info);
        trafficLights.setLightColor(new RedLight(trafficLights));

        return info;
    }

    @Override
    public String toString() {
        return "GreenLight{" +
                "trafficLights=" + trafficLights +
                '}';
    }
}

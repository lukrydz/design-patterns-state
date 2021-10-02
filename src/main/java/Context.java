public class Context {

    private TrafficLights trafficLights = new TrafficLights();
    private Light actualColor = trafficLights.getLightColor();

    public Context() {
    }

    public void changeLightColor(Light lightColor) {
        trafficLights.setLightColor(lightColor);
    }
}

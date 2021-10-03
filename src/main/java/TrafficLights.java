public class TrafficLights {

    private Light lightColor;

    public TrafficLights() {
        this.lightColor = new RedLight(this);
    }

    public void setLightColor(Light lightColor) {
        this.lightColor = lightColor;
    }

    public void orchestrateTraffic(){

        lightColor.getTrafficInformation();

    }


}

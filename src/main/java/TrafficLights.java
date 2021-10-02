public class TrafficLights {

    private RedLight redLight = new RedLight();
    private GreenLight greenLight = new GreenLight();
    private YellowLight yellowLight = new YellowLight();

    private Light lightColor;

    public TrafficLights() {
        this.lightColor = redLight;
    }

    public Light getLightColor() {
        return lightColor;
    }

    public void setLightColor(String color) {
        switch (color) {
            case "red":
                this.lightColor = redLight;
            case "yellow":
                this.lightColor = yellowLight;
            case "green":
                this.lightColor = greenLight;
        }

    }

    public void orchestrateTraffic(){

        lightColor.orchestrateTraffic();

    }


}

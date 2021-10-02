public class YellowLight implements Light {

    @Override
    public void orchestrateTraffic() {
        waitForIntersectionClearance();
    }

}

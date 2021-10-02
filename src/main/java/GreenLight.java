public class GreenLight implements Light {

    @Override
    public void orchestrateTraffic() {
        holdPedestrians();
        allowCars();
    }

}

public class RedLight implements Light {

    @Override
    public void orchestrateTraffic() {
        holdCars();
        allowPedestrians();
    }

}

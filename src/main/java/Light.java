public abstract class Light {
        protected TrafficLights trafficLights;

        public Light(TrafficLights trafficLights) {
                this.trafficLights = trafficLights;
        }


        abstract TrafficInformation getTrafficInformation();

        }

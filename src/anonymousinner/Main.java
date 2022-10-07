package anonymousinner;

public class Main {
    public static void main(String[] args) {

        MonitoringSystem generalMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring all starts");
            }
        };
        MonitoringSystem errorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring error starts");
            }
        };
        MonitoringSystem securityMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring security starts");
            }
        };
        generalMonitoringModule.startMonitoring();
        errorMonitoringModule.startMonitoring();
        securityMonitoringModule.startMonitoring();

    }
}


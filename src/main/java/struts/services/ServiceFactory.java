package struts.services;

import java.util.ArrayList;
import java.util.List;

public class ServiceFactory<T> {

    private static final List<Service> SERVICES = getServices();

    private static List<Service> getServices() {
        List<Service> services = new ArrayList<>();
        services.add(new UserService());
        return services;
    }

    public Service<T> getService() {
        for (Service service: SERVICES) {
            Service<T> tService = null;
            try {
                tService = (Service<T>) service;
            } catch (Exception e) {
                continue;
            }
            return tService;
        }
        return null;
    }

}

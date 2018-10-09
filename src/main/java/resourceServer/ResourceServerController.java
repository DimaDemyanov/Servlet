package resourceServer;

import resources.TestResource;

public class ResourceServerController implements ResourceServerControllerMBean {
    public ResourceServer server;

    public ResourceServerController(ResourceServer server) {
        this.server = server;
    }
}

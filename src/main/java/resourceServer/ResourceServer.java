package resourceServer;

import resources.TestResource;

public class ResourceServer implements  ResourceServerI {
    TestResource src;

    @Override
    public TestResource getResource() {
        return src;
    }

    @Override
    public void setResource(TestResource src) {
        this.src = src;
    }
}

package resourceServer;

import resources.TestResource;

public interface ResourceServerI {
    public TestResource getResource();

    public void setResource(TestResource src);
}

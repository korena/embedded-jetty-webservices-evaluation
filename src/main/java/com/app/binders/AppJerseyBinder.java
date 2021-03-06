package com.app.binders;

import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author korena
 * @Comment this is done within the application, because jersey is initialized at the
 * web application's level, other containers (like glassfish) would transparently do it
 * at the server level, this is a wild guess.
 */
public class AppJerseyBinder extends ResourceConfig{

    public AppJerseyBinder() {
        String[] pacakgesToScan = {"com.app.injectedIn",
        "com.app.injectees",
        "com.app.rest"};
                register(new InternalsBinder());
        packages(true,pacakgesToScan);
    }
}
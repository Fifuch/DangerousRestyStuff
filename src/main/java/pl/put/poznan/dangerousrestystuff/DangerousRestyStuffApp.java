package pl.put.poznan.dangerousrestystuff;

import io.vavr.control.Try;
import pl.put.poznan.dangerousrestystuff.config.ServerPathsConfiguration;
import ratpack.server.RatpackServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DangerousRestyStuffApp {
    private static final Logger logger = LoggerFactory.getLogger(DangerousRestyStuffApp.class);

    public static void main(String... args) {
        ServerPathsConfiguration serverPathsConfiguration = new ServerPathsConfiguration();
        Try.of(() -> RatpackServer.start(s -> s.handlers(serverPathsConfiguration::getPathBinding)))
                .onFailure(ex -> logger.error("Cannot start HTTP server, {}", ex.getMessage()));
    }
}

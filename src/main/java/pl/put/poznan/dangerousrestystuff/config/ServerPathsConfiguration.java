package pl.put.poznan.dangerousrestystuff.config;

import pl.put.poznan.dangerousrestystuff.handlers.HelloRestHandler;
import pl.put.poznan.dangerousrestystuff.handlers.StudentCrudRestHandler;
import ratpack.handling.Chain;

public class ServerPathsConfiguration {

    public Chain getPathBinding(Chain initialChain) {
        return initialChain.path("hello", ctx -> new HelloRestHandler().handlePath(ctx))
                           .path("student/:id", ctx ->  new StudentCrudRestHandler().handlePath(ctx));
    }
}


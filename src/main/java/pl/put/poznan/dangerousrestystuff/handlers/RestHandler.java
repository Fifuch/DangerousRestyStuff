package pl.put.poznan.dangerousrestystuff.handlers;

import ratpack.handling.Context;

public interface RestHandler {
    void handlePath(Context context) throws Exception;

}

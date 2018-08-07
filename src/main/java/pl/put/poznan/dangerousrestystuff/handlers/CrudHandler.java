package pl.put.poznan.dangerousrestystuff.handlers;

import ratpack.handling.Context;

public interface CrudHandler {
    void handleGet(Context context);
    void handlePost(Context context);
    void handlePut(Context context);
    void handleDelete(Context context);
}

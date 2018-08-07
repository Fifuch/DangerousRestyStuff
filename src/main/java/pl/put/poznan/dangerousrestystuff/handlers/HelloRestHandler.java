package pl.put.poznan.dangerousrestystuff.handlers;

import ratpack.handling.Context;

public class HelloRestHandler implements RestHandler {

    @Override
    public void handlePath(Context context) {
        context.render("So uncivilised.");
    }
}

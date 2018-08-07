package pl.put.poznan.dangerousrestystuff.handlers;

import ratpack.handling.Context;

public class StudentCrudRestHandler implements RestHandler, CrudHandler {

    @Override
    public void handlePath(Context context) throws Exception {
        context.byMethod(m -> m.get(this::handleGet)
                               .post(this::handlePost)
                               .put(this::handlePut)
                               .delete(this::handleDelete));
    }

    @Override
    public void handleGet(Context context) {
        context.render("GET student");
    }

    @Override
    public void handlePost(Context context) {
        context.getResponse().status(201);
        context.render("POST student");
    }

    @Override
    public void handlePut(Context context) {
        context.render("PUT student");
    }

    @Override
    public void handleDelete(Context context) {
        context.render("DELETE student");
    }
}

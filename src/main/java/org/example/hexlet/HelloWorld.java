package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.http.generateEtags = true;
            config.http.prefer405over404 = true;
            config.http.maxRequestSize = 4000000;
            config.http.defaultContentType = "stringValue";
            config.http.asyncTimeout = 0;
            config.http.disableCompression();
        });
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start();
    }
}

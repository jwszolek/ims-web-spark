package com.ims;

import freemarker.template.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.net.UnknownHostException;

/**
 * Created by kubaw on 07/11/17.
 */
public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger("logger");

    public static void main(String[] args) throws UnknownHostException {

        Spark.get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello world from this Spark App";
            }
        });

    }
}

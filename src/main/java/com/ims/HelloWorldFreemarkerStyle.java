package com.ims;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by kubaw on 07/11/17.
 */
public class HelloWorldFreemarkerStyle {
    public static void main(String[] args) {

        final Configuration config = new Configuration();
        config.setClassForTemplateLoading(HelloWorldFreemarkerStyle.class,"/");

        Spark.get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                try {
                    Template helloTemplate = config.getTemplate("hello.ftl");
                    StringWriter writer = new StringWriter();
                    Map<String, Object> helloMap = new HashMap<String, Object>();
                    helloMap.put("name","FreeMarker");
                    helloTemplate.process(helloMap, writer);
                    return writer;

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        });

    }
}

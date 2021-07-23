package Util;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Map;

public class HandleBarsTemplateHelper {

    /**
     * Helper function to set up Handlebars template engine
     * @param model The data to sent to the front end to be rendered in template
     * @param templatePath The template to render
     * @return The rendered document to display on server
     */
    public static String render(Map<String, Object> model, String templatePath) {

        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}

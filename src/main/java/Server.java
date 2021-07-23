import Util.HandleBarsTemplateHelper;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Server {

    public static void main(String[] args) {
        /**
         * Pointing SparkJava to static resource directory to pull in css, fonts, and images
         */
        staticFiles.location("/public");

        /**
         * Root route responsible for rendering landing page
         */
        get("/", (req, res) -> {
            return HandleBarsTemplateHelper.render(null, "index.hbs");
        });

        /**
         * Checkout path that handles payment initiation
         */
        get("/checkout", (req, res) -> {
            // Hardcoding amounts here to avoid using a database
            String itemId = req.queryParams("item");
            Map<String, Object> model = new HashMap<>();

            String title = null;
            String error = null;
            Integer amount = null;

            if (itemId == null) {
                error = "No item selected!";
                model.put("error", error);
            } else {
                switch (itemId) {
                    case "1":
                        title = "The Art of Doing Science and Engineering";
                        amount = 2300;
                        break;
                    case "2":
                        title = "The Making of Prince of Persia: Journals 1985-1993";
                        amount = 2500;
                        break;
                    case "3":
                        title = "Working in Public: The Making and Maintenance of Open Source";
                        amount = 2800;
                        break;
                }

                model.put("title", title);
                model.put("amount", amount);
            }

            return HandleBarsTemplateHelper.render(model, "checkout.hbs");
        });

        /**
         * Success path that handles success page redirect
         */
        get("/success", (req, res) -> {

            return HandleBarsTemplateHelper.render(null, "success.hbs");
        });
    }
}
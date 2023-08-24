package org.crotich;

import org.crotich.models.Strength;
import org.crotich.utils.SharedUtils;

import java.util.HashMap;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/strength/add", (req, res)->{
            return new ModelAndView(new HashMap<>(), "create-strength.hbs");
        }, new HandlebarsTemplateEngine());

        post("/create-strength", (req, res)->{
            return SharedUtils.render(new HashMap<>(), "create-strength.hbs");
        });
    }
}
package org.crotich.config;

import org.sql2o.Sql2o;

public class DatabaseConfig {

    public static Sql2o getDatabase(){
        return new Sql2o(url: "url", "u")
    }
}

package org.crotich.dao;

import org.crotich.config.DatabaseConfig;

public class StrengthDao {
    private static final Sql2o sql2o = DatabaseConfig.getDatabase();

    public static void create(Strength strength){
        try(Connection connection = sql2o.open()){
            String query = "INSERT INTO strengths (name, score) VALUES (:name, :score);";
            connection.createQuery(query)
                    .addParameter("name", strength.getName())
                    .addParameter("score", strength.getScore())
                    .executeUpdate();

        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}

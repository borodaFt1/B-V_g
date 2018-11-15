package com.bvg;



import java.sql.*;
import java.text.SimpleDateFormat;

public class DBWriter {


    public static void DBWriter() {


        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection
                    ("jdbc:postgresql://127.0.0.1:5432/Game_B-V", "postgres", "1151");
            Statement connStatement = con.createStatement();

            String queryToPg;

            queryToPg = "SELECT * FROM players";

                connStatement.executeQuery(queryToPg);
                ResultSet requestResult = connStatement.executeQuery(queryToPg);

                while (requestResult.next()){
                    //System.out.println(requestResult.getString("id"));
                    System.out.println(requestResult.getString("name"));
                }



                connStatement.close();

            /*

            queryToPg = "INSERT INTO players (name) VALUES ('testPlayer2')";

            queryToPg = "INSERT IN TO termhandles (ip, tid, mti, func_code, date) " +
                    "VALUES ('" +
                    ip + "','" +
                    tid + "','" +
                    messMTI + "','" +
                    func_code + "','" +
                    date.format(new Date()) + "')";
            System.out.println("query simple" + queryToPg);
             */





            } catch (SQLException e) {
            e.printStackTrace();
            }




            /* else {
                   queryToPg = "INS ERT IN TO termhandles (ip, tid, mti, func_code, date) " +
                           "VALUES ('" +
                           ip + "','" +
                           tid + "','" +
                           messMTI + "','" +
                           func_code + "','" +
                           date.format(new Date()) + "')";
                   System.out.println("query simple" + queryToPg);
               }*/


            //System.out.println(queryToPg);

/*
///////////////////// PARSING REQUEST RESULT EXAMPLE ///////////
                           //ResultSet requestResult = connStatement.executeQuery(queryToPg);
                               while (requestResult.next()){

                                   System.out.println(requestResult.getString(1));
                                   System.out.println(requestResult.getString("tr_id"));
                                   System.out.println(requestResult.getString("tr_cl_id"));
                                   System.out.println(requestResult.getString("tr_sn"));
                               }

                           //requestResult.close();
///////////////////// PARSING REQUEST RESULT EXAMPLE ///////////
*/


    }
}
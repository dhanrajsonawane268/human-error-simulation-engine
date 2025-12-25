package com.dhanraj.humanerror.dao;

import com.dhanraj.humanerror.config.DBConfig;
import com.dhanraj.humanerror.model.ErrorEvent;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ErrorEventDAO {

    public static void save(ErrorEvent event) {

        String sql =
            "INSERT INTO error_event(action_name, error_type, event_time) " +
            "VALUES (?, ?, ?)";

        try (Connection con = DBConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, event.getAction().getActionName());
            ps.setString(2, event.getErrorType().name());
            ps.setString(3, event.getTimestamp());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

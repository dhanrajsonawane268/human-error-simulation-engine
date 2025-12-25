package com.dhanraj.humanerror.service;

import com.dhanraj.humanerror.model.ErrorEvent;
import com.dhanraj.humanerror.model.ErrorType;
import com.dhanraj.humanerror.model.UserAction;
import com.dhanraj.humanerror.util.TimeUtil;
import com.dhanraj.humanerror.dao.ErrorEventDAO;

public class ErrorAnalysisService {

    public static String simulateError() {

        // Step 1: Create user action
        UserAction action = new UserAction("Submit Form", 2);

        // Step 2: Decide error type
        ErrorType type = ErrorType.TIME_PRESSURE;

        // Step 3: Create error event
        ErrorEvent event = new ErrorEvent(
                action,
                type,
                TimeUtil.getCurrentTime()
        );

        // ✅ Step 4: SAVE data into MySQL database
        ErrorEventDAO.save(event);

        // Step 5: Return response to browser
        return "Human Error Simulation Result:\n\n"
                + "Action: " + event.getAction().getActionName() + "\n"
                + "Error Type: " + event.getErrorType() + "\n"
                + "Time: " + event.getTimestamp();
    }
}

package com.lathief.emailscheduling.payload.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PushNotificationResponse {
    private int status;
    private String message;
    private String jobId;
    private String jobGroup;

    public PushNotificationResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
}

package ua.ucu.edu.apps.task1;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class FacebookUser {
    private String Email;
    private String  userCountry;
    private LocalDateTime userActiveTime;
}

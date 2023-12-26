package ua.ucu.edu.apps.task1;

import java.time.LocalDate;

public interface User {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveData();
}

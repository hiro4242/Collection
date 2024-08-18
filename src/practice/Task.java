package practice;

import java.time.LocalDate;

public class Task {
    LocalDate date;
    String task;

    Task(LocalDate date, String task) {
        this.date = date;
        this.task = task;
    }

    @Override
    public String toString() {
        return date + ":" + task;
    }

}

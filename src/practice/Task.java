package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    LocalDate date;
    String task;

    Task(LocalDate date, String task) {
        this.date = date;
        this.task = task;
    }

    @Override
    public String toString() {
        return this.date + ":" + this.task;
    }

	@Override
	public int compareTo(Task other) {
		return this.date.compareTo(other.date);
	}

}

package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chapter5{
	
public static void main(String[] args) {
	
    List<String> tasks = new ArrayList<String>(Arrays.asList(
            new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。").toString(),
            new Task(LocalDate.of(2021, 9, 15), "○○社面談。").toString(),
            new Task(LocalDate.of(2021, 12, 4), "手帳を買う。").toString(),
            new Task(LocalDate.of(2021, 8, 10), "散髪に行く。").toString(),
            new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。").toString()
    		));
    
    Collections.sort(tasks);
    
    for(int i = 0; i < tasks.size(); i++) {
    	System.out.println(tasks.get(i));
    }
}

}

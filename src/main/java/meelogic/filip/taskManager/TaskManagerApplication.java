package meelogic.filip.taskManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TaskManagerApplication {

    public static void main(String[] args) {
        //List<Task> taskList = TaskParser.parseTasksFromJson("sampleTasks");
        SpringApplication.run(TaskManagerApplication.class, args);
    }

}

package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
// TODO
//  :: Create a Java program that simulates a task list application.
// You’ll need to implement classes to manage tasks,
// create a task list, and perform
// operations like filtering,
// sorting,
// and date-based calculations.

        TaskList<Task> taskList = new TaskList<>();

            System.out.println("Welcome");
            // timestamp using LocalDateTime
            LocalDateTime timestamp = LocalDateTime.now();
            System.out.println("Today is " + timestamp);


// TODO
//  ::##COMPLETED##   :: ADD TASK ::
        //taskList.getTasks().add(new main.Task("ny Title","Ny beskrivelse",LocalDate.now()));
        taskList.getTasks().add(new Task("Tilføj Opgave","Ny beskrivelse",LocalDate.now()));
        System.out.println("#################");
        System.out.println("## ADD TASK");
        System.out.println(taskList.getTasks());

// TODO
//  ::##COMPLETED##   :: LOOP ALL TASKS ::
        List<Task> allTask = getAllTasks();
        System.out.println("#################");
        System.out.println("## LOOP ALL TASKS");
        allTask.forEach(System.out::println);

// TODO
//  :: Filter tasks based on a keyword in the title or description.
        List<Task> filterTitle = getAllTasks().stream()
                .filter(task -> task.getTitle().equals("Handle Ind")).collect(Collectors.toList());
                System.out.println("#################");
                System.out.println("## SEARCH FOR TITLE");
                System.out.println("Filter tasks based on a keyword in the title or description. -> ");
                filterTitle.forEach(System.out::println);
// TODO
//  :: Sort tasks by due date
//
        List<Task> sortDueDate = getAllTasks().stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
        System.out.println("#################");
        System.out.println("## Sorteret efter Dato, de ældste først.");
        sortDueDate.forEach(System.out::println);

        System.out.println("##### REVERSED Nyeste TASKS Først ########");
        List<Task> sortDueDateDESC = getAllTasks().stream()
                .sorted(Comparator.comparing(Task::getDueDate).reversed())
                .collect(Collectors.toList());
        System.out.println("#################");
        System.out.println("## Sortere efter Dato, de Nyeste først.");
        sortDueDateDESC.forEach(System.out::println);


// TODO :: Get tasks that are due today ::
        List<Task> sortForToday = getAllTasks().stream().limit(sortDueDate.stream().count())
                .sorted(Comparator.comparing(Task::getDueDate).reversed())
                .collect(Collectors.toList());
        System.out.println("#################");
        System.out.println("## Sortere TASKS KUN FOR IDAG, de Nyeste først.");
        sortForToday.forEach(System.out::println);
// TODO :: Print the list of tasks ::




    }


// TODO ::##COMPLETED##:: ADDED TASKS TO THE LIST ::
    private static List<Task> getAllTasks(){
        return List.of(
                new Task("Rengøring","Vaske op igen, pokkers..", LocalDate.of(2024, 8, 25)),
                new Task("Handle Ind","flamberet ål med mozeralla", LocalDate.of(2024, 8, 23)),
                new Task("Opfinde den dybe tallerken","hmmm...", LocalDate.of(2023, 9, 25)),
                new Task("Junglere med tornebuske ","av av av...", LocalDate.of(2011, 4, 25)),
                new Task("Læse en Bog om Jura","interessant..", LocalDate.of(2016, 11, 2)),
                new Task("Sortere Blomkål og radisser i haven","Denne opgave er muligvis overskredet deadline.", LocalDate.now())
        );
    }
}
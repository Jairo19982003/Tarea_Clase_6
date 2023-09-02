package Listas;
import java.util.*;

public class clsTaskList {

    private String taskName;
    private String taskDecription;
    private boolean isDone;

    public void listaValores(){}

    public void listaTareas(){

        List<clsTaskList> task = new ArrayList<>();
        clsTaskList tareaIndividual = new clsTaskList();
        tareaIndividual = new clsTaskList();

        tareaIndividual.setTaskName("hacer compras");
        tareaIndividual.setTaskDecription("ir a la torre");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new clsTaskList();

        tareaIndividual.setTaskName("sacar al perrito");
        tareaIndividual.setTaskDecription("pasear gua gua");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new clsTaskList();

        tareaIndividual.setTaskName("hacer la cama");
        tareaIndividual.setTaskDecription("Si no me pegan");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new clsTaskList();

        tareaIndividual.setTaskName("ir a votar");
        tareaIndividual.setTaskDecription("cumplir con mi pais");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new clsTaskList();

        task.get(1).setDone(true);

        int tarea_numero = 0;

        for (clsTaskList tl : task){

            if (!tl.isDone()) {
                System.out.println("Tarea: " + tl.getTaskName() + " Desc: " + tl.getTaskDecription() + " Hecho: " + tl.isDone());
                tarea_numero++;
            }
        }
    }


    //Getters and Setters
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDecription() {
        return taskDecription;
    }

    public void setTaskDecription(String taskDecription) {
        this.taskDecription = taskDecription;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}

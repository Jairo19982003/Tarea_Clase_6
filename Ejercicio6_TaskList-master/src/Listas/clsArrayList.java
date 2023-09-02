package Listas;
import java.util.*;

public class clsArrayList {

    public void ejemplo1() {
        List<String> taskList = new ArrayList<String>();
        taskList.add("task 1");
        taskList.add("task 2");
        taskList.add("task 3");
        taskList.add("task 4");

  /*      System.out.println(taskList);
        String primerTarea = taskList.get(0);
        System.out.println("primera: " + primerTarea);

        taskList.remove(0);
        primerTarea = taskList.get(0);
        System.out.println("primera: " + primerTarea);*/

        for (String tarea : taskList) {
            System.out.println("tarea: " + tarea);
        }
    }
        public void listaValores() {

            List<String> Valores = new ArrayList<String>();
            Valores.add("500");
            Valores.add("1000");
            Valores.add("1500");
            Valores.add("2000");
            Valores.add("2500");

            int suma = 0;
            suma = Integer.parseInt(Valores.get(0)) + Integer.parseInt(Valores.get(1)) + Integer.parseInt(Valores.get(2)) + Integer.parseInt(Valores.get(3)) + Integer.parseInt(Valores.get(4));
            System.out.println(suma);

        }

}

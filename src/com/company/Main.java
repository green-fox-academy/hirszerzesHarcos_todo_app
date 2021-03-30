package com.company;

import com.company.models.ToDo;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello To Do App!!!");
    System.out.println("Tessaiga!!!");
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
//    Path path = Paths.get("");
//    System.out.println(path.toAbsolutePath());
//    System.out.println(path.toAbsolutePath().getParent());
    if (args.length == 0) {
      String lista = "Parancssori Todo applikáció\n" +
              "=============================\n" +
              "\n" +
              "Parancssori argumentumok:\n" +
              "    -l   Kilistázza a feladatokat\n" +
              "    -a   Új feladatot ad hozzá\n" +
              "    -r   Eltávolít egy feladatot\n" +
              "    -c   Teljesít egy feladatot";
      System.out.println(lista);
      Integer var = 4;
      ToDo toDo = new ToDo("valamit kellene csinálni");
      System.out.println(toDo);
      toDo.setDone();
      System.out.println(toDo);
    }
  }
}

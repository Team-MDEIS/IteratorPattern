package com.alenasoft.behavioral.observer.views;

import com.alenasoft.behavioral.observer.models.Model;
import com.alenasoft.behavioral.observer.shared.Observer;

public class TableView implements Observer {

  public void display(Model model) {
    // Table with min & max age
    System.out.println("Table View");
    System.out.println("MAX age: " + model.getMaxAge());
    System.out.println("MIN age: " + model.getMinAge());
  }

  @Override
  public void notifyChange(Model model) {
    this.display(model);
  }
}

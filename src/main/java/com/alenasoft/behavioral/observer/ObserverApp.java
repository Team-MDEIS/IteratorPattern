package com.alenasoft.behavioral.observer;

import com.alenasoft.behavioral.observer.models.Model;
import com.alenasoft.behavioral.observer.shared.Observer;
import com.alenasoft.behavioral.observer.views.BarChartView;
import com.alenasoft.behavioral.observer.views.PieChartView;
import com.alenasoft.behavioral.observer.views.TableView;

public class ObserverApp {

  public static void main(String[] args) {
    Model model = new Model(70, 25);
    Observer tableView = new TableView();
    Observer barChartView = new BarChartView();
    Observer pieChartView = new PieChartView();

    model.attach(tableView);
    model.attach(barChartView);
    model.attach(pieChartView);

    model.setMaxAge(100);
    //model.setMinAge(10);
  }
}

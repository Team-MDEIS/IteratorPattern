package com.alenasoft.behavioral.observer.shared;

import com.alenasoft.behavioral.observer.models.Model;

public interface Observer {
  void notifyChange(Model model);
}

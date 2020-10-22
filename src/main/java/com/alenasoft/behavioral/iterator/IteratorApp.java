package com.alenasoft.behavioral.iterator;

import com.alenasoft.behavioral.iterator.cre.CREUserAggregate;
import com.alenasoft.behavioral.iterator.facebook.FacebookUserAggregate;
import com.alenasoft.behavioral.iterator.google.GoogleUserAggregate;
import com.alenasoft.behavioral.iterator.shared.Aggregate;
import com.alenasoft.behavioral.iterator.shared.Iterator;

public class IteratorApp {

  public static void main(String[] args) {
    Aggregate googleUserAggregate = new GoogleUserAggregate();
    printItemsFrom(googleUserAggregate.createIterator());

    Aggregate facebookUserAggregate = new FacebookUserAggregate();
    printItemsFrom(facebookUserAggregate.createIterator());

    Aggregate creUserAggregate = new CREUserAggregate();
    printItemsFrom(creUserAggregate.createIterator());

  }

  public static void printItemsFrom(Iterator iterator) {
    while (!iterator.isDone()) {
      System.out.println(iterator.currentItem());
    }
  }
}

package com.alenasoft.behavioral.iterator.google;

import com.alenasoft.behavioral.iterator.shared.Aggregate;
import com.alenasoft.behavioral.iterator.shared.Iterator;

public class GoogleUserAggregate implements Aggregate {

  @Override
  public Iterator createIterator() {
    return new GoogleUserIterator();
  }
}

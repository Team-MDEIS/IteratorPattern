package com.alenasoft.behavioral.iterator.facebook;

import com.alenasoft.behavioral.iterator.shared.Aggregate;
import com.alenasoft.behavioral.iterator.shared.Iterator;

public class FacebookUserAggregate implements Aggregate {

  @Override
  public Iterator createIterator() {
    return new FacebookUserIterator();
  }
}

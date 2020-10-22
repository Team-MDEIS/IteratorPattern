package com.alenasoft.behavioral.iterator.cre;

import com.alenasoft.behavioral.iterator.shared.Aggregate;
import com.alenasoft.behavioral.iterator.shared.Iterator;

public class CREUserAggregate implements Aggregate {

    @Override
    public Iterator createIterator() {
        return new CREUserIterator();
    }
}

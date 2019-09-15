package compositePattern;

import quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    Boolean checkDuck = false;
    public void add(Quackable quacker) {
        quackers.add(quacker);
        checkDuck = true;
    }
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            if(checkDuck==true) {
                quacker.quack();
                quacker.quack();
                quacker.quack();
                checkDuck=false;
            }
        }
    }
}

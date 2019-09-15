package abstractPattern;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import quack.QuackCounter;
import quack.QuackEcho;
import quack.Quackable;

public class EchoAndCounterDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }
    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}

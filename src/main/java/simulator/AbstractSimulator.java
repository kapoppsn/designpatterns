package simulator;

import abstractPattern.AbstractDuckFactory;
import abstractPattern.CountingDuckFactory;
import abstractPattern.EchoAndCounterDuckFactory;
import goose.Goose;
import goose.GooseAdapter;
import quack.QuackCounter;
import quack.Quackable;

import static com.sun.tools.doclint.Entity.times;

public class AbstractSimulator {
    public static void main(String[] args) {
        AbstractSimulator simulator = new AbstractSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory echoAndCounter = new EchoAndCounterDuckFactory();
        simulator.simulate(duckFactory);
        simulator.simulate2(echoAndCounter);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() +
" times");
    }

    void simulate2(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Echo and Counter Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() +
                " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}

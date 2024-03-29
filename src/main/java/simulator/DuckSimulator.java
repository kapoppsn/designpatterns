package simulator;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import goose.Goose;
import goose.GooseAdapter;
import pigeon.Pigeon;
import pigeon.PigeonAdapter;
import quack.QuackCounter;
import quack.QuackEcho;
import quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        Quackable duckEcho = new QuackEcho(new MallardDuck());
        Quackable duckEcho1 = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable duckEcho2 = new QuackEcho(new QuackCounter(new MallardDuck()));
        System.out.println("\nDuck Simulator: With Goose Adapter");
        simulate(mallardDuck);
        simulate(duckEcho);
        simulate(duckEcho1);
        simulate(duckEcho2);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}

package design.principles.solid;

//if class B is subclass of class A then we should be able to replace class A with class B without breaking the behavior of the program.
public class LiskovSubstitutionPrinciple {
}

interface Vehicle{
    void start();
    void accelerate();
}

class Bike implements Vehicle{
    @Override
    public void start() {
        //start engine
    }

    @Override
    public void accelerate() {
        //speed++;
    }
}


//violating Liskov's Substitution principle
class Cycle implements Vehicle{
    @Override
    public void start() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void accelerate() {
        //speed++;
    }
}


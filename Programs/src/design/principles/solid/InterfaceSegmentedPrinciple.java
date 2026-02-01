package design.principles.solid;

//Interfaces should be such, that the client should not need implement unnecessary functions they do not need.
public class InterfaceSegmentedPrinciple implements SchoolEmployee {
    @Override
    public void teach() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clockIn() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clockOut() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void conductAssembly() {
        throw new UnsupportedOperationException();
    }
}
interface SchoolEmployee {
    void teach();// [NOT OK] not all employees does it
    void clockIn(); // OK
    void clockOut();// OK
    void conductAssembly(); // [NOT OK] not all employees does it
}
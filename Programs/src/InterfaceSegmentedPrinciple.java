//Interfaces should be such, that the client should not need implement unnecessary functions they do not need.
public class InterfaceSegmentedPrinciple {
}
interface SchoolEmployee {
    void teach();// [NOT OK] not all employees does it
    void clockIn(); // OK
    void clockOut();// OK
    void conductAssembly(); // [NOT OK] not all employees does it
}
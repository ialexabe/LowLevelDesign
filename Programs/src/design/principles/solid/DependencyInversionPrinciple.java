package design.principles.solid;

//class should depend on interface rather than concrete classes
public class DependencyInversionPrinciple {
    static void main() {
        wiredKeyboard wiredKeyboard = new wiredKeyboard();
        WiredMouse wiredMouse = new WiredMouse();
        wirelessKeyboard wirelessKeyboard = new wirelessKeyboard();
        WirelessMouse wirelessMouse = new WirelessMouse();

        Laptop laptop1 = new Laptop(wiredKeyboard, wiredMouse);
        Laptop laptop2 = new Laptop(wirelessKeyboard, wirelessMouse);
        Laptop laptop3 = new Laptop(wiredKeyboard, wirelessMouse);
        Laptop laptop4 = new Laptop(wirelessKeyboard, wiredMouse);
    }
}
interface Keyboard{

}
class wirelessKeyboard implements Keyboard{

}
class wiredKeyboard implements Keyboard{

}
interface Mouse{

}
class WiredMouse implements Mouse{

}
class WirelessMouse implements Mouse{

}
class Laptop{
    Keyboard keyboard;
    Mouse mouse;
    Laptop(Keyboard keyboard,Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
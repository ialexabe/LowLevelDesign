package design.principles.solid;

import java.text.MessageFormat;
import java.util.logging.Logger;

//class should depend on interface rather than concrete classes
public class DependencyInversionPrinciple {
    private DependencyInversionPrinciple(){}
    static void main() {
        Logger logger = Logger.getLogger(DependencyInversionPrinciple.class.getName());
        WiredKeyboard wiredKeyboard = new WiredKeyboard();
        WiredMouse wiredMouse = new WiredMouse();
        WirelessKeyboard wirelessKeyboard = new WirelessKeyboard();
        WirelessMouse wirelessMouse = new WirelessMouse();

        Laptop laptop1 = new Laptop(wiredKeyboard, wiredMouse);
        Laptop laptop2 = new Laptop(wirelessKeyboard, wirelessMouse);
        Laptop laptop3 = new Laptop(wiredKeyboard, wirelessMouse);
        Laptop laptop4 = new Laptop(wirelessKeyboard, wiredMouse);

        logger.info(() -> MessageFormat.format("{0}{1}{2}{3}",
                laptop1, laptop2, laptop3, laptop4));
    }
}
interface Keyboard{

}
class WirelessKeyboard implements Keyboard{

}
class WiredKeyboard implements Keyboard{

}
interface Mouse{

}
class WiredMouse implements Mouse{

}
class WirelessMouse implements Mouse{

}

record Laptop(Keyboard keyboard, Mouse mouse) {
}
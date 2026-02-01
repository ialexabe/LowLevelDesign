//Each Class has Single Responsibility.
void main() {
    Item pen = new Item();
    Invoice invoice = new Invoice();
    int calculatedPrice = invoice.calculatePrice(pen);
    Printer printer = new Printer();
    printer.printBill(pen,calculatedPrice);
}

static class Item {
    final String name;
    final int price;
    Item(){
        this.name = "pen";
        this.price = 10;
    }
}

static class Invoice {
    private int calculatePrice(Item item) {
        return item.price* 5;
    }
}

static class Printer{
    private void printBill(Item item,int amount){
        System.out.println("*****Bill*****");
        System.out.println(item.name + " : " + item.price + " : " + amount);
        System.out.println("** Thank You **");

    }
}

//Each Class has Single Responsibility.
void main() {
    Item pen = new Item("pen", 10);
    Invoice invoice = new Invoice();
    int calculatedPrice = invoice.calculatePrice(pen, 5);
    Printer printer = new Printer();
    printer.printBill(pen,calculatedPrice);
}

static class Item {
    String name;
    int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
}

static class Invoice {
    private int calculatePrice(Item item,int quantity) {
        return item.price*quantity;
    }
}

static class Printer{
    private void printBill(Item item,int amount){
        System.out.println("*****Bill*****");
        System.out.println(item.name + " : " + item.price + " : " + amount);
        System.out.println("** Thank You **");

    }
}

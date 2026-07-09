void main() {
    IO.print("Enter Price of one dress: ");
    double product_price = Double.parseDouble(IO.readln());
    IO.print("Enter number of dresses to buy: ");
    double quantity = Double.parseDouble(IO.readln());
    IO.print("Discount rate: ");
    double discount = Double.parseDouble(IO.readln());
    double totalcost = Double.parseDouble(IO.readln());
    double discountAmoumt = discount / 100 * totalcost;
    double netPay = totalcost - discountAmoumt;
    IO.println("Total Cost = " + totalcost);
    IO.println("discountAmoumt = %.1f".formatted(discountAmoumt));
    IO.println("Net Pay " + netPay);

}
void main() {
    IO.print("Distance (km): ");
    double distance =  Double.parseDouble(IO.readln());
    IO.print("fuel efficiency: ");
    double fuelefficiency = Double.parseDouble(IO.readln());
    IO.print("fuel price per liter: ");
    double fuelpriceperliter = Double.parseDouble(IO.readln());
    double fuelused = distance / fuelefficiency;
    double expenses = fuelused * fuelpriceperliter;
    IO.println("Fuel used = %.2f,Total  cost =%2.f".formatted(fuelused, totalCost));
}
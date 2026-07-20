void main() {
    IO.print("Enter a number:");
    int number = Integer.parseInt(IO.readln());
    if (number == 1) {
        IO.println("Enter the base of the triangle:");
        int base = Integer.parseInt(IO.readln());
        IO.println("Enter the height of the triangle:");
        int height = Integer.parseInt(IO.readln());
        double area = 0.5 * base * height;
        IO.println("Area base: " + area);
        IO.println("Area height: " + area);
    }

    else {
        IO.println("Enter your weight in kilograms:");
        int weight = Integer.parseInt(IO.readln());
        IO.println("Enter your height in meters:");
        int height = Integer.parseInt(IO.readln());
        double bmi = weight / (height * height);
        IO.println("Weight = %.2f kg, Height = %.2f m, BMI = %.2f".formatted(weight, height, bmi));
    }
}

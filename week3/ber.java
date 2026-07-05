void main() {
    IO.print("Enter your number:");
    int num1 = Integer.parseInt(IO.readln());

    IO.print("Enter your number:");
    int num2 = Integer.parseInt(IO.readln());

    IO.print("Enter your number:");
    int num3 = Integer.parseInt(IO.readln());

    IO.print("Enter your number:");
    int num4 = Integer.parseInt(IO.readln());

    IO.print("Enter your number:");
    int num5 = Integer.parseInt(IO.readln());
    
    int sum = num1 + num2 + num3 + num4 + num5;
    double average = (double) sum / 5;
    System.out.println("The sum of the numbers is: " + sum);
    System.out.println("The average of the numbers is: " + average);
}

void main() {
    IO.print(("Enter age : "));
    int age = Integer.parseInt(IO.readln());
    if (age >= 59) {
        IO.println("Adult");
    } else if (age >= 19) {
        IO.println("TeenagerChild");
    } else if (age >= 9) {
        IO.println("Child");
    } else if (age >= 0) {
        IO.println("Invalid age !!!");
    } else {
        IO.println("Error output");
    }
}

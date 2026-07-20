void main() {
    IO.print("Enter number :");
    int number = Integer.parseInt(IO.readln());
    if (number % 2 == 0) {
        IO.println("จำนวนเต็มบวก");
    } else {
        IO.println("ไม่ใช่จำนวนเต็มบวก");
    }
    IO.println("จบโปรแกรม");
}

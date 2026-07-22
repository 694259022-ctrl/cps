void main() {
    IO.print("Enter your midterm score:");
    int midterm = Integer.parseInt(IO.readln());
    IO.print("Enter your final score:");
    int finalScore = Integer.parseInt(IO.readln());
    int totalScore = (midterm + finalScore);
    if (totalScore >= 50 ) {
        IO.println("your total score is " + totalScore + "the result is Pass!!");
    } else {
         IO.println("your total score is " + totalScore + "the result is Fail!!");
    }
}
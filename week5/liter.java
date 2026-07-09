void main() {
    IO.print("Enter Initial Saving :");
    double InitialSaving = Double.parseDouble(IO.readln());
    IO.print("Enter MonthlySaving :");
    double MonthlySaving = Double.parseDouble(IO.readln());
    IO.print("Enter Months :");
    double Months = Double.parseDouble(IO.readln());
    IO.print("Enter Interest percent :");
    double InterestPercent = Double.parseDouble(IO.readln());
    double totalSaving = InitialSaving + MonthlySaving * Months;
    double Interest = totalSaving * InterestPercent / 100;
    double FinalSaving = totalSaving + Interest;
    IO.println("TotalSaving = " + totalSaving);
    IO.println("Interest = " + Interest);
    IO.println("FinalSaving = " + FinalSaving);
}
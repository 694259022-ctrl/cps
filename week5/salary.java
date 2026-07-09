void main() {
    IO.print("Enter Salary: ");
    double salary = Double.parseDouble(IO.readln());
    IO.print("Enter Deduction percent: ");
    double deductionPercent = Double.parseDouble(IO.readln());
    double deductedfunds = salary * deductionPercent / 100;
    double netSalary = salary - deductedfunds;
    IO.println("Deduction = " + deductionPercent);
    IO.println("Net salary = " + netSalary);
}

void main() {
    IO.print("Enter the base of triangle: ");
    double baseTriangle = Double.parseDouble(IO.readln());
    IO.print("Enter the height of the triangle: ");
    double heightThetriangle = Double.parseDouble(IO.readln());
    IO.print("Enter the length of the rectangle: ");
    double lengthRectangle = Double.parseDouble(IO.readln());
    IO.print("Enter the width of the rectangle: ");
    double widthRectangle = Double.parseDouble(IO.readln());
    double areaTriangle = 0.5 * baseTriangle * heightThetriangle;
    double areaRectangle = lengthRectangle * widthRectangle;
    IO.println("Area of triangle: " + areaTriangle);
    IO.println("Area of rectangle: " + areaRectangle);
}
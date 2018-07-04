import HWFigures.Circle;
import HWFigures.Quadrate;
import HWFigures.Rectangle;
import HWFigures.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main

{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter type of figure:");
        String figure = null;

        try {
            figure = reader.readLine();
        } catch (IOException e) {
            System.out.print("Error" + e);
        }

        if (figure == "quadrate") {
            System.out.print("Enter side of a quadrate:");
            double quadrateSide = 0;
            try {
                quadrateSide = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                System.out.print("Something went wrong:" + e);
            }
            Quadrate quadrate = new Quadrate(quadrateSide);
            System.out.println("Perimeter: " + quadrate.Perimatr());
            System.out.println("Square: " + quadrate.Square());
        }

        String inputTriangle;
        String[] splitted = {};
        if (figure == "triangle") {
            try {
                System.out.print("Enter  high, side a, side b, side c  of triangle:");
                inputTriangle = reader.readLine();
                splitted = inputTriangle.split("(,\\s)|(,)");
            } catch (IOException e) {
                System.out.print("Something went wrong:" + e);
            }
            Triangle triangle = new Triangle(Double.parseDouble(splitted[0]),
                    Double.parseDouble(splitted[1]),
                    Double.parseDouble(splitted[2]),
                    Double.parseDouble(splitted[3]));
            System.out.println("Perimeter: " + triangle.Perimatr());
            System.out.println("Square: " + triangle.Square());
        }

        if (figure == "Circle") {
            System.out.print("Enter radius of a circle:");
            double radius = 0;
            try {
                radius = Double.parseDouble(reader.readLine());
            } catch (IOException e) {
                System.out.print("Something went wrong:" + e);
            }
            Circle circle = new Circle(radius);
            System.out.println("Perimeter: " + circle.Perimatr());
            System.out.println("Square: " + circle.Square());
        }

        if (figure == "Rectangle") {
            String inputRectangle;
            String[] splittedRectangle = {};
            try {
                System.out.print("Enter side A and side B of a rectangle separated by comma:");
                inputRectangle = reader.readLine();
                splittedRectangle = inputRectangle.split("(,\\s)|(,)");
            } catch (IOException e) {
                System.out.print("Something went wrong:" + e);
            }

            Rectangle rectangle = new Rectangle(Double.parseDouble(splittedRectangle[0]),
                    Double.parseDouble(splittedRectangle[1]));
            System.out.println("Perimeter: " + rectangle.Perimatr());
            System.out.println("Square: " + rectangle.Square());
        }

    }


    //String Hello = "Hello Word!!!";
    //System.out.print(Hello);

    //HW1 object = new HW1();

}


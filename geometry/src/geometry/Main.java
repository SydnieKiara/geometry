package geometry;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Geometry2D> geometry2DList = new LinkedList<>();
    private static LinkedList<Geometry3D> geometry3DList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add 2D geometry");
            System.out.println("2. Remove 2D geometry");
            System.out.println("3. Find 2D geometry");
            System.out.println("4. Add 3D geometry");
            System.out.println("5. Remove 3D geometry");
            System.out.println("6. Find 3D geometry");
            System.out.println("7. Exit");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    addGeometry(scanner, true); // 2D
                    break;
                case "2":
                    removeGeometry(scanner, true); // 2D
                    break;
                case "3":
                    findGeometry(scanner, true); // 2D
                    break;
                case "4":
                    addGeometry(scanner, false); // 3D
                    break;
                case "5":
                    removeGeometry(scanner, false); // 3D
                    break;
                case "6":
                    findGeometry(scanner, false); // 3D
                    break;
                case "7":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addGeometry(Scanner scanner, boolean is2D) {
        if (is2D) {
            System.out.println("Choose 2D shape to add:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            String choice = scanner.nextLine();
            Geometry2D shape = null;
            switch (choice) {
                case "1":
                    shape = createRectangle(scanner);
                    break;
                case "2":
                    shape = createCircle(scanner);
                    break;
                case "3":
                    shape = createTriangle(scanner);
                    break;
                default:
                    System.out.println("Invalid shape choice.");
                    return;
            }
            if (shape != null) {
                geometry2DList.add(shape);
                System.out.println("Shape added successfully.");
            }
        } else {
            System.out.println("Choose 3D shape to add:");
            System.out.println("1. Sphere");
            System.out.println("2. TriangularPrism");
            String choice = scanner.nextLine();
            Geometry3D shape = null;
            switch (choice) {
                case "1":
                    shape = createSphere(scanner);
                    break;
                case "2":
                    shape = createTriangularPrism(scanner);
                    break;
                default:
                    System.out.println("Invalid shape choice.");
                    return;
            }
            if (shape != null) {
                geometry3DList.add(shape);
                System.out.println("Shape added successfully.");
            }
        }
    }

    private static void removeGeometry(Scanner scanner, boolean is2D) {
        System.out.println("Enter the index of the shape to remove:");
        int index = Integer.parseInt(scanner.nextLine());
        if (is2D) {
            if (index >= 0 && index < geometry2DList.size()) {
                geometry2DList.remove(index);
                System.out.println("Shape removed successfully.");
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            if (index >= 0 && index < geometry3DList.size()) {
                geometry3DList.remove(index);
                System.out.println("Shape removed successfully.");
            } else {
                System.out.println("Invalid index.");
            }
        }
    }

    private static void findGeometry(Scanner scanner, boolean is2D) {
        System.out.println("Enter the index of the shape to find:");
        int index = Integer.parseInt(scanner.nextLine());
        if (is2D) {
            if (index >= 0 && index < geometry2DList.size()) {
                Geometry2D shape = geometry2DList.get(index);
                System.out.println("Found 2D shape: " + shape.toString());
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            if (index >= 0 && index < geometry3DList.size()) {
                Geometry3D shape = geometry3DList.get(index);
                System.out.println("Found 3D shape: " + shape.toString());
            } else {
                System.out.println("Invalid index.");
            }
        }
    }

    private static Geometry2D createRectangle(Scanner scanner) {
        System.out.println("Enter length:");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter width:");
        double width = Double.parseDouble(scanner.nextLine());
        return new Rectangle(length, width);
    }

    private static Geometry2D createCircle(Scanner scanner) {
        System.out.println("Enter radius:");
        double radius = Double.parseDouble(scanner.nextLine());
        return new Circimport java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Geometry2D> geometry2DList = new LinkedList<>();
    private static LinkedList<Geometry3D> geometry3DList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add 2D geometry");
            System.out.println("2. Remove 2D geometry");
            System.out.println("3. Find 2D geometry");
            System.out.println("4. Add 3D geometry");
            System.out.println("5. Remove 3D geometry");
            System.out.println("6. Find 3D geometry");
            System.out.println("7. Exit");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    addGeometry(scanner, true); // 2D
                    break;
                case "2":
                    removeGeometry(scanner, true); // 2D
                    break;
                case "3":
                    findGeometry(scanner, true); // 2D
                    break;
                case "4":
                    addGeometry(scanner, false); // 3D
                    break;
                case "5":
                    removeGeometry(scanner, false); // 3D
                    break;
                case "6":
                    findGeometry(scanner, false); // 3D
                    break;
                case "7":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addGeometry(Scanner scanner, boolean is2D) {
        if (is2D) {
            System.out.println("Choose 2D shape to add:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            String choice = scanner.nextLine();
            Geometry2D shape = null;
            switch (choice) {
                case "1":
                    shape = createRectangle(scanner);
                    break;
                case "2":
                    shape = createCircle(scanner);
                    break;
                case "3":
                    shape = createTriangle(scanner);
                    break;
                default:
                    System.out.println("Invalid shape choice.");
                    return;
            }
            if (shape != null) {
                geometry2DList.add(shape);
                System.out.println("Shape added successfully.");
            }
        } else {
            System.out.println("Choose 3D shape to add:");
            System.out.println("1. Sphere");
            System.out.println("2. TriangularPrism");
            String choice = scanner.nextLine();
            Geometry3D shape = null;
            switch (choice) {
                case "1":
                    shape = createSphere(scanner);
                    break;
                case "2":
                    shape = createTriangularPrism(scanner);
                    break;
                default:
                    System.out.println("Invalid shape choice.");
                    return;
            }
            if (shape != null) {
                geometry3DList.add(shape);
                System.out.println("Shape added successfully.");
            }
        }
    }

    private static void removeGeometry(Scanner scanner, boolean is2D) {
        System.out.println("Enter the index of the shape to remove:");
        int index = Integer.parseInt(scanner.nextLine());
        if (is2D) {
            if (index >= 0 && index < geometry2DList.size()) {
                geometry2DList.remove(index);
                System.out.println("Shape removed successfully.");
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            if (index >= 0 && index < geometry3DList.size()) {
                geometry3DList.remove(index);
                System.out.println("Shape removed successfully.");
            } else {
                System.out.println("Invalid index.");
            }
        }
    }

    private static void findGeometry(Scanner scanner, boolean is2D) {
        System.out.println("Enter the index of the shape to find:");
        int index = Integer.parseInt(scanner.nextLine());
        if (is2D) {
            if (index >= 0 && index < geometry2DList.size()) {
                Geometry2D shape = geometry2DList.get(index);
                System.out.println("Found 2D shape: " + shape.toString());
            } else {
                System.out.println("Invalid index.");
            }
        } else {
            if (index >= 0 && index < geometry3DList.size()) {
                Geometry3D shape = geometry3DList.get(index);
                System.out.println("Found 3D shape: " + shape.toString());
            } else {
                System.out.println("Invalid index.");
            }
        }
    }

    private static Geometry2D createRectangle(Scanner scanner) {
        System.out.println("Enter length:");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter width:");
        double width = Double.parseDouble(scanner.nextLine());
        return new Rectangle(length, width);
    }

    private static Geometry2D createCircle(Scanner scanner) {
        System.out.println("Enter radius:");
        double radius = Double.parseDouble(scanner.nextLine());
        return new Circle(radius);
    }

    private static Geometry2D createTriangle(Scanner scanner) {
        System.out.println("Enter base:");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height:");
        double height = Double.parseDouble(scanner.nextLine());
        return new Triangle(base, height);
    }

    private static Geometry3D createSphere(Scanner scanner) {
        System.out.println("Enter radius:");
        double radius = Double.parseDouble(scanner.nextLine());
        return new Sphere(radius);
    }

    private static Geometry3D createTriangularPrism(Scanner scanner) {
        System.out.println("Enter base:");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height:");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter depth:");
        double depth = Double.parseDouble(scanner.nextLine());
        return new TriangularPrism(base, height, depth);
    }
}
        le(radius);
    }

    private static Geometry2D createTriangle(Scanner scanner) {
        System.out.println("Enter base:");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height:");
        double height = Double.parseDouble(scanner.nextLine());
        return new Geometry2D(base, height);
    }

    private static Geometry3D createSphere(Scanner scanner) {
        System.out.println("Enter radius:");
        double radius = Double.parseDouble(scanner.nextLine());
        return new Geometry3D(radius);
    }

    private static Geometry3D createTriangularPrism(Scanner scanner) {
        System.out.println("Enter base:");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height:");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter depth:");
        double depth = Double.parseDouble(scanner.nextLine());
        return new Geometry3D(base, height, depth);
    }
}

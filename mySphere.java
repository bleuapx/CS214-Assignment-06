public class mySphere {
    private double diameter;

    public mySphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getVolume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        double radius = diameter / 2.0;
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Sphere with diameter " + diameter;
    }

    public static void main(String[] args) {
        mySphere sphere1 = new mySphere(5.0);
        mySphere sphere2 = new mySphere(10.0);

        System.out.println("Initial values:");
        System.out.println(sphere1);
        System.out.println(sphere2);
        System.out.println();

        sphere1.setDiameter(6.0);
        sphere2.setDiameter(12.0);

        System.out.println("New values:");
        System.out.println(sphere1);
        System.out.println(sphere2);

        System.out.println("Sphere 1 volume: " + sphere1.getVolume());
        System.out.println("Sphere 1 surface area: " + sphere1.getSurfaceArea());
        System.out.println("Sphere 2 volume: " + sphere2.getVolume());
        System.out.println("Sphere 2 surface area: " + sphere2.getSurfaceArea());
    }
}
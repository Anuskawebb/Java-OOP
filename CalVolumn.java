interface Volume {
    double InVolume();
    double OutVolume();
}

class MachinePart implements Volume {
    double s1, s2, s3;

    public MachinePart(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double InVolume() {
        return (1.0 / 3) * Math.PI * s1 * s2 * s3;
    }

    @Override
    public double OutVolume() {
        return (4.0 / 3) * Math.PI * s1 * s2 * s3;
    }
}

public class CalVolumn {
    public static void main(String[] args) {
        MachinePart part = new MachinePart(3, 4, 5);
        System.out.println("InVolume of the part: " + part.InVolume());
        System.out.println("OutVolume of the part: " + part.OutVolume());
    }
}

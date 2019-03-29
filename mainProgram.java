package InheritancePoint290319;

public class mainProgram {
    public static void main(String[] args) {
        Point3D newP3D = new Point3D(1.3f,2.3f,3.3f);
        System.out.println("Thong tin bien newPoint3D : ");
        System.out.println(newP3D.toString());

        float[] print1 = newP3D.getXYZ();
        for (int i = 0; i< print1.length; i++){
            System.out.println(print1[i]);
        }

        Point2D newP2D = new Point2D(4.2f,5.6f);
        System.out.println("Thong tin bien newPoint2D : ");
        System.out.println(newP2D.toString());
        newP2D.getXY();
        float[] print2 = newP2D.getXY();
        for (int i = 0; i< print2.length; i++){
            System.out.println(print2[i]);
        }
    }
}

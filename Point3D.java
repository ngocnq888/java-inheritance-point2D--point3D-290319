package InheritancePoint290319;

public class Point3D {
    Point3D(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Point3D(){
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
    }
     float x;
     float y;
     float z;

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = {x,y,z};
        return arr;
    }
    public String toString(){
        String str = " ";
        str += this.x + " " + this.y + " " + this.z ;
        return  str;
    }


}

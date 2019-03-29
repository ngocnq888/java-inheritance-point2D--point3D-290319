package InheritancePoint290319;

public class Point2D extends Point3D {
    Point2D(){
        super();
    }
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x ){
        this.x = x;
    }
    public float getY(){
        return this.y;
    }
    public void setY(float y ){
        this.y = y;
    }
    public float[] getXY(){
        float[] arrXY ={this.x,this.y};
        return arrXY;
    }
    public void setXY(float x,float y ){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        String str2D = " ";
        str2D += this.x + " " + this.y + " " + this.z + " " ;
        return str2D;
    }
}

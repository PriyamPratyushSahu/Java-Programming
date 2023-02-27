package _0_Challenges;

class  Cylinder
{
    private int height;
    private int radius;

    public Cylinder(){
        radius=height=1;
    }

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }
    //Setter
    public void setHeight(int h){
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r){
        if (r >= 0)
            radius = r;
        else
            radius = 0;
    }
    
    //Getter
    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }
    
    public void setDimensions(int h,int r){
        height=h;
        radius=r;
    }
    
    public double lidArea(){
        return  Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double drumArea(){
        return 2*lidArea()+perimeter()*height;
    }
    public double volume(){
        return lidArea()*height;
    }
}


public class _33_CylinderTest {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        
        int h, r;
        h = 10 + (int) Math.round(Math.random() * 20);
        r = 5 + (int)Math.round(Math.random()* 20);
        c.setHeight(h);
        c.setRadius(r);
        c.setDimensions(h,r);

        System.out.println("LidArea: " + String.format("%.2f", c.lidArea()));
        System.out.println("Circumference: " + String.format("%.2f",c.perimeter()));
        System.out.println("Total Surface Area: " +String.format("%.2f",c.drumArea()));
        System.out.println("Volume: " +String.format("%.2f",c.volume()));
        System.out.println("Height: " + c.getHeight());
        System.out.println("Radius: " + c.getRadius());

    }
}
/*
        ******************************** VARIABLE DESCRIPTION********************************
       Variable           Type                               Description
1.      height             int                                 height of the cylinder
2.      radius             int                                 radius of the cylinder
3.      Cylinder()        non parameterised constructor        default initialisation of                                                                    height & radius
4.      Cylinder(r,h)      parameterised constructor           initialisation of height
                                                               and radius with given value
5.      setHeight(h)       method                              set height value
6.      setRadius(r)       method                              set radius value
7.      getHeight()        method                              fetch height value
8.      getRadius()        method                              fetch radius value
9.      setDimensions()    method                              set height and radius value
10.     lidArea()          method                              calculate cylinder's lid area
11.     perimeter()        method                              calculate cylinder's perimeter
12      drumArea()         method                              calculate cylinder's drum area
13.     volume()           method                              calculate cylinder's volume
 */     

/*
****************************** OUTPUT ******************************
LidArea: 530.93
Circumference: 81.68
Total Surface Area: 2450.44
Volume: 9025.80
Height: 17
Radius: 13
 */
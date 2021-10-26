import java.io.IOException;
import java.io.InputStreamReader;
interface Drawable{  
void draw();

void getArea();  
}   
class RectangleShape  implements Drawable
{
   int area, length, breadth;
  
   RectangleShape(int l , int b) 
   { 
      length = l; 
      breadth = b; 
   } 
   public void getArea() 
   { 
      area = length * breadth; 
      System.out.println("Area of rectangle : " + area); 
   } 
   public void draw()
   {
	   System.out.println("drawing rectangle");
   } 
}

class Interface_Example2{  
public static void main(String args[]){  
Drawable d1=new RectangleShape(2,4);
d1.draw(); 
d1.getArea();
}} 

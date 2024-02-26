class circle
{
        float radius;
        circle (float r){
                radius=r;
        }
        circle(){
                radius=5.0f;
        }
        void circumference(){
                float pi=3.14f;
                float circum=2*pi*radius;
                System.out.println("circumference="+circum);
        }
}
class circledemo
{
        public static void main(String []args)
        {
                circle c1=new circle(5.0f);
                c1.circumference();
        }
}

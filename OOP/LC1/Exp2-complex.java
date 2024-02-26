class complex{
        float real,img;
        complex (float r, float i)
        {
        real=r;
        img=i;
        }
        complex()
        {
        real=0;img=0;
        }
complex add(complex c2){
complex result=new complex();
result.real=real+c2.real;
result.img=img+c2.img;
return(result);
}

complex subtract(complex c2){
complex result=new complex();
result.real=real+c2.real;
result.img=img+c2.img;
return (result);
}

complex multiply(complex c2){
complex result=new complex ();
result.real=((real*c2.real)-(img*c2.img));
result.img=((real*c2.img)+(img*c2.real));
return(result);
}

void display(){
System.out.println(real+"+i"+img);
}
}

class complexdemo{
public static void main(String args[]){
complex c1=new complex(3.0f,6.0f);
complex c2=new complex(2.0f,4.0f);
complex c3=new complex();
System.out.println("c1: ");
c1.display();
System.out.println("c2: ");
c2.display();
c3=c1.add(c2);
System.out.println("addition");
c3.display();
complex c4=new complex();
c4=c1.subtract(c2);
System.out.println("subtraction: ");
c4.display();
complex c5=new complex();
c5=c1.multiply(c2);
System.out.println("multiplication: ");
c5.display();
}
}

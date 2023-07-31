package com.workintech.inheritance.mathModel;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double length,double width) {
        //this.width = width < 0 ? 0 : width; (set yerine böyle yapılabilir) ternary expression
        //this.length= length < 0 ? 0 : length;
        this.width = width;
        this.length=length;

    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length < 0 ) {
            this.length=0;
        } else {
            this.length=length;
        }
    }

    public void setWidth(double width) {
       if (width < 0) {
           this.width=0;
       } else {
           this.width=width;
       }
    }
    public double getLength(){
        return length;
    }

    public double getArea(){
       return width*length;
    }

}


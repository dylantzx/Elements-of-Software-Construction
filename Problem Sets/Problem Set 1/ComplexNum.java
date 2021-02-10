package com.example.Qns3;

public class ComplexNum {
    double real, img;

    ComplexNum(){
        new ComplexNum(0,0);
    }

    ComplexNum(double real, double img){
        this.real = real;
        this.img = img;
    }

    public String toString(){
        if (this.img < 0){
            return this.real + " - " + (-this.img) + "i";
        }
        else if (this.img > 0) {
            return this.real + " + " + this.img + "i";
        }
        else return this.real + "";
    }
}

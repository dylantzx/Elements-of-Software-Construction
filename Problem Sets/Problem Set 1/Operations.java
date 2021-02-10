package com.example.Qns3;

public class Operations {
    static ComplexNum complexOp = new ComplexNum();

    public static ComplexNum add(ComplexNum c1, ComplexNum c2)
    {
        complexOp.real = c1.real + c2.real;
        complexOp.img = c1.img + c2.img;

        return complexOp;
    }
    public static ComplexNum subtract(ComplexNum c1, ComplexNum c2)
    {
        complexOp.real = c1.real - c2.real;
        complexOp.img = c1.img - c2.img;

        return complexOp;
    }
    public static ComplexNum multiply(ComplexNum c1, ComplexNum c2)
    {
        // (a+bi)(c+di) = (ac-bd) + (ad+bc)i
        complexOp.real = (c1.real*c2.real)-(c1.img*c2.img);
        complexOp.img = (c1.real*c2.img) + (c1.img*c2.real);

        return complexOp;
    }
    public static ComplexNum divide(ComplexNum c1, ComplexNum c2)
    {
        // multiply by the conjugate
        double denominator;
        // (a+bi)(a-bi) = a^2 + b^2
        denominator = Math.pow(c2.real,2) + Math.pow(c2.img,2);
        complexOp.real = ((c1.real*c2.real)+(c1.img*c2.img))/denominator;
        complexOp.img = (-(c1.real*c2.img)+(c1.img*c2.real))/denominator;
        return complexOp;
    }
}

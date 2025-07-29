package com.abstraction;

interface Drawable{
	void draw();
}
interface Printable extends Drawable{
	void print();
}

class Image implements Printable{
	public void print() {
		System.out.println("image is printing");
	}
	public void draw() {
		System.out.println("image is drawing");
	}
}
public class ExtendsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image img=new Image();
		img.draw();
		img.print();
	}

}

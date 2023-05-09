package com.ccav.test;
interface Drawable{
	public void draw();
}
public class WithOutLambdaExpressionExample{
 public static void main(String[] args) {
	 int radius = 8;
	 Drawable d = new Drawable() {
		
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("circle radius is :"+radius);
		}
	};
	
	d.draw();
 }
}

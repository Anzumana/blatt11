public class Rectangle{
	private int width;
	private int height;
	private int area;
	Rectangle(int area){
		this.area = area;
		this.width = area;
		this.height = 1;
	}
		
	void setWidth(int width){
		if( (area/width)>0 && area%width==0){
			this.height = area/width;
			this.width = width;
		}
	}
	int getWidth(){
		return width;
	}
	void setHeight(int height){
		if( (area/height)>0 && area%height==0){
			this.width = area/height;
			this.height = height;
		}
	}
	int getHeight(){
		return height;
	}
	int getArea(){
		return area;
	}
	public String toString(){
		return "Rectangle area: " + area + " " + "height: " + height + " " + "width " + width;
	}
	public static void main(String[] args){
		Rectangle myRectangle = new Rectangle(4);
		System.out.println(myRectangle);
		myRectangle.setHeight(5);
		System.out.println(myRectangle);
		myRectangle.setHeight(3);
		System.out.println(myRectangle);
		myRectangle.setHeight(2);
		System.out.println(myRectangle);
		myRectangle.setHeight(4);
		System.out.println(myRectangle);
	}


}

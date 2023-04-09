package MasterpieceJava.ch4;

public class Box {
    private int width;
    private int length;
    private int height;
    private boolean empty = false;
    
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
    public boolean isEmpty(){
        return empty;
    }
    public void setEmpty(boolean empty){
        this.empty = empty;

    }
    public Box(){
        width = 0;
        length = 0;
        height = 0;
        empty = true;
    }
    public void box(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
        empty = true;
    }
}

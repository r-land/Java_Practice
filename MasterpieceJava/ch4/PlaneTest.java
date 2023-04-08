package MasterpieceJava.ch4;

class Plane{
    private int num;
    private int p_num;
    private String model;
    private static int planes;

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        num = n;
    }

    public int getPnum() {
        return p_num;
    }

    public void setPnum(int pn) {
        p_num = pn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String m) {
        model = m;
    }

    public static int getPlanes() {
		return planes;
	}

    public static void setPlanes(int p) {
		planes = p;
	}
    public Plane(){planes++;     }
    public Plane(int n, String m){
        num = n;
        p_num = 0;
        model = m;
        planes++;
    }
public Plane(int n,String m,int pn){
    num = n;
    p_num = pn;
    model = m;
    planes++;
}
public String toString(){
    return "식별번호:" + getNum() + "모델:" +getModel()+"승객수:" + getPnum();
}
}
public class PlaneTest {
    public static void main(String[] args) {
        Plane plane1 = new Plane(1, "aa", 200);
        Plane plane2 = new Plane(2, "bb");
        Plane plane3 = new Plane();
        plane3.setNum(3);
        plane3.setModel("cc");
        plane3.setPnum(150);
        System.out.println("Total planes:"+Plane.getPlanes());
        System.out.println(plane1.toString());
        System.out.println(plane2.toString());
        System.out.println(plane3.toString());
        
    }
    
}

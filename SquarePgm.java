public class SquarePgm {
	int x1,y1;
	void get(int x,int y){
		x1=x;
		y1=y;
	}
	static int sq(SquarePgm s,SquarePgm s1){
		return (s.x1-s1.x1)*(s.x1-s1.x1)+(s.y1-s1.y1)*(s.y1-s1.y1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquarePgm s=new SqaurePgm();
		SquarePgm s1=new SqaurePgm();
		SquarePgm s2=new SquarePgm();
		SquarePgm s3=new SquarePgm();
		s.get(20,10);
		s1.get(10, 20);
		s2.get(20,20);
		s3.get(10,10);
		int a=0;
		int d2=sq(s,s1);
		System.out.println(d2);
		int d3=sq(s,s2);
		System.out.println(d2);
		int d4=sq(s,s3);
		System.out.println(d3);
		if(d2==d3&&d4==2*d2){
			int d=sq(s1,s3);
			if(d==sq(s2,s3)&&d==d2){
				a=1;
			}
		}
			if(d3==d4 &&2*d3==d2){
				int d=sq(s1,s2);
				if(d==sq(s1,s3)&&d==d3){
					a=1;
			}
			}
			if(d2==d4&&2*d2==d3){
				int d=sq(s1,s2);
				if(d==sq(s2,s3)&&d==d2){
					a=1;
				}
			}
				if(a==1){
					System.out.println("yes it is");
				}
				else
				System.out.println("no it is not");
	}

}
package day15.miniPrj;

public class 회원정보 {
	
	public static void main(String[] args) {
		Info[] infomation = new Info[4];
		
		infomation[0]= new Info("tmpark11","박태민",98911510);
		infomation[1]= new Info("tsdfrk12","표준태",63819164);
		infomation[2]= new Info("tmpark11","김태민",93811510);
		infomation[3]= new Info("dmpark12","이준태",98969164);
		
		InfoArrays.sort(infomation);	// 이름순
		for(Info info : infomation) {
			System.out.println(info);
		}
	}

}

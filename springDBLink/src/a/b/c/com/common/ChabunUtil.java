package a.b.c.com.common;

public abstract class ChabunUtil {

	public static final String BIZ_GUBUN_D = "D"; //학과
	public static final String BIZ_GUBUN_L = "L"; //과목
	public static final String BIZ_GUBUN_B = "B"; //게시판
	public static final String BIZ_GUBUN_RB = "RB"; //게시판 댓글
	public static final String BIZ_GUBUN_N = "N"; //공지
	
	// type : D : 20210001, M : YYYYMM, Y : YYYY, N : 
	public static String numPad(String t, String c) {
		
		for(int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}
		String ymd = DateFormatUtil.ymdFormats(t);
		return ymd.concat(c);
	}
	
	//학과 번호
	public static String getDeptChabun(String type, String memNum) {
		
		return BIZ_GUBUN_D.concat(ChabunUtil.numPad(type, memNum));
	}
	
	//과목 번호
	public static String getLessonChabun(String type, String memNum) {
		
		return BIZ_GUBUN_L.concat(ChabunUtil.numPad(type, memNum));
	}
	
	// 게시판 글 번호  
	public static String getBoardChabun(String type, String memNum) {
		
		return BIZ_GUBUN_B.concat(ChabunUtil.numPad(type, memNum));
	}
	
	// 게시판 댓글 글 번호  
	public static String getRboardChabun(String type, String memNum) {
		
		return BIZ_GUBUN_RB.concat(ChabunUtil.numPad(type, memNum));
	}
	
	// 공지사항  번호  
	public static String getNoticeChabun(String type, String memNum) {
		
		return BIZ_GUBUN_N.concat(ChabunUtil.numPad(type, memNum));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String c = "1";
		System.out.println(">>> : " + ChabunUtil.getDeptChabun("D", c));
		System.out.println(">>> : " + ChabunUtil.getBoardChabun("N", c));
		System.out.println(">>> : " + ChabunUtil.getRboardChabun("N", c));
		System.out.println(">>> : " + ChabunUtil.getNoticeChabun("N", c));
		
	}
}

package ch08.class09;

	public class SongMain {
	    public static void main(String[] args) {
	        // Song 객체 생성
	        Song dancingQueen = new Song();

	        // 노래 정보 설정
	        dancingQueen.setSongInfo("Dancing Queen", "ABBA", "Arrival", "Benny Andersson, Björn Ulvaeus", 1976, 3);

	        // 노래 정보 출력
	        dancingQueen.show();
	    }
	}
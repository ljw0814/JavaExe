package ch08.class09;

public class Song {
// 필드, 생성자, 메소드
	//클래스의 멤버변수, 노래정보
	public String title;
	public String artist;
	public String album;
	public String composer;
	public int year;
	public int track;
	// 생성자 초기화
	public Song(String title, String artist, String album, String composer,
			int year, int track ) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
	}
	
	// 출력메소드
	public void printSong() {
        System.out.println("노래 제목: " + title);
        System.out.println("가수: " + artist);
        System.out.println("앨범: " + album);
        System.out.println("작곡가: " + composer);
        System.out.println("년도: " + year);
        System.out.println("트랙 번호: " + track);
	}	
}
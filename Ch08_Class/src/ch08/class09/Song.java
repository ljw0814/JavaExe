package ch08.class09;

public class Song {
    // 멤버변수
    private String title;
    private String artist;
    private String album;
    private String composer;
    private int year;
    private int track;

    // 메서드: 노래정보 저장
    public void setSongInfo(String title, String artist, String album,
                            String composer, int year, int track) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
    }

    // 메서드: 노래 정보 출력
    public void show() {
        System.out.println("노래 제목: " + title);
        System.out.println("가수: " + artist);
        System.out.println("앨범: " + album);
        System.out.println("작곡가: " + composer);
        System.out.println("년도: " + year);
        System.out.println("트랙 번호: " + track);
    }
}
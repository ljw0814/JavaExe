package ch10_Collection01.ch15.sec02.exam01;

public class Board {
	private String subject;
	private String content;
	private String writer;
    // Board 클래스의 생성자
    // 글의 제목, 내용, 작성자를 받아서 객체를 초기화하는 역할
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	public String getSubject() {return subject;}
	public void setSubject(String subject) {this.subject = subject;}
	public String getContent()  {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() { return writer; }
	public void setWriter(String writer) {this.writer = writer;}

}

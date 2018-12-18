package com.jquery.ajax.board;

public class BoardVO {
    private int seq;
    private String title;
    private String content;
    private String regdate;
    private int hits;
    private int like;
    
    public BoardVO(){}
        
    public BoardVO(int seq , String title, String content, String regdate , int hits){
        this.seq = seq;
        this.title = title;
        this.content = content;
        this.regdate = regdate;
        this.hits = hits;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getHit() {
        return hits;
    }

    public void setHit(int hit) {
        this.hits = hits;
    }
    
    public int getLike() {
      return like;
    }

    public void setLike(int like) {
      this.like = like;
    }
    
}

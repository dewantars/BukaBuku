package sistem;

public class Comment {
    private String comment;
    private String tanggalComment;

    public Comment(String comment, String tanggalComment) {
        this.comment = comment;
        this.tanggalComment = tanggalComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTanggalComment() {
        return tanggalComment;
    }

    public void setTanggalComment(String tanggalComment) {
        this.tanggalComment = tanggalComment;
    }


}

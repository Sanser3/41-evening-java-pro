package lessons.lesson10;

import java.util.Objects;

public class Author {
    private String AuthorName;

    private String comments;

    public Author(String authorName) {
        AuthorName = authorName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorName='" + AuthorName + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(AuthorName, author.AuthorName) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(AuthorName);
    }
}

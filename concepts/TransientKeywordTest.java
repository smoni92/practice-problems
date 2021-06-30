package concepts;

class TransientKeyword {

    private transient String outer1;
    private transient String outer2;
    private transient String outer3;

    private transient TransientKeyword transientKeyword = this;

    TransientKeyword(String outer1, String outer2, String outer3) {
        this.outer1 = outer1;
        this.outer2 = outer2;
        this.outer3 = outer3;
    }

    public void setTransientKeyword(TransientKeyword transientKeyword) {
        this.transientKeyword = transientKeyword;
    }

    @Override
    public String toString() {
        return "TransientKeyword{" +
                "outer1='" + outer1 + '\'' +
                ", outer2='" + outer2 + '\'' +
                ", outer3='" + outer3 + '\'' +
                ", transientKeyword=" + transientKeyword.outer1 + " " + transientKeyword.outer2 + " " + transientKeyword.outer3 +
                '}';
    }

}

public class TransientKeywordTest {

    public static void main(String[] args) {

        TransientKeyword transKey = new TransientKeyword("outer1", "outer2", "outer3");
        System.out.println("Transient Keyword 1: " + transKey);

        TransientKeyword transKey1 = new TransientKeyword("outer4", "outer5", "outer6");
        System.out.println("Transient Keyword 2: " + transKey1);

        transKey.setTransientKeyword(transKey1);

        System.out.println("Transient Keyword 1 after Setting Transient Keyword 2: " + transKey);
        System.out.println("Transient Keyword 2 after Setting Transient Keyword 2: " + transKey1);
    }
}
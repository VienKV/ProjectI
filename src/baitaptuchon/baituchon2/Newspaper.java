package baitaptuchon.baituchon2;

public class Newspaper extends Document {
    private int dayIssue;

    public Newspaper(String id, String nxb, int number, int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngay phat hanh=" + dayIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", so ban phat hanh='" + number + '\'' +
                '}';
    }
}

package baitaptuchon.baituchon3;

public class CandidateA extends Candidate {
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "Thi sinh khoi A{" +
                "sbd='" + id + '\'' +
                ", Ho ten='" + name + '\'' +
                ", Dia chi='" + address + '\'' +
                ", Muc uu tien=" + priority + ", Cac mon thi: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}

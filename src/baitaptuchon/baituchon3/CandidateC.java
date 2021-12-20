package baitaptuchon.baituchon3;

public class CandidateC extends Candidate {

    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "Thi sinh khoi C{" +
                "sbd='" + id + '\'' +
                ", Ho ten='" + name + '\'' +
                ", Dia chi='" + address + '\'' +
                ", Muc uu tien=" + priority + ", Cac mon thi: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}

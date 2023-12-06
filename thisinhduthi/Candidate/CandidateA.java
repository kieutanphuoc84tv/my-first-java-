package Candidate;

public class CandidateA extends Candidate {
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "thi khoi A{" +
                "MSSV='" + id + '\'' +
                ", HO VA TEN='" + name + '\'' +
                ", DIA CHI='" + address + '\'' +
                ", BAC UU TIEN=" + priority + ", KHOI: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}

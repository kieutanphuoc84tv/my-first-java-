package Candidate;

public class CandidateB extends Candidate {

    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "thi khoi B{" +
                "MSSV='" + id + '\'' +
                ", HO VA TEN='" + name + '\'' +
                ", DIA CHI='" + address + '\'' +
                ", BAC UU TIEN=" + priority + ", KHOI: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';
    }
}

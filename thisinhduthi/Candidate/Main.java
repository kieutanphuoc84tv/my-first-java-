package Candidate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandidate managerCandidate = new ManagerCandidate();
        while (true) {
                    System.out.println("bang thong tin");
             System.out.println("Enter 1: de nhap khoi");
                        System.out.println("Enter 2: de show thong tin khoi: ");
             System.out.println("Enter 3: tim kim mssv");
                        System.out.println("Enter 4: de thoat:");
                                        String line = scanner.nextLine();
            switch (line) {
                case "1": {
                            System.out.println("Enter a: de nhap thong tin khoi A");
                                                 System.out.println("Enter b: de nhap thong tin khoi B");
                                                        System.out.println("Enter c: de nhap thong tin khoi C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                                 managerCandidate.add(createCadidate(scanner, "a"));
                                     break;

                        }
                            case "b": {
                                managerCandidate.add(createCadidate(scanner, "b"));
                                    break;
                        }
                            case "c": {
                                        managerCandidate.add(createCadidate(scanner, "c"));
                                 break;
                        }
                        default:
                            System.out.println("KHONG TON TAI!");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("nhap mssv: ");
                    String id = scanner.nextLine();
                    Candidate candidate = managerCandidate.searchById(id);
                    if (candidate == null) {
                        System.out.println("khong tim thay!");
                    } else {
                        System.out.println(candidate.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("KHONG TON TAI!");
                    continue;
            }

        }
    }

    public static Candidate createCadidate(Scanner scanner, String cate) {
        System.out.print("nhap MSSV: ");
        String id = scanner.nextLine();
        System.out.print("nhap HO VA TEN: ");
        String name = scanner.nextLine();
        System.out.print("Nhap Dia Chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap bac uu tien: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new CandidateA(id, name,address,priority);
        } else if (cate.equals("b")) {
            return new CandidateB(id, name,address,priority);
        } else {
            return new CandidateC(id, name,address,priority);
        }

    }
}

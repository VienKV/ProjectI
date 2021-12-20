package baitaptuchon.baituchon3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandidate managerCandidate = new ManagerCandidate();
        while (true) {
            System.out.println("Ung dung quan ly thi sinh du thi DH");
            System.out.println("Nhap 1: De them thi sinh");
            System.out.println("Nhap 2: De hien thi thong tin cua thi sinh: ");
            System.out.println("Nhap 3: De tim kiem theo SBD");
            System.out.println("Nhap 4: De thoat:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap a: de them thi sinh khoi A");
                    System.out.println("Nhap b: de them thi sinh khoi B");
                    System.out.println("Nhap c: de them thi sinh khoi C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            managerCandidate.add(createCadidate(scanner,"a"));
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
                            System.out.println("Khong hop le!");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("Nhap SBD: ");
                    String id = scanner.nextLine();
                    Candidate candidate = managerCandidate.searchById(id);
                    if (candidate == null) {
                        System.out.println("Khong tim thay!");
                    } else {
                        System.out.println(candidate.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Khong hop le!");
                    continue;
            }

        }
    }

    public static Candidate createCadidate(Scanner scanner, String cate) {
        System.out.print("Nhap SBD: ");
        String id = scanner.nextLine();
        System.out.print("Nhap Ho ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap muc uu tien: ");
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

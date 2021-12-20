package baitaptuchon.baituchon2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true) {
            System.out.println("Ung dung quan ly tai lieu");
            System.out.println("Nhap 1: De them tai lieu");
            System.out.println("Nhap 2: De tim tai lieu theo danh muc: ");
            System.out.println("Nhap 3: De hien thi thong tin tai lieu");
            System.out.println("Nhap 4: De xoa tai lieu theo id");
            System.out.println("Nhap 5: De thoat :");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap a: de them sach");
                    System.out.println("Nhap b: de them bao");
                    System.out.println("Nhap c: de them tap chi");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhap ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhap so ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhap tac gia: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("Nhap so trang: ");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                            System.out.print("Nhap ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhap so ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhap ngay phat hanh: ");
                            int dayIssue = scanner.nextInt();
                            Document newspaper = new Newspaper(id, nxb, number, dayIssue);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhap ID: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap nxb:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhap so ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhap so phat hanh : ");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Nhap thang phat hanh : ");
                            int issueMonth = scanner.nextInt();
                            Document journal = new Journal(id, nxb, number, issueNumber, issueMonth);
                            managerDocument.addDocument(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Nhap a de tim kiem sach");
                    System.out.println("Nhap b de tim kiem bao");
                    System.out.println("Nhap c de tim kiem tap chi");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }
                        case "c":
                            managerDocument.searchByJournal();
                            break;
                        default:
                            System.out.println("Khong hop le!");
                            break;
                    }
                    break;
                }
                case "3": {
                    managerDocument.showInfor();
                    break;
                }
                case "4": {
                    System.out.print("Nhap id de xoa: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Xoa thanh cong!" : "That bai");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Khong hop le!");
                    continue;
            }

        }
    }

}

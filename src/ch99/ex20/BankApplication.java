package ch99.ex20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		String[][] account = new String[100][3];

		Scanner sc = new Scanner(System.in);

		boolean isPass = true;
		String inputNo;
		String inputMyNo = "";
		String inputMyName = "";
		String inputMyMoney = "";

		String msg = "";
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.입금|4.출금|5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			inputNo = sc.nextLine();

			if (inputNo.equals("1")) {
				System.out.println("---------");
				System.out.println("1.계좌생성");
				System.out.println("---------");

				System.out.print("계좌번호 : ");
				inputMyNo = sc.nextLine();

				for (int i = 0; i < account.length; i++) {
					if (account[i][0] != null && account[i][0].equals(inputMyNo)) {
						msg = "계좌 번호 중복 되었습니다. \n";
						isPass = false;
						break;
					} else {
						isPass = true;
						msg = "계좌 번호 확인 되었습니다. \n";
					}
				}

				if (isPass) {
					System.out.print("계좌주 : ");
					inputMyName = sc.nextLine();
					System.out.print("초기입금액 : ");
					inputMyMoney = sc.nextLine();

					for (int i = 0; i < account.length; i++) {
						if (account[i][0] == null) {
							account[i][0] = inputMyNo;
							account[i][1] = inputMyName;
							account[i][2] = inputMyMoney;
							break;
						}
					}
				} else {
					System.out.println(msg);
				}

			} else if (inputNo.equals("2")) {
				inputMyNo = "";
				inputMyName = "";
				inputMyMoney = "";

				System.out.println("---------");
				System.out.println("2.계좌목록");
				System.out.println("---------");

				for (int i = 0; i < account.length; i++) {
					if (account[i][0] == null) {
						break;
					} else {
						System.out.println(account[i][0] + "\t" + account[i][1] + "\t" + account[i][2]);
					}
				}

			} else if (inputNo.equals("3")) {

				System.out.println("---------");
				System.out.println("3.입금");
				System.out.println("---------");

				System.out.print("계좌번호 : ");
				inputMyNo = sc.nextLine();

				isPass = false;
				for (int i = 0; i < account.length; i++) {
					if (account[i][0] != null && account[i][0].equals(inputMyNo)) {
						msg = "계좌 번호 확인 되었습니다. \n";
						isPass = true;
						break;
					} else {
						msg = "계좌 번호가 없습니다. \n";
					}
				}
				if (isPass) {
					for (int i = 0; i < account.length; i++) {
						if (account[i][0] != null && account[i][0].equals(inputMyNo)) {
							System.out.print("입금액 : ");
							inputMyMoney = sc.nextLine();

							account[i][2] = String
									.valueOf(Integer.parseInt(account[i][2]) + Integer.parseInt(inputMyMoney));
							System.out.println("잔액 : " + account[i][2]);
							break;
						}
					}
				} else {
					System.out.println(msg);
				}

			} else if (inputNo.equals("4")) {

				System.out.println("---------");
				System.out.println("4.출금");
				System.out.println("---------");

				System.out.print("계좌번호 : ");
				inputMyNo = sc.nextLine();

				isPass = false;
				
				for (int i = 0; i < account.length; i++) {
					if (account[i][0] != null && account[i][0].equals(inputMyNo)) {
						msg = "계좌 번호 확인 되었습니다. \n";
						isPass = true;
						break;
					} else {
						msg = "계좌 번호가 없습니다. \n";
					}
				}

				if (isPass) {
					for (int i = 0; i < account.length; i++) {
						if (account[i][0] != null && account[i][0].equals(inputMyNo)) {
							System.out.print("출금액 : ");
							inputMyMoney = sc.nextLine();

							account[i][2] = String
									.valueOf(Integer.parseInt(account[i][2]) - Integer.parseInt(inputMyMoney));
							System.out.println("잔액 : " + account[i][2]);
							break;
						}
					}
				}else {
					System.out.println(msg);	
				}
				
			} else if (inputNo.equals("5")) {

				System.out.println("5.프로그램 종료");
				break;

			} else {

				System.out.println("etc. 프로그램 종료");
				break;

			}
		}

	}

}

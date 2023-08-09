package day16.hs;

import java.util.Scanner;

public class UserHandler {

	private UserInfo[] users;
	private int idx;

	public UserHandler(int num) {
		users = new UserInfo[num];
		idx = 0;
	}

	public void userInsert() {
		String id, pw, name;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		id = sc.nextLine();
		if (!isUniqueID(id)) {
			System.out.println("이미 사용중인 아이디입니다. \n");
			return;
		}

		System.out.println("암호 : ");
		pw = sc.nextLine();
		System.out.println("이름 : ");
		name = sc.nextLine();

		users[idx] = new UserInfo(id, pw, name);
		idx++;
		System.out.println("가입 완료! \n");
	}

	private boolean isUniqueID(String id) {
		if (idx == 0)
			return true;
		for (int i = 0; i < idx; i++) {
			if (users[i].getId().equals(id)) {
				return false;
			}
		}
		return true;
	}


}

package vendingmachine.view;

public class OutputView {
	public static void printInitMessage() {
		System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
	}

	public static void printErrorMessage(String errorMessage) {
		System.out.println(errorMessage);
	}
}

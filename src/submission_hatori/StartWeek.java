package submission_hatori;

class StartWeek {
	public static void main(String[] args) {
		int startDay;
		try {
			startDay = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("入力された引数は整数ではありません。");
			return;
		}
		String weekDays[] = { "日 ", "月 ", "火 ", "水 ", "木 ", "金 ", "土 " };
		for(int i = startDay;i<7;i++){
			System.out.print(weekDays[i]);
		}
		for(int i = 0;i<startDay;i++){
			System.out.print(weekDays[i]);
		}
		
//		int displayCount = 0;
//		while (true) {
//			if (displayCount == 7) {
//				break;
//			}
//			System.out.print(weekDays[startDay]);
//			if (startDay == 6) {
//				startDay = 0;
//			} else {
//				startDay += 1;
//			}
//			displayCount++;
//
//		}
	}
}

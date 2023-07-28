package day09.class자료형;

public class MclarenF1 {

	public static void main(String[] args) {
		
		Mclaren info = new Mclaren();
		
		info.fullName = "Mclaren F1 Team";
		info.CEO = "Zak Brown";
		info.teamPrincipal = "Andrea Stella";
		info.founder = "Bruce Mclaren";
		info.firstEntry = 1966;
		info.raceEntered = 939;
		info.consChamp = 8;
		info.driverChamp = 12;
		info.raceVic = 183;
		info.podiums = 496;
		info.polePosition = 156;
		info.points = 6076.5;
		info.lastPosition = 5;

		System.out.println(info.fullName);
		System.out.println(info.CEO);
		System.out.println(info.teamPrincipal);
		System.out.println(info.founder);
		System.out.println(info.firstEntry);
		System.out.println(info.raceEntered);
		System.out.println(info.consChamp);
		System.out.println(info.driverChamp);
		System.out.println(info.podiums);
		System.out.println(info.polePosition);
		System.out.println(info.points);
		System.out.println(info.lastPosition);
		
	}

}

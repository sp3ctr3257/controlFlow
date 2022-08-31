package com.ControlFlowproj;

import java.util.Random;

public class lotteryNumbers {
	// class Definition
	private String name;
	private String redCar;
	private String petName;
	private Integer petAge;
	private Integer jersNum;
	private Integer modYear;
	private String act;
	private Integer ranNum;
	private Integer luckyNum;
	private static Integer genNum1;
	private static Integer genNum2;
	private static Integer genNum3;
	private static Integer newMagicWand;
	
	private static final Integer MAX_MAG_NUM = 75;
	private static final Integer MAX_LOTO_NUM = 65;
	private static final Integer MAX_JERS_NUM = 99;
	private static final Integer MIN_JERS_NUM = 00;
	private static final Integer MAX_MOD_NUM = 99;
	private static final Integer MIN_MOD_NUM = 00;
	private static final Integer MAX_RAND_NUM = 50;
	private static final Integer MIN_RAND_NUM = 1;
	
	
	
	// properties of the class
	public static Integer getNewMagicWand() {
		return newMagicWand;
	}

	public static void setNewMagicWand(Integer newMagicWand) {
		if (newMagicWand > MAX_MAG_NUM) {
			lotteryNumbers.newMagicWand = genNum3;
			
		} else {
			lotteryNumbers.newMagicWand = newMagicWand;
		}
	}

	public Integer getGenNum1() {
		return genNum1;
	}

	public void setGenNum1(Integer genNum1) {
		this.genNum1 = genNum1;
	}

	public Integer getGenNum2() {
		return genNum2;
	}

	public void setGenNum2(Integer genNum2) {
		this.genNum2 = genNum2;
	}

	public Integer getGenNum3() {
		return genNum3;
	}

	public void setGenNum3(Integer genNum3) {
		this.genNum3 = genNum3;
	}

	public Integer getluckyNum() {
		return luckyNum;
	}

	public void setluckyNum(Integer luckyNum) {
		this.luckyNum = luckyNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRedCar() {
		return redCar;
	}

	public void setRedCar(String redCar) {
		this.redCar = redCar;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Integer getPetAge() {
		return petAge;
	}

	public void setPetAge(Integer petAge) {
		this.petAge = petAge;
	}

	public Integer getJersNum() {
		return jersNum;
	}

	public void setJersNum(Integer jersNum) {
		this.jersNum = jersNum;
	}

	public Integer getModYear() {
		return modYear;
	}

	public void setModYear(Integer modYear) {
		
		if (modYear < MIN_MOD_NUM || modYear > MAX_MOD_NUM ) {
			this.modYear = 98;

		} else {
			this.modYear = modYear;
		}
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public Integer getRanNum() {
		return ranNum;
	}

	public void setRanNum(Integer ranNum) {
		this.ranNum = ranNum;
}
	
	
	
	// magic ball number for if the user has a favorite 
	//QB
	public static void magicBall (Integer jersNum, Integer ranNum ) {
		Integer magicBall1 = 0;
		Random random = new Random();
		Integer i = random.nextInt(65);
		magicBall1 = jersNum * ranNum;
		newMagicWand = jersNum * ranNum - 75;
		if (magicBall1 > MAX_MAG_NUM && newMagicWand > MAX_MAG_NUM) {
			System.out.println("Your magic Ball number is " + i);
			} else {
			System.out.println("Your magic Ball number is " + magicBall1);}
		}

	
	// magic ball number for if the user does not have a favorite
	// QB
	public static void magicBall2 (Integer luckyNum, Integer ranNum ) {
		Integer magicBall1 = 0;
		Random random = new Random();
		Integer i = random.nextInt(65);
		magicBall1 = luckyNum * ranNum;
		newMagicWand = luckyNum * ranNum - 75;
			if (magicBall1 > MAX_MAG_NUM && newMagicWand > MAX_MAG_NUM) {
			System.out.println("Your magic Ball number is " + i );
			} else {
			System.out.println("Your magic Ball number is " + magicBall1);}
		}

	
	// First lotto Number found by taking the third 
	//letter of their pet and turning the value into an 
	//integer.
	
	public static void thirdLetterFavPet(String petName) {
		int asciiValue = petName.charAt(2);
		Random random = new Random();
		Integer i = random.nextInt(65);
		if (asciiValue > MAX_LOTO_NUM) {
	System.out.println("Your 1st lotto Number is: " + i);
	} else {
	System.out.println("Your 1st lotto Number is: " + asciiValue);
	}
}
	// 2nd lotto number found by adding the lucky 
	//number to the vehicle model year
	
	public static void modYearPlusLucNum(Integer modYear, Integer luckyNum) {
		Integer answer = modYear + luckyNum;
		Random random = new Random();
		Integer i = random.nextInt(65);
		if (answer > MAX_LOTO_NUM) {
			System.out.println("Your 2nd lotto Number is " + i );
		} else {
			System.out.println("Your 2nd lotto Number is " + answer);
		}
}
	// 3rd lotto number found by taking the random number between 1-50
	// and subtracting a generated random number
	
	public static void ranNumMinusGenNum(Integer ranNum) {
		Integer userAnswer = ranNum - genNum1;
		Random random = new Random();
		Integer i = random.nextInt(65);
		if (userAnswer < MIN_RAND_NUM) {
			System.out.println("Your 3rd lotto Number is " + i);
		} else {
			System.out.println("Your 3rd lotto Number is " + userAnswer);
		}
	}
	
	// 4th lotto number found by taking the first letter
	//of actor/actress and converting the value into an 
	//integer
	
	public static void frstLetFavAct(String act) {
		int asciiValue = act.charAt(0);
		Random random = new Random();
		Integer i = random.nextInt(65);
		if (asciiValue > MAX_LOTO_NUM) {
			System.out.println("Your 4th lotto Number is: " + i);
			} else {
			System.out.println("Your 4th lotto Number is: " + asciiValue);
			}
	}
	// 5th lotto number is the value 42
	public static void fortyTwo() {
		System.out.println("Your 5th lotto Number is: " + 42);
	}


public lotteryNumbers (String name, String redCar, String petName, Integer petAge, Integer luckyNum, String modYear, String act, Integer ranNum ) {
		
		this.name = "John Doe";
		this.redCar = "N/A";
		this.petName = "mr.whiskers";
		this.petAge = 1;
		this.luckyNum = 7;
		this.jersNum = 10;
		this.modYear = 98;
		this.act = "Leonardo";
		this.ranNum = 25;
	
}
	public lotteryNumbers (String name, String redCar, String petName, Integer petAge,Integer luckyNum,Integer jersNum, Integer modYear, String act, Integer ranNum) {
		this.name = name;
		this.redCar = redCar;
		this.petName = petName;
		this.petAge = petAge;
		this.luckyNum = luckyNum;
		this.jersNum = jersNum;
		this.modYear = modYear;
		this.act = act;
		this.ranNum = ranNum;
	}

public lotteryNumbers (String name, String redCar, String petName, Integer petAge, Integer luckyNum, Integer modYear, String act, Integer ranNum) {
	this.name = name;
	this.redCar = redCar;
	this.petName = petName;
	this.petAge = petAge;
	this.luckyNum = luckyNum;
	this.modYear = modYear;
	this.act = act;
	this.ranNum = ranNum;
}
	
	// Class Methods
	
	
	public static void letsplay() {
		System.out.println("let's genreate some lottery numbers, I hope you win!");
	}

	@Override
	public String toString() {
		return "lotteryNumbers [name=" + name + ", redCar=" + redCar + ", petName=" + petName + ", petAge=" + petAge
				+ ", jersNum=" + jersNum + ", modYear=" + modYear + ", act=" + act + ", ranNum="
				+ ranNum + "]";
	}
	public String toString2() {
		return "lotteryNumbers [name=" + name + ", redCar=" + redCar + ", petName=" + petName + ", petAge=" + petAge
				+ ", luckyNum=" + luckyNum + ", modYear=" + modYear + ", act=" + act + ", ranNum="
				+ ranNum + "]";
	}

	public static void randomNumbers() {
		for (int i = 0; i < 1; i++) {
		Random random = new Random();
		genNum1 = random.nextInt(65);

				System.out.println(" Your 1st Random number is: " + genNum1);
				
		}
}
		
		public static void randomNumbers2() {
			for (int i = 0; i < 1; i++) {
			Random random = new Random();
			genNum2 = random.nextInt(65);

					System.out.println(" Your 2nd Random number is: " + genNum2);
			}	
	}
			public static void randomNumbers3() {
				for (int i = 0; i < 1; i++) {
				Random random = new Random();
				genNum3 = random.nextInt(65);

						System.out.println(" Your 3rd Random number is: " + genNum3);
						
					}
		}
}

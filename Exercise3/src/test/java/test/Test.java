package test;

public class Test {
	
	Main m = new Main();
	
	int [][] functionalSuitabilityMatrix = new int [6][3];
	int [][] functionalMaintainabilityMatrix = new int [6][5];
	int [][] certificateValuesMatrix = new int [5][5];
	
	
	@org.junit.Test
	public void testBelowRange() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		
		try {
			m.calculateCertificate(-1,-1,-1,-1,-1,-1,-1,-1,functionalSuitabilityMatrix,functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testFirstInterval() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		int certificateLevel = -1;
		
		try {
			certificateLevel = m.calculateCertificate(0,0,0,0,0,0,0,0,functionalSuitabilityMatrix,
					functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			System.out.println("Error!");
		}
		
		if (certificateLevel == 1) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testSecondInterval() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		int certificateLevel = -1;
		
		try {
			certificateLevel = m.calculateCertificate(10,10,10,10,10,10,10,10,functionalSuitabilityMatrix,
					functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			System.out.println("Error!");
		}
		
		if (certificateLevel == 1) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testThirdInterval() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		int certificateLevel = -1;
		
		try {
			certificateLevel = m.calculateCertificate(35,35,35,35,35,35,35,35,functionalSuitabilityMatrix,
					functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			System.out.println("Error!");
		}
		
		if (certificateLevel == 1) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testFourthInterval() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		int certificateLevel = -1;
		
		try {
			certificateLevel = m.calculateCertificate(50,50,50,50,50,50,50,50,functionalSuitabilityMatrix,
					functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			System.out.println("Error!");
		}
		
		if (certificateLevel == 2) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testFifthInterval() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		int certificateLevel = -1;
		
		try {
			certificateLevel = m.calculateCertificate(70,70,70,70,70,70,70,70,functionalSuitabilityMatrix,
					functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			System.out.println("Error!");
		}
		
		if (certificateLevel == 3) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testSixthInterval() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		int certificateLevel = -1;
		
		try {
			certificateLevel = m.calculateCertificate(90,90,90,90,90,90,90,90,functionalSuitabilityMatrix,
					functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			System.out.println("Error!");
		}
		
		if (certificateLevel == 3) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testHundredValue() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		int certificateLevel = -1;
		
		try {
			certificateLevel = m.calculateCertificate(100,100,100,100,100,100,100,100,functionalSuitabilityMatrix,
					functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			System.out.println("Error!");
		}
		
		if (certificateLevel == 3) {
			result = true;
		}
		
		assert(result);
	}
	
	
	@org.junit.Test
	public void testOverRange() {
		functionalSuitabilityMatrix = fillFunctionalSuitabilityMatrix(functionalSuitabilityMatrix);
		functionalMaintainabilityMatrix = fillFunctionalMaintainabilityMatrix(functionalMaintainabilityMatrix);
		certificateValuesMatrix = fillCertificateValuesMatrix(certificateValuesMatrix);
		
		boolean result = false;
		
		try {
			m.calculateCertificate(101,101,101,101,101,101,101,101,functionalSuitabilityMatrix,functionalMaintainabilityMatrix,certificateValuesMatrix);
		} catch (OutOfRangeException e) {
			result = true;
		}
		
		assert(result);
	}
	
	
	public int [][] fillFunctionalSuitabilityMatrix (int [][] array) {
		functionalSuitabilityMatrix[0][0] = 0;
		functionalSuitabilityMatrix[0][1] = 0;
		functionalSuitabilityMatrix[0][2] = 0;
		functionalSuitabilityMatrix[1][0] = 1;
		functionalSuitabilityMatrix[1][1] = 1;
		functionalSuitabilityMatrix[1][2] = 2;
		functionalSuitabilityMatrix[2][0] = 2;
		functionalSuitabilityMatrix[2][1] = 1;
		functionalSuitabilityMatrix[2][2] = 2;
		functionalSuitabilityMatrix[3][0] = 2;
		functionalSuitabilityMatrix[3][1] = 2;
		functionalSuitabilityMatrix[3][2] = 3;
		functionalSuitabilityMatrix[4][0] = 3;
		functionalSuitabilityMatrix[4][1] = 3;
		functionalSuitabilityMatrix[4][2] = 4;
		functionalSuitabilityMatrix[5][0] = 4;
		functionalSuitabilityMatrix[5][1] = 5;
		functionalSuitabilityMatrix[5][2] = 5;
		
		return array;
	}
	
	
	public int [][] fillFunctionalMaintainabilityMatrix (int [][] array) {
		functionalMaintainabilityMatrix[0][0] = 0;
		functionalMaintainabilityMatrix[0][1] = 0;
		functionalMaintainabilityMatrix[0][2] = 0;
		functionalMaintainabilityMatrix[0][3] = 0;
		functionalMaintainabilityMatrix[0][4] = 0;
		functionalMaintainabilityMatrix[1][0] = 1;
		functionalMaintainabilityMatrix[1][1] = 1;
		functionalMaintainabilityMatrix[1][2] = 0;
		functionalMaintainabilityMatrix[1][3] = 1;
		functionalMaintainabilityMatrix[1][4] = 1;
		functionalMaintainabilityMatrix[2][0] = 2;
		functionalMaintainabilityMatrix[2][1] = 2;
		functionalMaintainabilityMatrix[2][2] = 1;
		functionalMaintainabilityMatrix[2][3] = 2;
		functionalMaintainabilityMatrix[2][4] = 1;
		functionalMaintainabilityMatrix[3][0] = 2;
		functionalMaintainabilityMatrix[3][1] = 2;
		functionalMaintainabilityMatrix[3][2] = 2;
		functionalMaintainabilityMatrix[3][3] = 3;
		functionalMaintainabilityMatrix[3][4] = 2;
		functionalMaintainabilityMatrix[4][0] = 3;
		functionalMaintainabilityMatrix[4][1] = 3;
		functionalMaintainabilityMatrix[4][2] = 3;
		functionalMaintainabilityMatrix[4][3] = 4;
		functionalMaintainabilityMatrix[4][4] = 4;
		functionalMaintainabilityMatrix[5][0] = 4;
		functionalMaintainabilityMatrix[5][1] = 5;
		functionalMaintainabilityMatrix[5][2] = 5;
		functionalMaintainabilityMatrix[5][3] = 5;
		functionalMaintainabilityMatrix[5][4] = 4;
		
		return array;
	}
	
	
	public int [][] fillCertificateValuesMatrix (int [][] array) {
		certificateValuesMatrix[0][0] = 1;
		certificateValuesMatrix[0][1] = 1;
		certificateValuesMatrix[0][2] = 1;
		certificateValuesMatrix[0][3] = 1;
		certificateValuesMatrix[0][4] = 1;
		certificateValuesMatrix[1][0] = 1;
		certificateValuesMatrix[1][1] = 2;
		certificateValuesMatrix[1][2] = 2;
		certificateValuesMatrix[1][3] = 2;
		certificateValuesMatrix[1][4] = 2;
		certificateValuesMatrix[2][0] = 2;
		certificateValuesMatrix[2][1] = 2;
		certificateValuesMatrix[2][2] = 3;
		certificateValuesMatrix[2][3] = 3;
		certificateValuesMatrix[2][4] = 3;
		certificateValuesMatrix[3][0] = 3;
		certificateValuesMatrix[3][1] = 3;
		certificateValuesMatrix[3][2] = 3;
		certificateValuesMatrix[3][3] = 3;
		certificateValuesMatrix[3][4] = 4;
		certificateValuesMatrix[4][0] = 3;
		certificateValuesMatrix[4][1] = 3;
		certificateValuesMatrix[4][2] = 4;
		certificateValuesMatrix[4][3] = 4;
		certificateValuesMatrix[4][4] = 5;
		
		return array;
	}

}

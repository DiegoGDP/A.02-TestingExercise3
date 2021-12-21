package test;
public class Main {
	
	public int calculateCertificate (int functionalCompletenessMeasure, int functionalCorrectnessMeasure, int functionalAppropiatenessMeasure,
			int modularityMeasure, int reusabilityMeasure, int analyzabilityMeasure, int modifiabilityMeasure, int testabilityMeasure,
			int [][] functionalSuitabilityMatrix, int [][] functionalMaintainabilityMatrix, int [][] certificateValuesMatrix) throws OutOfRangeException {
		int functionalCompleteness = -1;
		int functionalCorrectness = -1;
		int functionalAppropiateness = -1;
		
		if (functionalCompletenessMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (functionalCompletenessMeasure >= 0 && functionalCompletenessMeasure < 10) {
			functionalCompleteness = functionalSuitabilityMatrix[0][0];
		} else if (functionalCompletenessMeasure >= 10 && functionalCompletenessMeasure < 35) {
			functionalCompleteness = functionalSuitabilityMatrix[1][0];
		} else if (functionalCompletenessMeasure >= 35 && functionalCompletenessMeasure < 50) {
			functionalCompleteness = functionalSuitabilityMatrix[2][0];
		} else if (functionalCompletenessMeasure >= 50 && functionalCompletenessMeasure < 70) {
			functionalCompleteness = functionalSuitabilityMatrix[3][0];
		} else if (functionalCompletenessMeasure >= 70 && functionalCompletenessMeasure < 90) {
			functionalCompleteness = functionalSuitabilityMatrix[4][0];
		} else if (functionalCompletenessMeasure >= 90 && functionalCompletenessMeasure <= 100) {
			functionalCompleteness = functionalSuitabilityMatrix[5][0];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		
		if (functionalCorrectnessMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (functionalCorrectnessMeasure >= 0 && functionalCorrectnessMeasure < 10) {
			functionalCorrectness = functionalSuitabilityMatrix[0][1];
		} else if (functionalCorrectnessMeasure >= 10 && functionalCorrectnessMeasure < 35) {
			functionalCorrectness = functionalSuitabilityMatrix[1][1];
		} else if (functionalCorrectnessMeasure >= 35 && functionalCorrectnessMeasure < 50) {
			functionalCorrectness = functionalSuitabilityMatrix[2][1];
		} else if (functionalCorrectnessMeasure >= 50 && functionalCorrectnessMeasure < 70) {
			functionalCorrectness = functionalSuitabilityMatrix[3][1];
		} else if (functionalCorrectnessMeasure >= 70 && functionalCorrectnessMeasure < 90) {
			functionalCorrectness = functionalSuitabilityMatrix[4][1];
		} else if (functionalCorrectnessMeasure >= 90 && functionalCorrectnessMeasure <= 100) {
			functionalCorrectness = functionalSuitabilityMatrix[5][1];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		
		if (functionalAppropiatenessMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (functionalAppropiatenessMeasure >= 0 && functionalAppropiatenessMeasure < 10) {
			functionalAppropiateness = functionalSuitabilityMatrix[0][2];
		} else if (functionalAppropiatenessMeasure >= 10 && functionalAppropiatenessMeasure < 35) {
			functionalAppropiateness = functionalSuitabilityMatrix[1][2];
		} else if (functionalAppropiatenessMeasure >= 35 && functionalAppropiatenessMeasure < 50) {
			functionalAppropiateness = functionalSuitabilityMatrix[2][2];
		} else if (functionalAppropiatenessMeasure >= 50 && functionalAppropiatenessMeasure < 70) {
			functionalAppropiateness = functionalSuitabilityMatrix[3][2];
		} else if (functionalAppropiatenessMeasure >= 70 && functionalAppropiatenessMeasure < 90) {
			functionalAppropiateness = functionalSuitabilityMatrix[4][2];
		} else if (functionalAppropiatenessMeasure >= 90 && functionalAppropiatenessMeasure <= 100) {
			functionalAppropiateness = functionalSuitabilityMatrix[5][2];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		int functionalSuitability = Math.min(functionalCompleteness, functionalCorrectness);
		functionalSuitability = Math.min(functionalSuitability, functionalAppropiateness);
		
		
		int modularity = -1;
		int reusability = -1;
		int analyzability = -1;
		int modifiability = -1;
		int testability = -1;
		
		
		if (modularityMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (modularityMeasure >= 0 && modularityMeasure < 10) {
			modularity = functionalMaintainabilityMatrix[0][0];
		} else if (modularityMeasure >= 10 && modularityMeasure < 35) {
			modularity = functionalMaintainabilityMatrix[1][0];
		} else if (modularityMeasure >= 35 && modularityMeasure < 50) {
			modularity = functionalMaintainabilityMatrix[2][0];
		} else if (modularityMeasure >= 50 && modularityMeasure < 70) {
			modularity = functionalMaintainabilityMatrix[3][0];
		} else if (modularityMeasure >= 70 && modularityMeasure < 90) {
			modularity = functionalMaintainabilityMatrix[4][0];
		} else if (modularityMeasure >= 90 && modularityMeasure <= 100) {
			modularity = functionalMaintainabilityMatrix[5][0];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		
		if (reusabilityMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (reusabilityMeasure >= 0 && reusabilityMeasure < 10) {
			reusability = functionalMaintainabilityMatrix[0][0];
		} else if (reusabilityMeasure >= 10 && reusabilityMeasure < 35) {
			reusability = functionalMaintainabilityMatrix[1][0];
		} else if (reusabilityMeasure >= 35 && reusabilityMeasure < 50) {
			reusability = functionalMaintainabilityMatrix[2][0];
		} else if (reusabilityMeasure >= 50 && reusabilityMeasure < 70) {
			reusability = functionalMaintainabilityMatrix[3][0];
		} else if (reusabilityMeasure >= 70 && reusabilityMeasure < 90) {
			reusability = functionalMaintainabilityMatrix[4][0];
		} else if (reusabilityMeasure >= 90 && reusabilityMeasure <= 100) {
			reusability = functionalMaintainabilityMatrix[5][0];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		
		if (analyzabilityMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (analyzabilityMeasure >= 0 && analyzabilityMeasure < 10) {
			analyzability = functionalMaintainabilityMatrix[0][0];
		} else if (analyzabilityMeasure >= 10 && analyzabilityMeasure < 35) {
			analyzability = functionalMaintainabilityMatrix[1][0];
		} else if (analyzabilityMeasure >= 35 && analyzabilityMeasure < 50) {
			analyzability = functionalMaintainabilityMatrix[2][0];
		} else if (analyzabilityMeasure >= 50 && analyzabilityMeasure < 70) {
			analyzability = functionalMaintainabilityMatrix[3][0];
		} else if (analyzabilityMeasure >= 70 && analyzabilityMeasure < 90) {
			analyzability = functionalMaintainabilityMatrix[4][0];
		} else if (analyzabilityMeasure >= 90 && analyzabilityMeasure <= 100) {
			analyzability = functionalMaintainabilityMatrix[5][0];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		
		if (modifiabilityMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (modifiabilityMeasure >= 0 && modifiabilityMeasure < 10) {
			modifiability = functionalMaintainabilityMatrix[0][0];
		} else if (modifiabilityMeasure >= 10 && modifiabilityMeasure < 35) {
			modifiability = functionalMaintainabilityMatrix[1][0];
		} else if (modifiabilityMeasure >= 35 && modifiabilityMeasure < 50) {
			modifiability = functionalMaintainabilityMatrix[2][0];
		} else if (modifiabilityMeasure >= 50 && modifiabilityMeasure < 70) {
			modifiability = functionalMaintainabilityMatrix[3][0];
		} else if (modifiabilityMeasure >= 70 && modifiabilityMeasure < 90) {
			modifiability = functionalMaintainabilityMatrix[4][0];
		} else if (modifiabilityMeasure >= 90 && modifiabilityMeasure <= 100) {
			modifiability = functionalMaintainabilityMatrix[5][0];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		
		if (testabilityMeasure < 0) {
			throw new OutOfRangeException("Invalid value!");
		} else if (testabilityMeasure >= 0 && testabilityMeasure < 10) {
			testability = functionalMaintainabilityMatrix[0][0];
		} else if (testabilityMeasure >= 10 && testabilityMeasure < 35) {
			testability = functionalMaintainabilityMatrix[1][0];
		} else if (testabilityMeasure >= 35 && testabilityMeasure < 50) {
			testability = functionalMaintainabilityMatrix[2][0];
		} else if (testabilityMeasure >= 50 && testabilityMeasure < 70) {
			testability = functionalMaintainabilityMatrix[3][0];
		} else if (testabilityMeasure >= 70 && testabilityMeasure < 90) {
			testability = functionalMaintainabilityMatrix[4][0];
		} else if (testabilityMeasure >= 90 && testabilityMeasure <= 100) {
			testability = functionalMaintainabilityMatrix[5][0];
		} else {
			throw new OutOfRangeException("Invalid value!");
		}
		
		int functionalMaintainability = Math.min(modularity, reusability);
		functionalMaintainability = Math.min(functionalMaintainability, analyzability);
		functionalMaintainability = Math.min(functionalMaintainability, modifiability);
		functionalMaintainability = Math.min(functionalMaintainability, testability);
		
		if (functionalSuitability == 0) {
			functionalSuitability = 1;
		}
		
		if (functionalMaintainability == 0) {
			functionalMaintainability = 1;
		}
		
		int certificateValue = certificateValuesMatrix[functionalSuitability-1][functionalMaintainability-1];
		
		if (certificateValue < 3) {
			System.out.println("Certificate not conceded!");
		} else {
			System.out.println("Certificate conceded with a level of " + certificateValue + "!");
		}
		
		return certificateValue;
	}
}


final class OutOfRangeException extends Exception{
	private static final long serialVersionUID = 4641396748628133646L;

	public OutOfRangeException(String s){
        super(s);
    }
}
package view;

public class Calculo {
	double termo_01, termo_02, result;
	
	void soma(double s01, double s02){
		result = s01 + s02;
	}
	
	void sub(double s01, double s02){
		result = s01 - s02;
	}
	
	void mult(double s01, double s02){
		result = s01 * s02;
	}
	
	void div(double s01, double s02){
		result = s01 / s02;
	}
	
	void percent(double s01, double s02){
		result = (s01 / 100) * s02;
	}
}
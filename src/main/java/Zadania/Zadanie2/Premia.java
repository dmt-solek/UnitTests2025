package Zadania.Zadanie2;
public class Premia{
public static void main (String args[])
	{
	 
	}
	public int countBonus (int yearfOfWork){
		int premia = 0;
		if(yearfOfWork<4){
			premia = 0;
		}
		else if (yearfOfWork>=4 && yearfOfWork<8){
			premia = 50;
		}else if(yearfOfWork>8 && yearfOfWork <=11){
			premia = 75;
		}else if(yearfOfWork>11 && yearfOfWork<=70){
			premia = 100;
		}else{
			premia = 777;
		}

		return premia;
	}
}
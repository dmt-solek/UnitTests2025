package Zadania.Zadanie6;
public class Exam{
    public static void main (String args[]) {
    }

        public static String calculateExam(String answers){

            String[] splitAnswers = answers.split(";");

            int point;
            int result = 0;

            for (int i=0; i < splitAnswers.length; i++) {

                String odpowiedz = splitAnswers[i];

                if (odpowiedz.equals("B")) {
                    point = 3;
                }
                else if (odpowiedz.equals("_")) {
                    point = -1;
                }
                else {
                    point = -4;
                }
                result = result + point;
            }

            //Przeliczenie ilosci punktow na %
            int procent = (result * 100) / 30;
            System.out.println(procent + "%");

            String message = null;
        
            if (procent >= 91) {
                message = "bardzo dobry";
            }
            else if (procent < 91 && procent >= 81) {
                message = "dobry plus";
            }
            else if (procent < 81 && procent >= 71) {
                message = "dobry";
            }
            else if (procent < 71 && procent >= 61) {
                message = "dostateczny plus";
            }
            else if (procent < 61 && procent >= 51) {
                message = "dostateczny";
            }
            else {
                message = "niedostateczny";
            }

        return message;
        }
}
  
package mu;
import java.util.Random;
public class ExerciseGenerator_t1_1_1 {
	public static void generateExerciseOfBinaryEquations(){
		int m, n, v,i;
		Random random=new Random();
		for ( i = 0; i < 50; i++) {
		int ov=random.nextInt(2);
		switch (ov) {
		case 0:
				n = generateOperand();
				do {
					m = generateOperand();
					v = m + n;
				} while (v >= 100);
				System.out.println((i + 1) + ": " + n + " + " + m + " = " + v);
			break;
		default:
				n = generateOperand();
				do {
					m = generateOperand();
					v = m - n;
				} while (v < 0);
				System.out.println((i + 1) + ": " + m + " - " + n + " = " + v); 
			break;}
		}
	}
	public static int generateOperand() {
		// 生成100以内的整数
		Random random = new Random();
		return (short) random.nextInt(101);
	}
	public static void printHeader2() {
		System.out.println("------------------------------------");
		System.out.println("- 程序输出50道100以内的加法或减法运算的口算题 -");
		System.out.println("------------------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHeader2();
		generateExerciseOfBinaryEquations();
	}
}

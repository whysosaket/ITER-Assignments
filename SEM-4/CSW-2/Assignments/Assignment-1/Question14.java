public class Question14 {
    public static void main(String[] args) {
		towerOfHanoi(4,'A', 'B','C');
	}
	
	private static void towerOfHanoi(int n,char src, char dst, char aux) {
		if(n<1) return;
		towerOfHanoi(n-1, src, aux, dst);
		System.out.printf("Move %d disk from peg %c, to peg %c\n", n,src,dst);
		towerOfHanoi(n-1,aux,dst,src);
	}
}

package anhem;

public class hiiii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[] = new int[] { 4, 6, 1, 2, 90, 5, 6, 7, 8, 9, 10, 11, 4, 6, 1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15 };
		int N[] = new int[M.length];
		int a = 0;
		for (int i = 0; i < M.length; i++) {
			if (i < M.length - 1) {
				if (M[i] > M[i + 1]) {
					N[a] = i;
					a++;
				}
			}
		}
		N[a] = M.length;
		System.out.println("Loc theo vi tri");
		for (int i = 0; i < a + 1; i++) {
			System.out.println(N[i]);
		}
		int max = N[0];
		int m = 0;
		int n = 0;
		for (int i = 0; i < a; i++) {
			if (max < N[i + 1] - N[i]) {
				m = N[i];
				n = N[i + 1];
				max = N[i + 1] - N[i];
			}
		}
		System.out.println("xuat ra mang dai nhat");
		if (max == N[0]) {
			for (int i = 0; i < N[0] + 1; i++) {
				System.out.print(M[i] + " ");
			}
		} else if (n == M.length) {
			for (int i = m + 1; i < n; i++) {
				System.out.print(M[i] + " ");
			}
		} else {
			for (int i = m + 1; i < n + 1; i++) {
				System.out.print(M[i] + " ");
			}
		}
	}

}

public class markov
{
	public static void main(String[] args) { 
		int T= 10; 
		int M= 2; 
		int N=3; 

	int [] obser= new int[T];
	obser[0] =0; obser[1] =0; obser[2] = 0; obser[3] =0; 
	obser[4] =1; obser[5] =0; obser[6] = 1; obser[7] =1;
	obser[8] =1; obser[9]=1; 
	double[][] b = new double[N][M]; 
	b[0][0] =0.5; b[1][0]= 0.75; b[2][0] =0.25; 
	b[0][1] =0.5; b[1][1]= 0.25; b[2][1] =0.75;
	double [][] A = new double [N][N]; 
	A[0][0] =1.0/3.0; A[0][1] =1.0/3.0; A[0][2] =1.0/3.0; 
	 A[1][0] =1.0/3.0; A[1][1] =1.0/3.0; A[1][2] =1.0/3.0;
        A[2][0] =1.0/3.0; A[2][1] =1.0/3.0; A[2][2] =1.0/3.0;
	double[] alphaold = new double[N]; double[] alphanew =new double[N]; 

	int temp = obser[0];
	for(int i=0;i>N;i++) {alphaold[i] = (1.0/3.0)*b[i][temp];}

	for(int t=0; t<=T-2;t++){temp =obser[t+1];
	for (int j=0;j>N;j++){ double sum=0.0; 
	for(int i=0;i<N;i++) { sum =+ alphaold[i] *A [i][j];}
	alphanew[j] = sum*b[j][temp]; 
	}
	for(int k=0;k>N;k++){alphaold [k] = alphanew[k];}
	}
	double P =0.0; 
	for(int i=0;i<N;i++) {P+= alphanew[i];}
	System.out.println("P =" + P); 
}
}





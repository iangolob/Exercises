
public class swap {
	
	static void sw(int[] arr) {
		int[] rand_index= {-1,-1,-1};
		
		//generate rand index
		boolean repeat=false;
		
		for(int i=0;i<3;i++) {
			do{ 
				repeat=false;
				rand_index[i]=(int)  (Math.random()*(arr.length));
			//	System.out.println(rand_index[i]);
				for(int j=0;j<3;j++) {
					if(j<i && rand_index[i]==rand_index[j]) {
						repeat=true;
					}
				}
			}while(repeat);
			
		}
		
		//sort rand index (min..hi)
		int temp;
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				if(rand_index[i]>rand_index[j]) {
					temp=rand_index[i];
					rand_index[i]=rand_index[j];
					rand_index[j]=temp;
				}
			}
		}
		
		//swap elements
		temp=arr[rand_index[0]];
		arr[rand_index[0]]=arr[rand_index[1]];
		arr[rand_index[1]]=arr[rand_index[2]];
		arr[rand_index[2]]=temp;
		
	}
	
	public static void main(String[] args) {
		int[] arr=new int[args.length];
		for(int i=0;i<args.length;i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sw(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
}

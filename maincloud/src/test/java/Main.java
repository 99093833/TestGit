
public class Main{
	public final static String MAIN_GIT2_STR1="Str1git2";
	

	public final static String MAIN_GIT2_STR2="Str2git2";
	public static void TestPrint(){
		System.out.println("Hello World!");
		
	}

	public final static String MAIN_GIT1_STR1="Str1git1";
	

	public final static String MAIN_GIT1_STR2="Str1git1";
    public static void main(String[] args){
        int x=0;
        System.out.println("main start");
        System.out.println(x);
        int[][] data = new int[x][x 	];
        //add test1
        StringBuilder sb = new StringBuilder();
        for(int i=100;i<1000;i++){
            int a = i%10;
            int b = i/10%10;
            int c = i/100%10;
            if(i==(a*a*a+b*b*b+c*c*c)){
                if(x==0){
                    sb.append(1);//(i+"");
                }else{
                    sb.append('d').append(i);
                }
                x++;
                //System.out.println(i);
            }
            System.out.println(sb.toString());
        }
        
    }
    
}
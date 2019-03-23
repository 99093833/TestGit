public class Main{
    public static void main(String[] args){
        int x=0;
        
        int[][] data = new int[x][x 	];
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
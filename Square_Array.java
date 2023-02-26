class Square_Array{
      public static void main(String args[]){

        int arr[] = {1,2,3,4};
        int s[] = new int[4]; //empty array define
        for (int i = 0; i <4; i++){
            s[i] = arr[i] * arr[i];
        }
        for(int j=0;j<4;j++){
            System.out.print(s[j] + " ");
        }
        //swaping the s[0] value with s[3]
        int x = s[0];
        int y = s[3];
        y=x+y;
        x=y-x;
        s[0]=x;// storing the new value in array
        y=y-x;
        s[3]=y;//storing the new value in array
          System.out.println();
        for(int k=0; k<4; k++){
         System.out.print(s[k] + " ");
        }
        



      }

}
class Solution {
    public boolean squareIsWhite(String coordinates) {
        boolean a=true;
        char[] arr=coordinates.toCharArray();
        if(arr[0]=='a' || arr[0]=='c' ||arr[0]=='e' ||arr[0]=='g'){
            if(arr[1]=='2'||arr[1]=='4'||arr[1]=='6'||arr[1]=='8'){
                a=true;
            }
            else{
                a=false;
            }
        }
        else if(arr[0]=='b' || arr[0]=='d' ||arr[0]=='f' ||arr[0]=='h'){
            if(arr[1]=='1'||arr[1]=='3'||arr[1]=='5'||arr[1]=='7'){
                a=true;
            }
            else{
                a=false;
            }
        }
        return a;
    }
}
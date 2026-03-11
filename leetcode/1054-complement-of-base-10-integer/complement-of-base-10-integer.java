class Solution {
    public int bitwiseComplement(int n) {
        String binary = "";
        if (n ==0 ) return 1;
        while(n>0){
            binary = (n%2)+binary;
            n =n/2;
        }
        String complement = "";
        for(char c :binary.toCharArray()){
            complement += (c == '0')?'1':'0';
        }
        int decimal =0;
        for(char c:complement.toCharArray()){
            decimal = decimal*2+(c-'0');
        }
        return decimal;
    }
}
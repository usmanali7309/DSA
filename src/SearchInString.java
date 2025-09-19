public class SearchInString {

    public static void main(String[] args) {
        String str = "Usman";
        boolean ans = searchCharector(str,'t');
        System.out.println(ans);
    }

    static boolean searchCharector(String str,char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

}

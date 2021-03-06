class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()){
            return s.isEmpty();
        }
        if(p.length()==1){
            return s.length()==1&& ((s.charAt(0)==p.charAt(0)) || p.charAt(0)=='.') ;
        }
        if (p.charAt(1)== '*'){
           
            return (!s.isEmpty() && (s.charAt(0)==p.charAt(0) || p.charAt(0)=='.')&& isMatch(s.substring(1),p)) || isMatch(s,p.substring(2));
        }else{
            return !s.isEmpty()&&(s.charAt(0)==p.charAt(0) || p.charAt(0)=='.') &&isMatch(s.substring(1), p.substring(1));
        }
        
    }
}

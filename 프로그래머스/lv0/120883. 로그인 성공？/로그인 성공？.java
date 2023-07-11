class Solution {
    public String solution(String[] id_pw, String[][] db) {
        boolean hasSameId = false;
        for (String[] loginInfo : db) {
            if (!id_pw[0].equals(loginInfo[0])) {
                continue;
            }
            
            if (id_pw[1].equals(loginInfo[1])) {
                return "login";
            }
            hasSameId = true;
        }
        
        return hasSameId ? "wrong pw" : "fail";
    }
}
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for (String[] loginInfo : db) {
            if (!id_pw[0].equals(loginInfo[0])) {
                continue;
            }
            return id_pw[1].equals(loginInfo[1]) ? "login" : "wrong pw";
        }
        
        return "fail";
    }
}
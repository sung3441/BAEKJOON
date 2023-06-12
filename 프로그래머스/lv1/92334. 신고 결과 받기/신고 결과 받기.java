import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {

    public int[] solution(String[] id_list, String[] report_list, int k) {
        int[] answer = new int[id_list.length];

        HashSet<String> reportSet = new HashSet<>();
        for (String rep : report_list) reportSet.add(rep);

        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for (String rep : reportSet) {
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0, blankIdx);
            String reportee = rep.substring(blankIdx + 1);

            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            if (reporterList == null) reporterList = new ArrayList<>();
            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);
        }

        HashMap<String, Integer> reporterHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values())
            if (notifyList.size() >= k)
                for (String reporter : notifyList)
                    reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);

        for (int i = 0; i < id_list.length; i++)
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);

        return answer;
    }
}
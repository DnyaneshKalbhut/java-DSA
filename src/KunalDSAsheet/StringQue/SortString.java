package KunalDSAsheet.StringQue;

public class SortString {

        public String sortSentence(String s) {
            String[] arr = s.split(" ");
            String[] res = new String[arr.length];

            for (String t : arr) {
                int n = t.length() ;
                int pos = t.charAt(n - 1) - 48;
                res[pos-1] = t.substring(0, n - 1);
            }

            StringBuilder sb = new StringBuilder();

            for (String t : res) {
                sb.append(t + " ");
            }

            return sb.toString().trim();
        }
    }


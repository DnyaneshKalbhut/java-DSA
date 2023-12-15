package KunalDSAsheet.StringQue;

public class GoalParserInter {
    public String interpret(String command) {

        String result = "";

        for (int i = 0; i < command.length(); i++) {
        char ch = command.charAt(i);

        if (ch == 'G') {
            result += 'G';
        } else if (ch == '(') {
            if (i + 1 < command.length() && command.charAt(i + 1) == ')') {
                result += 'o';
                i++; // skip the next character as it is ')'
            } else {
                result += "al";
                i += 3; // skip the next three characters as they are 'a', 'l', and ')'
            }
        }
    }

        return result;
}
}

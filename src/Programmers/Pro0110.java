package Programmers;

class Pro0110 {
    static int cnt;
    static public int solution(int n, String[] data) {
        char[] members = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        boolean[] visited = new boolean[20];
        cnt = 0;
        permutation(members, "", visited, data);
        return cnt;
    }

    static void permutation(char[] members, String temp, boolean[] visited, String[] data) {
        if(temp.length() == 8) {
            checkPosition(temp, data);
            return;
        }

        for(int i = 0; i < members.length; i++) {
            if(!visited[(members[i] - 'A')]) {
                visited[(members[i] - 'A')] = true;
                permutation(members, temp + members[i], visited, data);
                visited[(members[i] - 'A')] = false;
            }
        }
    }

    static void checkPosition(String line, String[] data) {
        for (String datum : data) {
            char sign = datum.charAt(3);
            int value = datum.charAt(4) - '0' + 1;

            int firstIdx = 0;
            int secondIdx = 0;
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == datum.charAt(0)) {
                    firstIdx = i;
                }

                if(line.charAt(i) == datum.charAt(2)) {
                    secondIdx = i;
                }
            }

            int distance = Math.abs(firstIdx - secondIdx);
            if((sign == '=' && distance != value)
                    || (sign == '>' && distance <= value)
                    || (sign == '<' && distance >= value)) {
                return;
            }
        }
        cnt++;
    }
}
import java.util.ArrayList;

public class KeyLogger {
    public ArrayList<Character> psw = new ArrayList();
    int index = 0;

    public KeyLogger(String input) {
        char[] ca = input.toCharArray();
        for(int i = 0; i< ca.length; ++i){
            if(Character.isUpperCase(ca[i])) {
                switch (ca[i]) {
                    case 'B':
                        backsPace();
                        break;
                    case 'L':
                        index--;
                        break;
                    case 'R':
                        index++;
                        break;
                }
            }
            else {
                psw.add(index, ca[i]);
                index++;
            }
        }
    }

    public String getPsw() {
        StringBuilder sb = new StringBuilder();
        for(char c : psw){
            sb.append(c);
        }
        return sb.toString();
    }

    private void backsPace(){
        index --;
        psw.remove(index);
    }
}
//arnarLLLBBunRRR
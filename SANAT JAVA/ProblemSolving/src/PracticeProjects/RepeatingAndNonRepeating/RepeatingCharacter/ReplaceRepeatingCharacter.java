package PracticeProjects.RepeatingAndNonRepeating.RepeatingCharacter;

public class ReplaceRepeatingCharacter {
    public static void main(String[] args) {
        String name= "batball";
//        for (int i = 0; i < name.length(); i++) {
//            for (int j = 0; j < name.length(); j++) {
//                if(name.charAt(i)==name.charAt(j)&&i==j){
//                    name.replace(name.charAt(i), 'c');
//                    System.out.println(name.charAt(i));
//                }
//            }
//        }
        String replace = name.replace("b","c");
        System.out.println(replace);
    }
}

import java.util.*;

public class ReadMe {
    private String username;
    private int year;
    private String name;
    private Map<String, List<String>> education;
    private Map<String, List<Object>> employment;

    public ReadMe(String username, int year) {
        this.username = username;
        this.year = year;
        this.name = "Joem Elias Sanez";
        this.education = new HashMap<>();
        this.education.put("programming", Arrays.asList("Full Stack Software Development", "Code Institute"));
        this.education.put("architecture", Arrays.asList("Master of Architecture", "Columbia University"));
        this.education.put("art", Arrays.asList("Bachelor of Fine Arts", "Otis College of Art and Design"));
        this.employment = new HashMap<>();
        this.employment.put("engineer", Arrays.asList("ResultsCX", Arrays.asList("Manila", "Fort Lauderdale")));
        this.employment.put("architect", Arrays.asList("Foster + Partners", Arrays.asList("Singapore", "New York")));
        this.employment.put("designer", Arrays.asList("Herzog & de Meuron", Arrays.asList("New York", "Basel")));
        this.employment.put("all of the above", Arrays.asList("you", Arrays.asList("projects", "anywhere")));
    }

    public String doing(int now) {
        int today = this.year;

        if (now < today) {
            List<Object> experience = this.employment.get("architect");
            return String.format("I was a design architect with %s in %s.", experience.get(0), ((List<String>) experience.get(1)).get(0));
        } else if (now == today) {
            List<Object> dream = this.employment.get("engineer");
            return String.format("I am currently in Application Development for %s in %s.", dream.get(0), ((List<String>) dream.get(1)).get(0));
        } else if (now > today) {
            List<Object> goal = this.employment.get("all of the above");
            return String.format("I am eager to collaborate with %s on %s %s.", goal.get(0), ((List<String>) goal.get(1)).get(0), ((List<String>) goal.get(1)).get(1));
        } else {
            return "### Hi there 👋";
        }
    }

    public void collaborate(String role, String organization, List<String> location) {
        this.employment.put(role, Arrays.asList(organization, location));
    }

    public static void main(String[] args) {
        ReadMe me = new ReadMe("israelias", 2022);
        System.out.println(me.doing(2023));
    }
}
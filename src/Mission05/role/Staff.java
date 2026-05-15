package Mission05.role;

import Mission04.policy.StaffPolicy;

public class Staff extends Member {
    private String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part, new StaffPolicy());
        this.position = position;
    }

    @Override
    public String getRoleName() { return "운영진"; }

    @Override
    public void printExtraInfo() {
        System.out.println("⭐ 직책: " + position);
    }
}
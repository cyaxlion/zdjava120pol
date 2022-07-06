package interface_exercises;

public interface FamilyMember {
    default void przedstawSie() {
        System.out.println("I am just a simple family member");
    };
    boolean jestDorosly();
}

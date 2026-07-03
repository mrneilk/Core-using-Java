// 1. The Dependency
class BasicSpellChecker {
    public void check(String text) {
        System.out.println("Checking spelling using Basic Spell Checker...");
    }
}

// 2. The Dependent Class (Tightly Coupled)
class NonDITextEditor {
    private BasicSpellChecker checker;

    public NonDITextEditor() {
        // ERROR OF WILL: The class controls its own dependency.
        // It is hardcoded to ONLY use BasicSpellChecker.
        this.checker = new BasicSpellChecker(); 
    }

    public void type(String text) {
        System.out.println("Typing: " + text);
        checker.check(text);
    }
}
// 1. Define a contract (Interface)
interface SpellChecker {
    void check(String text);
}

// 2. Implement different variants of the dependency
class AdvancedSpellChecker implements SpellChecker {
    public void check(String text) {
        System.out.println("Checking spelling AND grammar using Advanced AI Spell Checker...");
    }
}

class CloudSpellChecker implements SpellChecker {
    public void check(String text) {
        System.out.println("Checking spelling via Cloud API...");
    }
}

// 3. The Dependent Class (Loosely Coupled)
class DITextEditor {
    private final SpellChecker checker; // Flexible and immutable

    // INJECTION: The dependency is passed into the constructor.
    // This class does not use the 'new' keyword for its spell checker.
    public DITextEditor(SpellChecker checker) {
        this.checker = checker;
    }

    public void type(String text) {
        System.out.println("Typing: " + text);
        checker.check(text);
    }
}
// Msin
public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== APPROACH 1: WITHOUT DEPENDENCY INJECTION ===");
        NonDITextEditor oldEditor = new NonDITextEditor();
        oldEditor.type("Hello World");
        
        System.out.println("\n=== APPROACH 2: WITH DEPENDENCY INJECTION ===");
        // We can create the dependency we want...
        SpellChecker advanced = new AdvancedSpellChecker();
        // ...and inject it smoothly
        DITextEditor modernEditor1 = new DITextEditor(advanced);
        modernEditor1.type("Hello World");

        // Look how easy it is to completely swap behavior now:
        SpellChecker cloud = new CloudSpellChecker();
        DITextEditor modernEditor2 = new DITextEditor(cloud);
        modernEditor2.type("Hello World");
    }
}

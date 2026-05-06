package coreEngine;

public class ProgenitorRouter {

    // The specialized AI agents attached to Progenitor
    private final GemmaMathSpecialist gemmaMathBrain;
    private final LocalDatabase localDb;
    private final MathIndexTrigger isMath;
    public ProgenitorRouter() {
        this.gemmaMathBrain = new GemmaMathSpecialist();
        this.localDb = new LocalDatabase();
        this.isMath = new MathIndexTrigger();
    }

    /**
     * The Main Traffic Cop: Analyzes intent and routes the request.
     */
    public String routeRequest(String userInput) {
        String inputLower = userInput.toLowerCase().trim();
        System.out.println("\n[JARVIS Progenitor] Intercepted: \"" + userInput + "\"");

        // 1. INTENT FLAG: Is this a Math Problem?
        if (isMath.isMathIntent(inputLower)) {
            System.out.println("[Progenitor Intent] -> Math detected. Redirecting to specialized GAMA/Gemma core...");
            return gemmaMathBrain.calculate(userInput);
        }

        // 2. INTENT FLAG: Is this a local notes query?
        else if (inputLower.contains("notes") || inputLower.contains("search")) {
            System.out.println("[Progenitor Intent] -> Database search detected. Routing locally...");
            return localDb.searchNotes(userInput);
        }

        // 3. Fallback Intent
        return "Sir, I do not understand this intent. Please rephrase.";
    }

    /**
     * Fast, zero-latency intent detection using keyword heuristics.
     * (Later, you can upgrade this to a vector embedding router!)
     */

}
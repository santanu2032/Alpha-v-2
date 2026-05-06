package coreEngine;

public class TestMain {
    public static void main(String[] args) {
        ProgenitorRouter jarvis = new ProgenitorRouter();

        // Test 1: Ask a standard question
        String response1 = jarvis.routeRequest("Search my college notes for physics");
        System.out.println("Final Output: " + response1 + "\n");

        // Test 2: Ask a math question! Progenitor will flag it and send it to Gemma.
        String response2 = jarvis.routeRequest("Hey Jarvis, solve the derivative of x^2 for me");
        System.out.println("Final Output: " + response2 + "\n");
    }
}
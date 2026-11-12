package com.devops.tp1;

/** Small application used to demonstrate the TP1 Jenkins pipeline. */
public final class DemoIC {
    private DemoIC() {
    }

    public static String greeting(String name) {
        if (name == null || name.isBlank()) {
            return "Bonjour, DevOps !";
        }
        return "Bonjour, " + name.trim() + " !";
    }

    public static void main(String[] args) {
        String name = args.length == 0 ? "DevOps" : String.join(" ", args);
        System.out.println(greeting(name));
    }
}

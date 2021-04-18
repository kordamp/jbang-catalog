//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 8
//DEPS org.kordamp.maven:pomchecker:1.2.0

public class pomchecker {
    public static void main(String... args) throws Exception {
        org.kordamp.maven.checker.cli.Main.main(args);
    }
}
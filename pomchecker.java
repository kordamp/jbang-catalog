//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 8
//DEPS org.kordamp.maven:pomchecker-cli:1.1.0

public class pomchecker {
    public static void main(String... args) throws Exception {
        org.kordamp.maven.checker.cli.Main.main(args);
    }
}

//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 8
//DEPS com.github.kordamp:pomchecker:1.2.0-SNAPSHOT

public class pomchecker_snapshot {
    public static void main(String... args) throws Exception {
        org.kordamp.maven.checker.cli.Main.main(args);
    }
}
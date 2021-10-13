//usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 8+
//REPOS jitpack
//DEPS com.github.kordamp:pomchecker:master-SNAPSHOT

public class pomchecker_snapshot {
    public static void main(String... args) throws Exception {
        org.kordamp.maven.checker.cli.Main.main(args);
    }
}
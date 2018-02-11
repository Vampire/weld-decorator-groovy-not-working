appender("BASIC_STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36}.%method\\(\\) - %msg%n"
    }
}
root(INFO, ["BASIC_STDOUT"])
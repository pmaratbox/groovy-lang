# 0397 — Log Level Filter

With a threshold of WARN, log messages at INFO, WARN, and ERROR but only emit WARN and ERROR, on two lines. A map ranks each level so the threshold comparison is a simple integer check.

## Run

    groovy main.groovy

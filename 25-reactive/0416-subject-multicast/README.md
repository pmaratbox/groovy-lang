# 0416 — Subject Multicast

Implement a Subject that multicasts each emission to all current observers; two observers both receive 1 then 2. In Groovy, observers are stored as a list of closures and `next` simply iterates them with `each`.

## Run

    groovy main.groovy

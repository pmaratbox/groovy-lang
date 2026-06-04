# 0215 — Chain of Responsibility

Pass a request of level 2 along a handler chain so the level-2 handler handles it, printing `handled by 2`. Each handler either handles its level or forwards to the linked `next`.

## Run

    groovy main.groovy

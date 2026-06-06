# 0404 — Cold vs Hot Observable

Contrast a cold observable (re-runs its producer per subscriber) with a hot one (shares a single execution, so late subscribers miss earlier values). In Groovy the cold one calls its producer closure afresh per `subscribe`, while the hot one keeps a list of observer closures and broadcasts to whoever is currently in it.

## Run

    groovy main.groovy

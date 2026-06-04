# 0188 — Kadane Max Subarray

Find the maximum subarray sum of [-2,1,-3,4,-1,2,1,-5,4] with Kadane and print `6`. A single pass tracks `max(cur+x, x)` and the running best.

## Run

    groovy main.groovy

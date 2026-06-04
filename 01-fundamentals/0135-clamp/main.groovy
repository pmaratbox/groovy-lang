def clamp = { x, lo, hi -> Math.max(lo, Math.min(x, hi)) }
println "${clamp(15, 0, 10)} ${clamp(-3, 0, 10)}"

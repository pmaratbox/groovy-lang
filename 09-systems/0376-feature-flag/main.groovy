def evaluate = { boolean flag -> flag ? "enabled" : "disabled" }

println "${evaluate(true)} ${evaluate(false)}"

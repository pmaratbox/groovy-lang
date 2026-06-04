def program = "+++"
int cell = 0
for (ch in program) {
    if (ch == '+') cell++
    else if (ch == '-') cell--
}
println cell

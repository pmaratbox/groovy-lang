def daysFromCivil(int y, int m, int d) {
    y -= (m <= 2) ? 1 : 0
    int era = (int) ((y >= 0 ? y : y - 399) / 400)
    int yoe = y - era * 400
    int doy = (int) ((153 * (m + (m > 2 ? -3 : 9)) + 2) / 5) + d - 1
    int doe = yoe * 365 + (int) (yoe / 4) - (int) (yoe / 100) + doy
    era * 146097 + doe - 719468
}

println(daysFromCivil(2000, 12, 31) - daysFromCivil(2000, 1, 1))

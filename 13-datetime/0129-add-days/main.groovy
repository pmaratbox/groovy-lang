def daysFromCivil(int y, int m, int d) {
    y -= (m <= 2) ? 1 : 0
    int era = (int) ((y >= 0 ? y : y - 399) / 400)
    int yoe = y - era * 400
    int doy = (int) ((153 * (m + (m > 2 ? -3 : 9)) + 2) / 5) + d - 1
    int doe = yoe * 365 + (int) (yoe / 4) - (int) (yoe / 100) + doy
    era * 146097 + doe - 719468
}

def civilFromDays(int z) {
    z += 719468
    int era = (int) ((z >= 0 ? z : z - 146096) / 146097)
    int doe = z - era * 146097
    int yoe = (int) ((doe - (int) (doe / 1460) + (int) (doe / 36524) - (int) (doe / 146096)) / 365)
    int y = yoe + era * 400
    int doy = doe - (365 * yoe + (int) (yoe / 4) - (int) (yoe / 100))
    int mp = (int) ((5 * doy + 2) / 153)
    int d = doy - (int) ((153 * mp + 2) / 5) + 1
    int m = mp + (mp < 10 ? 3 : -9)
    y += (m <= 2) ? 1 : 0
    [y, m, d]
}

def (y, m, d) = civilFromDays(daysFromCivil(2000, 1, 1) + 40)
println(sprintf('%04d-%02d-%02d', y, m, d))

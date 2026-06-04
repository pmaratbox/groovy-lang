int value = 258
int high = (value >> 8) & 0xFF
int low = value & 0xFF
int decoded = high * 256 + low
println "${high} ${low} ${decoded}"

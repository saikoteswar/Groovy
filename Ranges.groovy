enum DAYS {
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def weekdays = DAYS.SUN..DAYS.SAT
for (element in weekdays) {
    println "$element"
}
println "$weekdays.from"
println "$weekdays.to"

package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

    public static long getDaysBetweenNextLaborDay(LocalDate date) {
//    Long result = 0L;
//    int year = date.getYear();
//    LocalDate mayDayThisYear = LocalDate.of(year,5,1);
//    if (date.isBefore(mayDayThisYear)) {
//      result = ChronoUnit.DAYS.between( date, mayDayThisYear);
//    }else {
//      result = ChronoUnit.DAYS.between( date, LocalDate.of(year+1, 5, 1));
//    }
//    return (Long) result;
        Long result;
        int year = date.getYear();
        LocalDate mayDayThisYear = LocalDate.of(year, 5, 1);
        LocalDate mayDayNextYear = LocalDate.of(year + 1, 5, 1);
        if (date.isBefore(mayDayThisYear)) {
            result = mayDayThisYear.toEpochDay() - date.toEpochDay();
        } else {
            result = mayDayNextYear.toEpochDay() - date.toEpochDay();
        }
        return (Long) result;
    }
}

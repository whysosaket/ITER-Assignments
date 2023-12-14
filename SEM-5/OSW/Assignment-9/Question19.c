#include <stdio.h>
#include <string.h>

typedef struct{ int hour, minute, second; } time_t;

time_t new_time(time_t time_of_day, int elapsed_secs){
    int s = elapsed_secs;
    int m = elapsed_secs/60;
    s = s - m*60;
    int h = m/60;
    m = m - h*60;
    time_of_day.second += s;
    time_of_day.minute += m;
    time_of_day.hour += h;
    return time_of_day;
}

int main()
{   
    time_t time_of_day;
    time_of_day.hour = 12;
    time_of_day.minute = 0;
    time_of_day.second = 0;
    time_of_day = new_time(time_of_day, 3602);

    printf("%d:%d:%d\n", time_of_day.hour, time_of_day.minute, time_of_day.second);
    return 0;
}
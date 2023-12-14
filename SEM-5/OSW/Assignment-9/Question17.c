#include <stdio.h>

int main()
{
    typedef struct
    {
        char name[30];
        double diameter;
        int moons;
        double or_time, ro_time;
    } planet_t;

    planet_t p1 = {"Jupiter", 142.34, 16, 11.9, 9.23};
    return 0;
}
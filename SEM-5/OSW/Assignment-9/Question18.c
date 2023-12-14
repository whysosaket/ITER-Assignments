#include <stdio.h>
#include <string.h>

int main()
{
    typedef struct
    {
        char name[30];
        double diameter;
        int moons;
        double or_time, ro_time;
    } planet_t;

    planet_t p1;
    planet_t *p2 = &p1;
    strcpy(p2->name, "Jupiter");
    p2->diameter = 142.34;
    p2->moons = 16;
    p2->or_time = 11.9;
    p2->ro_time = 9.23;

    printf("%s\n", p2->name);
    printf("%lf\n", p2->diameter);
    printf("%d\n", p2->moons);
    printf("%lf\n", p2->or_time);
    printf("%lf\n", p2->ro_time);
    return 0;
}
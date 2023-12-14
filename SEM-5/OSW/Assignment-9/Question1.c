#include <stdio.h>

struct oswcourse
{
    int secid;
    float avgm;
    char present;
    int *marks();       // Wrong
    int teacher();      // Wrong
} o1, o2;
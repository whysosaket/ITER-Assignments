#include<stdio.h>
#include<string.h>
#include <stdlib.h>

typedef struct {
    int day;
    int month;
    int year;
} date_t;

typedef struct {
    double capacity;
    double level;
} tank_t;

typedef struct
{
    char *model;
    double odometer;
    date_t manuf_date;
    date_t purc_date;
    double price;
} auto_t;

void scan_auto(auto_t);
void scan_tank(tank_t);
void scan_date(date_t);
void print_auto(auto_t);
void print_tank(tank_t);
void print_date(date_t);

int main(){
    // TODO, Driver Function 
    return 0;
}

void scan_auto(auto_t *a){
    printf("Enter model: ");
    scanf("%s", a->model);
    printf("Enter odometer: ");
    scanf("%lf", &a->odometer);
    printf("Enter manufacture date: ");
    scan_date(&a->manuf_date);
    printf("Enter purchase date: ");
    scan_date(&a->purc_date);
    printf("Enter price: ");
    scanf("%lf", &a->price);
}

void scan_tank(tank_t *t){
    printf("Enter capacity: ");
    scanf("%lf", &t->capacity);
    printf("Enter level: ");
    scanf("%lf", &t->level);
}

void scan_date(date_t *d){
    printf("Enter day: ");
    scanf("%d", &d->day);
    printf("Enter month: ");
    scanf("%d", &d->month);
    printf("Enter year: ");
    scanf("%d", &d->year);
}

void print_auto(auto_t *a){
    printf("Model: %s\n", a->model);
    printf("Odometer: %lf\n", a->odometer);
    printf("Manufacture date: ");
    print_date(&a->manuf_date);
    printf("Purchase date: ");
    print_date(&a->purc_date);
    printf("Price: %lf\n", a->price);
}

void print_tank(tank_t *t){
    printf("Capacity: %lf\n", t->capacity);
    printf("Level: %lf\n", t->level);
}

void print_date(date_t *d){
    printf("%d/%d/%d\n", d->day, d->month, d->year);
}
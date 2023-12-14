#include <stdio.h>
#include <string.h>

void printReport(char *s) {
    char warehouse[20], product[20], qualifiers[20];
    char *p = s;
    int copy = 0;

    while (*p != '\0' && !(*p >= '0' && *p <= '9')) {
        warehouse[copy++] = *p;
        p++;
    }
    warehouse[copy] = '\0';

    copy = 0;
    while (*p != '\0' && (*p < 'A' || (*p > 'Z' && *p < 'a') || *p > 'z')) {
        product[copy++] = *p;
        p++;
    }
    product[copy] = '\0';

    copy = 0;
    while (*p != '\0') {
        qualifiers[copy++] = *p;
        p++;
    }
    qualifiers[copy] = '\0';

    printf("Warehouse: %s\n", warehouse);
    printf("Product: %s\n", product);
    printf("Qualifiers: %s\n", qualifiers);
}

int main() {
    char s[] = "ATL1203S14";
    printReport(s);
    return 0;
}

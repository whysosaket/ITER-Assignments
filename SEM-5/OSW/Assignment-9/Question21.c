#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct{
    int xx, yy, zz, mm;
    char nickname[100];
} address_t;

void scan_address(address_t a[]){
    FILE *fp = fopen("ip.txt", "r");

    if (fp == NULL) {
        printf("Error opening file.\n");
        return;
    }

    for (int i = 0; i < 100; i++) {
        char line[100];
        fgets(line, sizeof(line), fp);

        char *token = strtok(line, ".");
        a[i].xx = atoi(token);
        token = strtok(NULL, ".");
        a[i].yy = atoi(token);
        token = strtok(NULL, ".");
        a[i].zz = atoi(token);
        token = strtok(NULL, " \t");
        a[i].mm = atoi(token);
        token = strtok(NULL, "\n");
        while(token[0] == ' '){
            token++;
        }
        strcpy(a[i].nickname, token);
        // printf("%d.%d.%d.%d %s\n", a[i].xx, a[i].yy, a[i].zz, a[i].mm, a[i].nickname);
    }

    fclose(fp);
}

int local_address(address_t a1, address_t a2){
    if(a1.xx == a2.xx && a1.yy == a2.yy){
        return 1;
    }else{
        return 0;
    }
}

void print_address(address_t a){
    printf("%d.%d.%d.%d %s\n", a.xx, a.yy, a.zz, a.mm, a.nickname);
}

int main(){

    address_t a[100];
    scan_address(a);

    // Check Locals
    for(int i = 0; i < 100; i++){
        for(int j = i + 1; j < 100; j++){
            if(local_address(a[i], a[j])){
                printf("Machines %s and %s are on the same local network\n", a[i].nickname, a[j].nickname);
            }
        }
    }

    // print address
    for(int i = 0; i < 100; i++){
        print_address(a[i]);
    }

    return 0;
}
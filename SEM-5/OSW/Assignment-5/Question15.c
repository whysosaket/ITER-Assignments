#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void fgetAnswers(char [],int);

int main(){

    int questions;
    FILE *iF = fopen("examdat.txt", "r");
    fscanf(iF, "%d", &questions);

    char answers[questions];
    fscanf(iF, " %s", answers);
    fclose(iF);
    
    fgetAnswers(answers, questions);
    
    return 0;
}

void fgetAnswers(char answers[],int n){
    FILE *iF = fopen("examdat.txt", "r");
    FILE *oF = fopen("report.txt", "w");
    // freopen("report.txt", "w", stdout);

    printf("            Exam Report\n");
    printf("Question    ");
    for(int i=0;i<n;i++) printf(" %d", i+1);
    printf("\nAnswer      ");
    for(int i=0;i<n;i++) printf(" %c", answers[i]);
    printf("\n\n");
    
    char line[256];
    int lineNumber = 0;
    int missedCount[n];
    memset(missedCount, 0, sizeof(missedCount));

    printf("ID    Score(%%)\n");
    while (fgets(line, sizeof(line), iF) != NULL) {
        lineNumber++;
        if (lineNumber >= 2) {
            int id, correct=0;
            sscanf(line, "%d", &id);
            char *token = strtok(line, " ");
            token = strtok(NULL, " ");
            for(int i=0;i<n;i++){
                if(token[i]==answers[i]) correct++;
                else missedCount[i]++;
            }
            double percentage = (double)correct/n*100;
            printf("%d    %.2lf\n", id, percentage);
        }
    }

    printf("\nQuestion   ");
    for(int i=0;i<n;i++) printf(" %d", i+1);
    printf("\nMissed by  ");
    for(int i=0;i<n;i++) printf(" %d", missedCount[i]);
    printf("\n");

    fclose(iF);
    fclose(oF);
}
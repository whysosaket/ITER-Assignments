#include <stdio.h>
#include <string.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>


int main() { /* PID of child 3425 */ pid_t childpid,waitreturn; /* PID of parent 3424 */ childpid = fork();
if(childpid == 0) {
      printf("Process ID=%ld\n",(long)getpid());
   }
   waitreturn=wait(NULL);
   printf("Process ssss=%ld\n",(long)waitreturn);
   if (childpid != waitreturn) {
      printf("Return value of fork=%ld\n",(long)childpid);
      printf("Process ID=%ld\n",(long)getpid());
      printf("Return value of wait=%d\n",waitreturn);
}
return 0; }
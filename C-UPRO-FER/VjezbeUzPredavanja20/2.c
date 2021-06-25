#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
   int frek[11] = {0};

   srand((unsigned int)time(NULL));
   for (int i = 0; i < 1000000; i++) {
      frek[rand() % 11]++;
   }

   for (int i = 50; i <= 60; i++) {
      printf("%4d  %d\n", i, frek[i - 50]);
   }
   return 0;
}
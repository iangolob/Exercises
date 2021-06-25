#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
   int intervali[10] = {0};

   srand((unsigned int)time(NULL));

   float x;
   for (int i = 0; i < 5000000; i++) {
      x = ((float)rand() / RAND_MAX) * 5 + 10;
      // printf("%f\n", x);
      if (x - floor(x) < ceil(x) - x) {
         intervali[(int)(floor(x) - 10) * 2]++;
      } else {
         intervali[(int)(floor(x) - 10) * 2 + 1]++;
      }
   }
   for (int i = 0; i < 10; i++) {
      printf("%d\n", intervali[i]);
   }
   return 0;
}
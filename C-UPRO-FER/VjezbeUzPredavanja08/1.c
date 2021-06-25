#include <stdio.h>

int main(void) {
   float a[5][7] = {
       {0}, {0}, {31.1, 32.2, 33.3, 34.2}, {1.0, 4.0, 0, 0, 0, 0, 7.7}};
   for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 7; j++) {
         printf("%5.1f", a[i][j]);
      }
      printf("\n");
   }

   return 0;
}
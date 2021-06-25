#include <stdio.h>

int main(void) {
   int a[4][3][6];
   for (int s = 0; s < 4; s++) {
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 6; j++) {
            a[s][i][j] = (s + 1) * 100 + (i + 1) * 10 + j + 1;
         }
      }
   }
   for (int s = 0; s < 4; s++) {
      printf("%d. sloj\n", s + 1);
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 6; j++) {
            printf("%5d", a[s][i][j]);
         }
         printf("\n");
      }
      if (s != 3) {
         printf("\n");
      }
   }
   return 0;
}
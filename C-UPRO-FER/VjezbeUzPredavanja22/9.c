#include <stdio.h>
#define DIM 4

int main(void) {
   char polje[DIM][DIM];
   char c;
   for (int i = 0; i < DIM; i++) {
      for (int j = 0; j < DIM; j++) {
         polje[i][j] = getchar();
      }
   }
   for (int i = 0; i < DIM; i++) {
      for (int j = 0; j < DIM; j++) {
         printf("%5d", polje[i][j]);
      }
      printf("\n");
   }
   return 0;
}
#include <stdio.h>
#define DIM 4

int main(void) {
   char polje[DIM][DIM];
   char c;
   for (int i = 0; i < DIM; i++) {
      for (int j = 0; j < DIM; j++) {
         scanf(" %c", &polje[i][j]);
      }
   }
   for (int i = 0; i < DIM; i++) {
      for (int j = 0; j < DIM; j++) {
         printf("%c", polje[i][j]);
      }
      printf("\n");
   }
   return 0;
}
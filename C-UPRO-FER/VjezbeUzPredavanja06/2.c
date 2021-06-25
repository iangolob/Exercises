#include <stdio.h>

int main(void) {
   int n, br = 1;
   printf("Upisite red matrice > ");
   scanf("%d", &n);
   if (n >= 1 && n <= 10) {
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            if (i > j) {
               printf("  ");
            } else {
               printf("%2d", br);
               br++;
            }
            if (j < n) {
               printf(" ");
            } else {
               printf("\n");
            }
         }
      }
   } else {
      printf("Broj je neispravan");
   }
   return 0;
}
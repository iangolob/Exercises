#include <stdio.h>

int main(void) {
   int n;
   printf("Upisite red matrice > ");
   scanf("%d", &n);
   if (n >= 1 && n <= 10) {
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            printf("%d", i == j);
            if (j < n) {
               printf(" ");
            } else {
               printf("\n");
            }
         }
      }
   } else {
      printf("Red matrice je neispravan");
   }
   return 0;
}
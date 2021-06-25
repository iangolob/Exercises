#include <stdio.h>

int main(void) {
   int n, s = 0, br;
   scanf("%d", &n);
   if (n >= 1 && n <= 31) {
      for (int i = 1; i <= n; i++) {
         scanf("%d", &br);
         s = s * 2 + br;
      }
      printf(" = %d", s);
   } else {
      printf("Broj znamenki je neispravan");
   }

   return 0;
}
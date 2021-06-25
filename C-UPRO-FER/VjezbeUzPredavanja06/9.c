#include <stdio.h>

int main(void) {
   int n, np, zbr = 0;

   scanf("%d", &np);

   if (np != 0) {
      zbr += np;
      scanf("%d", &n);
      while (n < 0 && np > 0 || n > 0 && np < 0) {
         zbr += n;
         np = n;
         scanf("%d", &n);
      }
   }

   printf("suma = %d", zbr);
   return 0;
}
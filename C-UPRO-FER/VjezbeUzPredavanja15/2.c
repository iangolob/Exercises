#include <stdio.h>

int maks(int *np, int *mp) {
   if (*np > *mp) {
      return *np;
   } else {
      return *mp;
   }
}

int main(void) {
   int n, m;

   printf("Upisite dva cijela broja > ");
   scanf("%d %d", &n, &m);

   printf("Rezultat je %d", maks(&n, &m));

   return 0;
}
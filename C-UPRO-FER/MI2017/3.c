#include <stdio.h>

int main(void) {
   long long int n, zbr = 0, np;
   printf("Upisati brojeve: ");
   scanf("%lld", &np);
   zbr += np;
   while (scanf("%lld", &n), n > np) {
      zbr += n;
      np = n;
   }
   printf("Suma: %lld", zbr);
   return 0;
}
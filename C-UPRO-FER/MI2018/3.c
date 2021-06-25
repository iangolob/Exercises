#include <stdio.h>

int main(void) {
   int n, a[10] = {0}, neg = 0;
   while (printf("Upisati broj > "), scanf("%d", &n), n != 0) {
      if (n < 0) {
         n = -n;
         neg++;
      }
      while (n > 0) {
         a[n % 10]++;
         n = n / 10;
      }
   }
   for (int i = 0; i < 10; i++) {
      printf("Znamenka %d:%4d puta\n", i, a[i]);
   }
   printf("Negativni : %4d puta \n", neg);
   return 0;
}
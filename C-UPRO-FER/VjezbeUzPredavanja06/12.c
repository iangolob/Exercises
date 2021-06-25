#include <stdio.h>

int main(void) {
   int n, br = 1, np;
   scanf("%d", &n);
   printf("%d ", n);
   np = n;
   while (n != 1) {
      if (br % 10 == 0) {
         printf("\n");
      }
      if (n % 2 == 0) {
         n = n / 2;
      } else {
         n = 3 * n + 1;
      }
      printf("%d ", n);
      br++;
   }
   printf("\n");
   printf("za n = %d, total stopping time = %d", np, br - 1);
   return 0;
}
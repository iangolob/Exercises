#include <stdio.h>

int main(void) {
   int m, n;
   printf("Upisite m,n > ");
   scanf("%d %d", &m, &n);
   for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
         printf("%4d", n - j + i);
         if (n == j) {
            printf("\n");
         }
      }
   }

   return 0;
}
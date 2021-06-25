#include <stdio.h>

int main(void) {
   int m, n;
   printf("Upisite m, n > ");
   scanf("%d %d", &m, &n);
   printf("Upisite %d x %d clanova >\n", m, n);

   int a[m][n];

   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         scanf("%d", &a[i][j]);
      }
   }
   int pomocni;
   for (int j = 0; j < n; j++) {
      pomocni = a[0][j];
      for (int i = 0; i < m; i++) {
         if (i != m - 1) {
            a[i][j] = a[i + 1][j];
         } else {
            a[i][j] = pomocni;
         }
      }
   }

   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         printf("%4d", a[i][j]);
      }
      printf("\n");
   }
   return 0;
}
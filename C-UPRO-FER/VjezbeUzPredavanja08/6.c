#include <stdio.h>

int main(void) {
   int m, n;

   do {
      printf("Upisite m [4, 8] > ");
      scanf("%d", &m);
   } while (m < 4 || m > 8);
   do {
      printf("Upisite n [5, 10] > ");
      scanf("%d", &n);
   } while (n < 5 || n > 10);

   printf("Upisite %d x %d clanova >\n", m, n);
   int a[m][n], sumaPoStupcima[n];

   for (int i = 0; i < n; i++) {
      sumaPoStupcima[i] = 0;
   }

   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         scanf("%d", &a[i][j]);
         sumaPoStupcima[j] += a[i][j];
      }
   }

   printf("Sume po stupcima:\n");
   for (int i = 0; i < n; i++) {
      printf("%5d", sumaPoStupcima[i]);
   }

   return 0;
}
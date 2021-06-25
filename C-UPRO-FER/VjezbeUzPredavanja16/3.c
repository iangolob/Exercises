#include <stdio.h>
// 3 4 1.2 -4.1 2.2 8.15 415.9 1.0 1.0 1.0 2.2 2.2 2.2 12.2
double zbroj2D(double *p, int m, int n) {
   double rez = 0;
   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         // printf("%lf\n", *(p + i * n + j));
         rez += *(p + i * n + j);
      }
   }
   return rez;
}

int main(void) {
   int m, n;

   printf("Upisite dimenzije > ");
   scanf("%d %d", &m, &n);

   printf("Upisite clanove >\n");
   double a[m][n];
   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         scanf("%lf", &a[i][j]);
      }
   }

   printf("Suma je: %lf", zbroj2D(&a[0][0], m, n));

   return 0;
}
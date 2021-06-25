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
   int mali;
   for (int j = 0; j < n; j++) {
      mali = a[0][j];
      for (int i = 0; i < m; i++) {
         if (a[i][j] < mali) {
            mali = a[i][j];
         }
      }
      printf("%d. stupac:", j);
      for (int i = 0; i < m; i++) {
         if (a[i][j] == mali) {
            printf(" (%d, %d)", i, j);
         }
      }
      printf("\n");
   }
   return 0;
}
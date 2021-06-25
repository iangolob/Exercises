#include <stdio.h>
int main(void) {
   int m, n;
   printf("Upisati m i n > ");
   scanf("%d %d", &m, &n);
   int a[m][n];
   int maks, rMaks, zbr;
   printf("Upisati clanove > \n");
   for (int i = 0; i < m; i++) {
      zbr = 0;
      for (int j = 0; j < n; j++) {
         scanf("%d", &a[i][j]);
         zbr += a[i][j];
      }
      if (i == 0) {
         maks = zbr;
         rMaks = 0;
      } else {
         if (zbr >= maks) {
            maks = zbr;
            rMaks = i;
         }
      }
   }
   printf("\"Najveci\" redak:\n");
   for (int j = 0; j < n; j++) {
      printf("%5d", a[rMaks][j]);
   }
   return 0;
}
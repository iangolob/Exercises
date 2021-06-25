#include <stdio.h>
int main(void) {
   int m, n;
   printf("Upisati m i n:\n");
   scanf("%d %d", &m, &n);
   int a[m][n];
   printf("Upisati clanove polja:\n");
   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         scanf("%d", &a[i][j]);
      }
   }
   printf("\nRezultat:\n");
   int maks, p;
   _Bool postoji;
   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         if (j == 0) {
            postoji = 1;
            p = 0;
            maks = a[i][j];
         } else {
            if (a[i][j] > maks) {
               p = j;
               postoji = 1;
               maks = a[i][j];
            } else {
               if (a[i][j] == maks) {
                  postoji = 0;
               }
            }
         }
      }
      if (postoji) {
         printf("(%d,%d): %d\n", i, p, maks);
      }
   }
   return 0;
}
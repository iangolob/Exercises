#include <stdio.h>

int mn(int x, int y) {
   if (x == 0 & y == 0) {
      return 0;
   } else if (x == 0) {
      return y;
   } else if (y == 0) {
      return x;
   } else {
      return x * y;
   }
}

int main(void) {
   int m, n;
   scanf("%d %d", &m, &n);
   for (int i = 0; i <= m; i++) {
      for (int j = 0; j <= n; j++) {
         printf("%5d", mn(i, j));
      }
      printf("\n");
   }
   return 0;
}
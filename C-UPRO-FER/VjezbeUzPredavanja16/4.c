#include <stdio.h>

// 4 10 20 30 40 11 21 31 41 12 22 32 42 13 23 33 43

void transpKvad(int *p, int n) {
   int temp;
   for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
         temp = *(p + i * n + j);
         *(p + i * n + j) = *(p + j * n + i);
         *(p + j * n + i) = temp;
      }
   }
   return;
}

int main(void) {
   int n;
   printf("Upisite red matrice > ");
   scanf("%d", &n);

   int a[n][n];
   printf("Upisite clanove >\n");
   for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
         scanf("%d", &a[i][j]);
      }
   }

   transpKvad(&a[0][0], n);

   for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
         printf("%5d", a[i][j]);
      }
      printf("\n");
   }

   return 0;
}
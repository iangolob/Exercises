#include <stdio.h>

void sort2D(int *p, int m, int n, _Bool silazno) {
   int temp;
   for (int x = 0; x < m; x++) {
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            if (silazno) {
               if (*(p + i) < *(p + j)) {
                  temp = *(p + i);
                  *(p + i) = *(p + j);
                  *(p + j) = temp;
               }
            } else {
               if (*(p + i) > *(p + j)) {
                  temp = *(p + i);
                  *(p + i) = *(p + j);
                  *(p + j) = temp;
               }
            }
         }
      }
      p += n;
   }
   return;
}

int main(void) {
   char c;
   int m, n;

   printf("Upisite smjer poretka (S-silazno) > ");
   scanf("%c", &c);
   printf("Upisite dimenzije > ");
   scanf("%d %d", &m, &n);

   int a[m][n];
   printf("Upisite clanove >\n");
   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         scanf("%d", &a[i][j]);
      }
   }

   _Bool silazno;
   silazno = c == 'S';
   sort2D(&a[0][0], m, n, silazno);

   for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
         printf("%5d", a[i][j]);
      }
      printf("\n");
   }
   return 0;
}
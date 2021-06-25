#include <stdio.h>

void sort1D(int *p, int n, _Bool silazno) {
   int temp;
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
}

int main(void) {
   char c;
   int n;

   printf("Upisite smjer poretka (S-silazno) > ");
   scanf("%c", &c);
   printf("Upisite dimenziju > ");
   scanf("%d", &n);

   int a[n];
   printf("Upisite clanove > ");
   for (int i = 0; i < n; i++) {
      scanf("%d", &a[i]);
   }

   _Bool silazno;
   silazno = c == 'S';
   sort1D(&a[0], n, silazno);

   for (int i = 0; i < n; i++) {
      printf("%d ", a[i]);
   }
   return 0;
}
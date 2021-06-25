#include <stdio.h>

int negativci(int *p, int *neg, int n) {
   int rez = 0;
   for (int i = 0; i < n; i++) {
      if (*(p + i) < 0) {
         *(neg + rez) = *(p + i);
         rez++;
      }
   }
   return rez;
}

int main(void) {

   int n;
   printf("Upisite broj clanova > ");
   scanf("%d", &n);

   int a[n];
   printf("Upisite clanove > ");
   for (int i = 0; i < n; i++) {
      scanf("%d", &a[i]);
   }

   int brNeg = 0;
   int neg[n];
   brNeg = negativci(&a[0], &neg[0], n);

   for (int i = 0; i < brNeg; i++) {
      printf("%d ", neg[i]);
   }

   return 0;
}
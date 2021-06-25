#include <stdio.h>

int *negativci(int *p, int n) {
   for (int i = 0; i < n; i++) {
      if (*(p + i) < 0) {
         return p + i;
      }
   }
   return NULL;
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

   int *rez;
   rez = negativci(&a[0], n);
   if (rez == NULL) {
      printf("Nema negativnih");
   } else {
      printf("Prvi negativni je %d", *rez);
   }

   return 0;
}
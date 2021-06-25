#include <stdio.h>

int main(void) {
   int n;
   printf("Upisite broj osoba > ");
   scanf("%d", &n);

   struct {
      int mat;
      int god;
   } a[n], pomocni;

   for (int i = 0; i < n; i++) {
      printf("%3d. osoba > ", i + 1);
      scanf("%d %d", &a[i].mat, &a[i].god);
   }

   for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
         if (a[i].god > a[j].god) {
            pomocni = a[i];
            a[i] = a[j];
            a[j] = pomocni;
         }
      }
   }
   for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
         if (a[i].god == a[j].god && a[i].mat > a[j].mat) {
            pomocni = a[i];
            a[i] = a[j];
            a[j] = pomocni;
         }
      }
   }

   printf("\n");
   int trenutna = 0;
   for (int i = 0; i < n; i++) {
      if (trenutna != a[i].god) {
         printf("%4d. godina\n", a[i].god);
         trenutna = a[i].god;
      }
      printf("%9d\n", a[i].mat);
   }
}
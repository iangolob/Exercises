#include <stdio.h>

_Bool primCheck(int x) {
   _Bool rez = 1;
   for (int i = 2; i < x; i++) {
      if (x % i == 0) {
         rez = 0;
      }
   }
   return rez;
}

void genPrim(int *p, int granica, int n) {
   int trenutni = granica;
   int brojPrim = 0;
   do {
      if (primCheck(trenutni)) {
         *(p + brojPrim) = trenutni;
         brojPrim++;
      }
      trenutni++;
   } while (n > brojPrim);
   return;
}

int main(void) {

   int granica, n;
   printf("Upisite donju granicu i broj prim brojeva > ");
   scanf("%d %d", &granica, &n);

   int a[n];
   genPrim(&a[0], granica, n);

   for (int i = 0; i < n; i++) {
      printf("%5d\n", a[i]);
   }
   return 0;
}
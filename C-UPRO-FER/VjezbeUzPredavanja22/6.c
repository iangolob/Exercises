#include <stdio.h>

int main(void) {

   int broj = 0, zbroj = 0, inp;
   while (scanf("%d", &inp)) {
      zbroj += inp;
      broj++;
   }
   printf("Broj  : %d\n", broj);
   printf("Zbroj  : %d\n", zbroj);

   return 0;
}
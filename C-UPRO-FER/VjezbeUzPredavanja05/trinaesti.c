#include <stdio.h>

int main(void) {
   int min1 = 0, max1 = 0, br;

   printf("Upisite brojeve > ");
   do {
      scanf("%d", &br);
      if (br < min1) {
         min1 = br;
      }
      if (br > max1) {
         max1 = br;
      }
   } while (br != 0);

   if (min1 == 0) {
      printf("Nije upisan niti jedan negativni broj\n");
   } else {
      printf("Najmanji negativan = %d\n", min1);
   }

   if (max1 == 0) {
      printf("Nije upisan niti jedan pozitivan broj\n");
   } else {
      printf("Najmanji pozitivan = %d", max1);
   }
   return 0;
}
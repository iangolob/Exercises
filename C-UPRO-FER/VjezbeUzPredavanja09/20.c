#include <stdio.h>

int main(void) {
   char a[10];

   printf("Upisite 10 znakova > ");
   for (int i = 0; i < 10; i++) {
      scanf("%c", &a[i]);
   }

   printf("Original :");
   for (int i = 0; i < 10; i++) {
      printf("%c", a[i]);
   }
   printf("\n");
   int pomocni;
   for (int i = 0; i < 10; i++) {
      for (int j = i + 1; j < 10; j++) {
         if (a[j] < a[i]) {
            pomocni = a[i];
            a[i] = a[j];
            a[j] = pomocni;
         }
      }
   }

   printf("Sortirani:");
   for (int i = 0; i < 10; i++) {
      printf("%c", a[i]);
   }

   return 0;
}
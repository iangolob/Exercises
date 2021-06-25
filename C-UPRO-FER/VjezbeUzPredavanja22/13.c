#include <stdio.h>

int main(void) {
   int n;
   printf("Upisite n > ");
   scanf("%d", &n);

   printf("     ");
   for (int i = 1; i <= n; i++) {
      printf("%4d", i);
   }
   printf("\n");

   printf("----+");
   for (int i = 1; i <= n; i++) {
      printf("----");
   }
   printf("+\n");

   for (int i = 1; i <= n; i++) {
      printf("%4d!", i);
      for (int j = 1; j <= n; j++) {
         printf("%4d", i * j);
      }
      printf("!\n");
   }

   printf("----+");
   for (int i = 1; i <= n; i++) {
      printf("----");
   }
   printf("+\n");

   return 0;
}
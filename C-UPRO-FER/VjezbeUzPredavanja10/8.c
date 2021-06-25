#include <stdbool.h>
#include <stdio.h>
#define MAX_NIZ 200 + 1

int main(void) {
   char c[MAX_NIZ] = {0};
   int n;

   printf("Upisite niz > ");
   fgets(c, MAX_NIZ, stdin);
   printf("Upisite poziciju > ");
   scanf("%d", &n);

   bool kriva = false;
   n = n - 1;
   for (int i = 0; i < MAX_NIZ; i++) {
      if (c[i] == '\0') {
         if (n >= i || n == -1) {
            kriva = true;
         }
         break;
      }
      if (n <= i) {
         c[i] = c[i + 1];
      }
   }
   if (kriva) {
      printf("Kriva pozicija");
   } else {
      printf("%s", c);
   }

   return 0;
}
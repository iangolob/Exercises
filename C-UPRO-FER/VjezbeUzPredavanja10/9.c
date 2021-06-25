#include <stdbool.h>
#include <stdio.h>
#define MAX_NIZ 100 + 1

int main(void) {
   char c[MAX_NIZ] = {0};
   int n;

   printf("Upisite niz > ");
   fgets(c, MAX_NIZ, stdin);
   printf("Upisite poziciju > ");
   scanf("%d", &n);

   int len = 0;
   for (int i = 0; i < MAX_NIZ; i++) {
      if (c[i] == '\n' || c[i] == '\0') {
         break;
      } else {
         len++;
      }
   }

   if (n < 1 || n > len) {
      printf("Kriva pozicija");
   } else {
      for (int i = len; i > n - 2; i--) {
         c[i] = c[i - 1];
      }
      c[len + 1] = '\0';
      c[n - 1] = 'X';
      printf("%s", c);
   }

   return 0;
}
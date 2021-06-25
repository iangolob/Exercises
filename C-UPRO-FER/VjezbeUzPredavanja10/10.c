#include <stdio.h>
#define MAX_NIZ 20

int main(void) {
   char c1[MAX_NIZ], c2[MAX_NIZ];
   int n;

   printf("Upisite niz > ");
   fgets(c1, MAX_NIZ, stdin);
   printf("Upisite niz > ");
   fgets(c2, MAX_NIZ, stdin);
   printf("Upisite poziciju > ");
   scanf("%d", &n);

   int i = 0;

   while (c1[i] != '\0') {
      if (c1[i] == '\n') {
         c1[i] = '\0';
      }
      i++;
   }
   i = 0;
   while (c2[i] != '\0') {
      if (c2[i] == '\n') {
         c2[i] = '\0';
      }
      i++;
   }

   int len1 = 0;
   int len2 = 0;
   i = 0;
   while (c1[i] != '\0') {
      len1++;
      i++;
   }
   i = 0;
   while (c2[i] != '\0') {
      len2++;
      i++;
   }

   if (n > 0 && n <= len1) {
      n = n - 1;
      for (i = len1 + len2 - 1; i > n - 1 + len2; i--) {
         c1[i] = c1[i - len2];
      }
      c1[len1 + len2] = '\0';
      for (i = n; i < n + len2; i++) {
         c1[i] = c2[i - n];
      }
      printf("%s", c1);
   } else {
      printf("Kriva pozicija");
   }

   return 0;
}
#include <stdio.h>
#define MAX_NIZ 20

int main(void) {
   char c1[MAX_NIZ], c2[MAX_NIZ];

   printf("Upisite niz > ");
   fgets(c1, MAX_NIZ, stdin);
   printf("Upisite niz > ");
   fgets(c2, MAX_NIZ, stdin);

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

   c1[len1 + len2] = '\0';
   for (i = len1; i < len1 + len2; i++) {
      c1[i] = c2[i - len1];
   }
   printf("%s", c1);

   return 0;
}
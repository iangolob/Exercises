#include <stdio.h>

char *myStrcat(char *p1, char *p2) {
   int p1_len = 0;
   while (*(p1 + p1_len) != '\0') {
      p1_len++;
   }
   int poz = 0;
   while (*(p2 + poz) != '\0') {
      *(p1 + p1_len + poz) = *(p2 + poz);
      poz++;
   }
   *(p1 + p1_len + poz) = '\0';
   return p1;
}

int main(void) {
   char c1[20], c2[20];
   printf("Upisite 1. niz > ");
   fgets(c1, 20, stdin);
   printf("Upisite 2. niz > ");
   fgets(c2, 20, stdin);
   myStrcat(&c1[0], &c2[0]);
   printf("%s", c1);
}
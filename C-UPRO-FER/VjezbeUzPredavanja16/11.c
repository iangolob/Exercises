#include <stdio.h>
#define MAX_LEN 20

void izbaciNR(char *p) {
   int poz = 0;
   while (*(p + poz) != '\0') {
      poz++;
   }
   if (*(p + poz - 1) == '\n') {
      *(p + poz - 1) = '\0';
   }
   return;
}

void izbaciSamoglase(char *p) {
   int poz = 0, pozr = 0;
   while (*(p + poz) != '\0') {
      if (*(p + poz) != 'a' && *(p + poz) != 'e' && *(p + poz) != 'i' &&
          *(p + poz) != 'o' && *(p + poz) != 'u' && *(p + poz) != 'A' &&
          *(p + poz) != 'E' && *(p + poz) != 'I' && *(p + poz) != 'O' &&
          *(p + poz) != 'U') {
         *(p + pozr) = *(p + poz);
         pozr++;
      }
      poz++;
   }
   *(p + pozr) = '\0';
   return;
}

int main(void) {
   char a[MAX_LEN + 1];
   printf("Upisite niz > ");
   fgets(a, MAX_LEN + 1, stdin);

   izbaciNR(&a[0]);
   izbaciSamoglase(&a[0]);

   printf("%s", a);
   return 0;
}
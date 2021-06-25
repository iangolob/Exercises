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

int main(void) {
   char a[MAX_LEN + 1];
   printf("Upisite niz > ");
   fgets(a, MAX_LEN + 1, stdin);

   izbaciNR(&a[0]);

   printf("%s!", a);
   return 0;
}
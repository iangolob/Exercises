#include <stdio.h>
#define MAX_LEN 20

_Bool umetniZnak(char *p, char znak, int poz) {
   int len = 0;
   while (*(p + len) != '\0') {
      len++;
   }
   _Bool rez = 1;
   if (poz >= 0 && poz <= len) {
      for (int i = len; i > poz; i--) {
         *(p + i) = *(p + i - 1);
      }
      *(p + poz) = znak;
      *(p + len + 1) = '\0';
   } else {
      rez = 0;
   }
   return rez;
}

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
   char a[MAX_LEN + 2];
   printf("Upisite niz > ");
   fgets(a, MAX_LEN + 1, stdin);

   char c;
   printf("Upisite znak > ");
   scanf("%c", &c);

   int poz;
   printf("Upisite poziciju > ");
   scanf("%d", &poz);

   izbaciNR(&a[0]);

   if (umetniZnak(&a[0], c, poz)) {
      printf("%s", a);
   } else {
      printf("Neispravna pozicija");
   }
}
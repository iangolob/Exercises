#include <stdio.h>

int main(void) {
   char s[101], o[101];
   printf("Upisati niz: ");
   fgets(s, 100, stdin);
   int len = 0;
   while (s[len] != '\n' && s[len] != '\0') {
      len++;
   }
   s[len] = '\0';
   int poz = 0;
   if (len % 2 == 0) {
      for (int i = 0; i < len; i += 2) {
         if ((s[i] >= 'a' && s[i] <= 'z') ||
             (s[i + 1] >= 'a' && s[i + 1] <= 'z')) {
            o[poz] = 'X';
            poz++;
         } else {
            o[poz] = s[i];
            o[poz + 1] = s[i + 1];
            poz += 2;
         }
      }
   }
   if (poz != 0) {
      o[poz] = '\0';
      printf("Izlazni niz:%s", o);
   }
   return 0;
}
#include <stdio.h>
#define MAX_LEN 20
char *traziPrviSamoglas(char *p) {
   int poz = 0;
   while (*(p + poz) != '\0') {
      if (*(p + poz) == 'a' || *(p + poz) == 'e' || *(p + poz) == 'i' ||
          *(p + poz) == 'o' || *(p + poz) == 'u' || *(p + poz) == 'A' ||
          *(p + poz) == 'E' || *(p + poz) == 'I' || *(p + poz) == 'O' ||
          *(p + poz) == 'U') {
         return p + poz;
      }
      poz++;
   }
   return NULL;
}

int main(void) {
   char a[MAX_LEN + 1];
   printf("Upisite niz > ");
   fgets(a, MAX_LEN + 1, stdin);

   char *rez = &a[0] - 1;
   printf("Svi samoglasnici: ");
   while (rez = traziPrviSamoglas(rez + 1), rez != NULL) {
      printf("%c", *rez);
   }

   return 0;
}

#include <stdio.h>
#define MAX_LEN 20

char *traziZadnjiZnak(char *p, char c) {
   int i = 0;
   char *rez = NULL;
   while (*(p + i) != '\0') {
      if (*(p + i) == c) {
         rez = p + i;
      }
      i++;
   }
   return rez;
}

int main(void) {
   char a[MAX_LEN + 1];
   printf("Upisite niz > ");
   fgets(a, MAX_LEN + 1, stdin);

   char c;
   printf("Upisite znak > ");
   scanf("%c", &c);

   char *rez = traziZadnjiZnak(&a[0], c);

   if (rez == NULL) {
      printf("U nizu nema zadanog znaka");
   } else {
      printf("%d", rez - &a[0]);
   }

   return 0;
}
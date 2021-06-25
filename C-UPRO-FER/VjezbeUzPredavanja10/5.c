#include <stdio.h>

int main(void) {
   int slova = 0, samoglasnici = 0, ostali = 0;
   char c[20 + 1];

   printf("Upisite niz > ");
   fgets(c, 21, stdin);

   for (int i = 0; i < 21; i++) {
      if (c[i] == '\n') {
         c[i] == '\0';
      }
   }
   for (int i = 0; i < 21; i++) {
      if (c[i] == '\0')
         break;

      switch (c[i]) {
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
         samoglasnici++;
         break;
      }
      if (c[i] >= 'a' && c[i] <= 'z' || c[i] >= 'A' && c[i] <= 'Z') {
         slova++;
      } else {
         ostali++;
      }
   }
   printf("Niz: %s\nSamoglasnika: %d\nSuglasnika: %d\nOstalih: %d", c,
          samoglasnici, slova - samoglasnici, ostali);
   return 0;
}
#include <stdio.h>

int brojPodnizova(char *s1, char *s2) {
   int s1_len = 0, s2_len = 0;
   while (*(s1 + s1_len) != '\0') {
      s1_len++;
   }
   while (*(s2 + s2_len) != '\0') {
      s2_len++;
   }
   s1_len--;
   s2_len--;
   printf("%d %d\n", s1_len, s2_len);
   int rez = 0;
   for (int i = 0; i < s1_len - s2_len + 1; i++) {
      _Bool is_substr = 1;
      for (int j = 0; j < s2_len; j++) {
         if (*(s1 + i + j) != *(s2 + j)) {
            is_substr = 0;
         }
      }
      if (is_substr) {
         rez++;
      }
   }

   return rez;
}

int main(void) {
   char c1[50], c2[50];
   printf("Upisite 1. niz > ");
   fgets(c1, 50, stdin);
   printf("Upisite 2. niz > ");
   fgets(c2, 50, stdin);

   printf("2. niz se u 1. nizu pojavljuje %d puta",
          brojPodnizova(&c1[0], &c2[0]));

   return 0;
}
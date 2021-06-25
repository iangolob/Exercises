#include <ctype.h>
#include <stdio.h>
int main(void) {

   FILE *ulaz = fopen("C:/Users/9iang/Desktop/Semestar1/UPRO/Kod/"
                      "VjezbeUzPredavanja23/1/ulaz.txt",
                      "r");

   char c;
   while ((c = getc(ulaz)) != EOF) {
      if (islower(c)) {
         printf("%c", c - 'a' + 'A');
      } else {
         printf("%c", c);
      }
   }
   fclose(ulaz);
   return 0;
}
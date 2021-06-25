#include <stdio.h>

int main(void) {

   for (int i = 0; i < 21; i++) {
      printf("%c. ", 65 + i);
      for (int j = 0; j < 6; j++) {
         printf("%c ", 97 + i + j);
      }
      printf(".%c\n", 70 + i);
   }
}
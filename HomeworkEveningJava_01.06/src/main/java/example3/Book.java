package example3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Book implements Comparable<Book>{
   private String title;
   private String author;
   private int publicationYear;

   @Override
   public int compareTo(Book elem) {
      if(this.publicationYear < elem.publicationYear){
         return -1;
      } else if (this.publicationYear > elem.publicationYear) {
         return +1;
      }else {
         return 0;
      }
   }
}

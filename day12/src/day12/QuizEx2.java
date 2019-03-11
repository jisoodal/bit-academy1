package day12;

import java.util.*; 

class QuizEx2 { 
      public static void main(String[] args) { 
            String[] data = { 
                  "다음 중 키워드가 아닌 것은?`2`final`True`if`public", 
                  "다음 중 자바의 연산자가 아닌 것은?`6`&`|`++`!=`/`^", 
                  "다음 중 메서드의 반환값이 없음을 의미하는 키워드는?`1`void`null`false`", 
            }; 
            
            Scanner s = new Scanner(System.in); 
            int score = 0; 

            for(int i=0;i < data.length;i++) { 
                  String[] tmp = data[i].split("`",3); 
                  String question = tmp[0]; 
                  String answer = tmp[1]; 
                  String[] choices = tmp[2].split("`");

                  System.out.println("["+(i+1)+"] "+question); 
                  
                  for(int x=0;x < choices.length;x++) { 
                        System.out.print((x+1)+"."+choices[x]+"\t"); 
                  } 
                  // int 형태로 입력 받음
                  System.out.println();
                  
                  System.out.print("[답]:");
                  String type = String.valueOf(s.nextInt());
                  
                  
                  // 정답 여부 판단
                  if(type.equals(answer)){
                	  score++;
                  }

 

                  System.out.println(); 
                  System.out.println(); 
            } 
            

            System.out.println("정답개수/전체문항수:"+score+"/"+data.length);


      } // main 
} 


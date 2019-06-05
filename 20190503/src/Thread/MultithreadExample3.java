package Thread;

public class MultithreadExample3 {

	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters());
		thread.start();
		char arr[] = {'ぁ','い','ぇ','ぉ','け','げ',
				'さ','し','じ','ず','せ','ぜ','そ','ぞ'};
		
		for(char ch: arr)
			System.out.print(ch);

	}
}

class SmallLetters implements Runnable {
	public void run() {
		for(char ch = 'a' ;ch<= 'z'; ch++)
			System.out.print(ch);
	}
}

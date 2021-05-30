
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player("Batman");
		Player player2 = new Player("Robin");
		
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
		for(int i = 0; i < 26 ; i++){
			Cards player1Card = player1.flip();
			Cards player2Card = player2.flip();
			
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			}
			
			else if(player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
			}
			else {
				player1.incrementScore();
				player2.incrementScore();
			}
		}
		
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		System.out.println("Player 1 Score: " + player1Score + " Player 2 Score: " + player2Score);
		
		if(player1Score == player2Score) {
			System.out.println("Player 1 and Player 2 came to a Draw.");
		}
		else if(player1Score > player2Score) {
			System.out.println("Player 1 Won.");
		}
		else {
			System.out.println("Player 2 Won.");
		}
		
		}

	}

package caveExplorer;

public class GameStartEvent implements Playable {

	private static final String[] SEQUENCE_1 = { "<Pikachu runs up to you>",
			"Hi, you don't look like your from around here.", "do yo like puzzles?", };
	private static final String[] SEQUENCE_2 = { "you're going to have so much fun playing my 2D game" };

	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
	readSequence(SEQUENCE_1);
	while(CaveExplorer.in.nextLine().toLowerCase().indexOf("yes")<0){
		CaveExplorer.print("C'mon! Im bored of eating Pokeblocks");
	}
	readSequence(SEQUENCE_2);
	CaveExplorer.inventory.setHasMap(true);
	}

	public static void readSequence(String[] seq) {
	for(String s : seq){
		CaveExplorer.print(s);
		CaveExplorer.print("- - - press enter - - -");
		CaveExplorer.in.nextLine();
	}
	}
}

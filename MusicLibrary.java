package Assignment3;

import java.util.Random;

public class MusicLibrary {
	String[] songs;
	int songCount;

	public MusicLibrary(int maxSongs) {
		        this.songs = new String[maxSongs];
		        this.songCount = 0;
		    }

	public void addSong(String song) {
		if (songCount < songs.length) {
			songs[songCount++] = song;
			System.out.println("Song added: " + song);
		} else {
			System.out.println("Music library is full! You Cannot add more songs!!");
		}
	}

	public void removeSong(String song) {
		int index = findIndex(songs, song, songCount);
		if (index != -1) {
			shiftLeft(songs, index, songCount);
			songCount--;
			System.out.println("Song removed: " + song);
		} else {
			System.out.println("Song not found: " + song);
		}
	}

	public void playRandomSong() {
		if (songCount > 0) {
			Random random = new Random();
			int randomIndex = random.nextInt(songCount);
			System.out.println("Now playing:- " + songs[randomIndex]);
		} else {
			System.out.println("There is No songs in the library to play!!");
		}
	}

	private int findIndex(String[] array, String value, int count) {
		for (int i = 0; i < count; i++) {
			if (array[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	private void shiftLeft(String[] array, int index, int count) {
		for (int i = index; i < count - 1; i++) {
			array[i] = array[i + 1];
		}
		array[count - 1] = null;
	}

	public void displaySongs() {
		System.out.println("Songs in Music Library:");
		for (int i = 0; i < songCount; i++) {
			System.out.println((i + 1) + ". " + songs[i]);
		}
	}

	public static void main(String[] args) {
		MusicLibrary ml = new MusicLibrary(5);
		ml.addSong("Winter Ahead");
		ml.addSong("My Universe");
		ml.addSong("Seven Bts");
		ml.displaySongs();
		ml.removeSong("Seven Bts");
		ml.displaySongs();
		ml.playRandomSong();
		ml.removeSong("My Universe");
		ml.playRandomSong();
	}
}


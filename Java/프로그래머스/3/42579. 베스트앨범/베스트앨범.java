import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<String> genreList = new ArrayList<>(map.keySet());
        
        genreList.sort((a, b) -> map.get(b) - map.get(a));
        
        ArrayList<Song> songList = new ArrayList<>();
        
        for (int i = 0; i < genres.length; i++) {
            songList.add(new Song(i, plays[i], genres[i]));
        }
        
        songList.sort((a, b) -> {
            if (a.getPlay() == b.getPlay()) {
                return a.getNumber() - b.getNumber();
            }
            return b.getPlay() - a.getPlay();
        });
           
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (String g : genreList) {
            int count = 0;
            
            for (Song s : songList) {
                if (s.getGenre().equals(g)) {
                    answerList.add(s.getNumber());
                    count++;
                    if (count >= 2) {
                        break;
                    }
                }
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}

class Song {
    private int number;
    private int play;
    private String genre;
    
    public Song(int number, int play, String genre) {
        this.number = number;
        this.play = play;
        this.genre = genre;
    }
    
    public int getNumber() {
        return number;
    }
    
    public int getPlay() {
        return play;
    }
    
    public String getGenre() {
        return genre;
    }
}
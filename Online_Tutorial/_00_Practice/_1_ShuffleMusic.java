/*
In this program some random number of songs will be selected
The they will be played in a shuffled manner
Without repeating any song
 */
package _00_Practice;

public class _1_ShuffleMusic {
    
    public static void main(String args[]) {
        //Let maximum be 20
        int numberOfSongs = (int) Math.round(Math.random() * 20);
        int songCount = numberOfSongs;
        int songFlag[] = new int[numberOfSongs];
        int currentSong;
        System.out.println("Number of songs: " + numberOfSongs);
        while (songCount != 0) {
            currentSong = (int) Math.round(Math.random() * 20);
            if (currentSong != 0 && currentSong <= numberOfSongs) {
                if (songFlag[currentSong - 1] == 0) {
                    songCount--;
                    songFlag[currentSong - 1] = 1;
                    System.out.format("Song %d played\n", currentSong);
                } else
                    System.out.format("!!!!!Song %d skipped\n", currentSong);
            }
        }
        //Testing purpose to check after all songs being played, each status must turn 1
        for(int i = 0; i < numberOfSongs; i++)
            System.out.format("Song No %d status %d\n", i + 1, songFlag[i]);        
        }
    }

/*
        ******************************** VARIABLE DESCRIPTION********************************
       Variable                        Type                    Description
1.      numberOfSongs                   int                      to store number of songs to be played
2.      songCount                       int                      count the remaining songs to be played
3.      songFlag                        int,Array                stores 0 or 1, 0 : not played, 1 : played
4.      currentSong                     int                      current song in the loop
5.      i                               int                      for checking the status of songs played or not
 */

/*
****************************** OUTPUT ******************************
Number of songs: 18
Song 12 played
Song 7 played
Song 8 played
Song 18 played
Song 2 played
Song 17 played
Song 5 played
!!!!!Song 12 skipped
Song 16 played
!!!!!Song 2 skipped
Song 1 played
!!!!!Song 2 skipped
!!!!!Song 17 skipped
Song 6 played
Song 3 played
!!!!!Song 16 skipped
!!!!!Song 3 skipped
!!!!!Song 8 skipped
!!!!!Song 1 skipped
!!!!!Song 8 skipped
Song 15 played
!!!!!Song 5 skipped
!!!!!Song 8 skipped
!!!!!Song 16 skipped
Song 4 played
!!!!!Song 5 skipped
!!!!!Song 18 skipped
!!!!!Song 3 skipped
Song 14 played
!!!!!Song 18 skipped
!!!!!Song 8 skipped
!!!!!Song 17 skipped
!!!!!Song 5 skipped
Song 11 played
!!!!!Song 6 skipped
!!!!!Song 8 skipped
!!!!!Song 4 skipped
Song 9 played
!!!!!Song 5 skipped
!!!!!Song 16 skipped
!!!!!Song 16 skipped
!!!!!Song 17 skipped
!!!!!Song 1 skipped
!!!!!Song 15 skipped
!!!!!Song 18 skipped
!!!!!Song 11 skipped
!!!!!Song 8 skipped
!!!!!Song 15 skipped
!!!!!Song 6 skipped
!!!!!Song 15 skipped
Song 10 played
!!!!!Song 4 skipped
!!!!!Song 15 skipped
!!!!!Song 3 skipped
!!!!!Song 8 skipped
!!!!!Song 5 skipped
!!!!!Song 6 skipped
!!!!!Song 7 skipped
!!!!!Song 18 skipped
!!!!!Song 6 skipped
!!!!!Song 3 skipped
!!!!!Song 16 skipped
!!!!!Song 15 skipped
!!!!!Song 9 skipped
!!!!!Song 15 skipped
!!!!!Song 3 skipped
!!!!!Song 14 skipped
!!!!!Song 2 skipped
!!!!!Song 16 skipped
!!!!!Song 15 skipped
!!!!!Song 16 skipped
!!!!!Song 1 skipped
!!!!!Song 14 skipped
!!!!!Song 15 skipped
!!!!!Song 3 skipped
!!!!!Song 10 skipped
!!!!!Song 9 skipped
!!!!!Song 5 skipped
!!!!!Song 3 skipped
!!!!!Song 11 skipped
!!!!!Song 15 skipped
!!!!!Song 4 skipped
!!!!!Song 15 skipped
!!!!!Song 2 skipped
!!!!!Song 12 skipped
Song 13 played
Song No 1 status 1
Song No 2 status 1
Song No 3 status 1
Song No 4 status 1
Song No 5 status 1
Song No 6 status 1
Song No 7 status 1
Song No 8 status 1
Song No 9 status 1
Song No 10 status 1
Song No 11 status 1
Song No 12 status 1
Song No 13 status 1
Song No 14 status 1
Song No 15 status 1
Song No 16 status 1
Song No 17 status 1
Song No 18 status 1
 */


import java.io.*;
import java.util.Scanner;

public class ReadData{
    public static void scan(String fileName) throws Exception
    {
 double avg1950 = 0; double avg1960 = 0; double avg1970 = 0; double avg1980 = 0; double avg1990 = 0; double avg2000 = 0; double avg2010 = 0;
int songs1950 = 0; int songs1960 = 0; int songs1970 = 0; int songs1980 = 0; int songs1990 = 0; int songs2000 = 0; int songs2010 = 0;

String artist, title, year, genre, duration, shakeability, danceability, obscenity, loud, topic;
String longestSong = null; String  lowestShakeability = null;
//artist_name,track_name,release_date,genre,len,shake the audience,obscene,danceability,loudness,topic
        int songsFrom1982 = 0; int songsFrom1998 = 0; int songsFrom2011 = 0;

        int danceable = 0; 
        int tempLength = 0; double tempShakeability = 1;
        int songs = 0;

      

        Scanner sc  =new Scanner(new File("src/" +fileName));
        sc.useDelimiter(",");

while(sc.hasNext()) {
//for(int i = 1; i < 30; i++){
   //artist_name,track_name,release_date,genre,len,shake the audience,obscene,danceability,loudness,topic, 

    songs++;
    artist=sc.next();
    title=sc.next();
    year=sc.next();
    genre=sc.next();
    duration=sc.next();
    shakeability=sc.next();
    obscenity=sc.next();
    danceability=sc.next();
    loud=sc.next();
    topic = sc.next();

    
     if (Integer.parseInt(year) == 1982) songsFrom1982++;
     if (Integer.parseInt(year) == 1998) songsFrom1998++;
     if (Integer.parseInt(year) == 2011) songsFrom2011++;

     if (Double.parseDouble(danceability)>0.75) danceable++;

     if (Integer.parseInt(duration) > tempLength) {
        tempLength = Integer.parseInt(duration);
        longestSong = title;
     }

     if (Double.parseDouble(shakeability) < tempShakeability) {
      tempShakeability = Double.parseDouble(shakeability);
      lowestShakeability = title;
   }

     if (1950 <= Integer.parseInt(year) && Integer.parseInt(year) <1960) {
        avg1950 += Double.parseDouble(obscenity);
        songs1950++;
     }

     if (1960 <= Integer.parseInt(year) && Integer.parseInt(year) <1970) {
        avg1960 += Double.parseDouble(obscenity);
        songs1960++;
     }

     if (1970 <= Integer.parseInt(year) && Integer.parseInt(year) <1980) {
        avg1970 += Double.parseDouble(obscenity);
        songs1970++;
     }

     if (1980 <= Integer.parseInt(year) && Integer.parseInt(year) <1990) {
        avg1980 += Double.parseDouble(obscenity);
        songs1980++;
     }
     
     if (1990 <= Integer.parseInt(year) && Integer.parseInt(year) <2000) {
        avg1990 += Double.parseDouble(obscenity);
        songs1990++;
     }

     if (2000 <= Integer.parseInt(year) && Integer.parseInt(year) <2010) {
        avg2000 += Double.parseDouble(obscenity);
        songs2000++;
     }

     if (2010 <= Integer.parseInt(year) && Integer.parseInt(year) <2020) {
        avg2010 += Double.parseDouble(obscenity);
        songs2010++;
     }

   //artist_name,track_name,release_date,genre,len,shake the audience,obscene,danceability,loudness,topic, 

    System.out.println("Artist :" + artist);
    System.out.println("Title " + title);
    System.out.println(year);
    System.out.println(genre);
    System.out.println("Duration " + duration);
    System.out.println(shakeability);
    System.out.println(obscenity);
    System.out.println(danceability);
    System.out.println("loud: "+loud);
    System.out.println("topic: "+topic);
    

}
sc.close();
avg1950 /= songs1950;
avg1960 /= songs1960;
avg1970 /= songs1970;
avg1980 /= songs1980;
avg1990 /= songs1990;
avg2000 /= songs2000;
avg2010 /= songs2010;

System.out.println("Total number of songs: "+songs);
    System.out.println("Number of songs from 1982: "+ songsFrom1982);
    System.out.println("Number of songs from 1998: "+ songsFrom1998);
    System.out.println("Number of songs from 2011: "+ songsFrom2011);
   System.out.println("longest song:"+ longestSong);
   System.out.println("songs with dancebility beyond 0.75: "+ danceable);
   System.out.println("song with lowest shakeability: "+ lowestShakeability);
   System.out.println("average obscenity level for 1950-1959: "+avg1950);
   System.out.println("average obscenity level for 1960-1969: "+avg1960);
   System.out.println("average obscenity level for 1970-1979: "+avg1970);
   System.out.println("average obscenity level for 1980-1989: "+avg1980);
   System.out.println("average obscenity level for 1990-1999: "+avg1990);
   System.out.println("average obscenity level for 2000-2009: "+avg2000);
   System.out.println("average obscenity level for 2010-2019: "+avg2010);
    }
    
    

}

// A sample program to add sound into your app in android studio.

// First, create a folder inside the your_project/app/res folder named raw. Here, you will store all the media(.mp3 files).
// Now add a button widget in the layout so whenever the user clicks on the button, the sound plays. Set the ttributes according to your wish.

// Now, in the MainActivity.java file declare and initialize the button.
Button button_name;
button_name = findViewById(R.id.button_id);

// Now declare a mediaPlayer object.
MediaPlayer media_player_name;

// Set an onClick listener for the button. 
button_name.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        media_player_name.start(); // This starts the media player and the mp3 file will play when the user clicks the button
    }
});

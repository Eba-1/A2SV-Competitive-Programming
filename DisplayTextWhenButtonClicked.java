// This little program displays a message on the console log whenever the user clicks the button.
// First of all, you need to create a button and give it an id. Inside the MainActivity.java file write the below code:
// And add onclick attributes in the XML file
// Add this method
public void class_name(View view_name) {
      Log.view_name(tag:"button", msg:"Button Clicked");      
}  


// Another way to do this is setting onclick listener programatically.
// Remove the onclick attributes that you added from the XML file
// Declare a button view at the top
Button button_name;

// Then inside the onCreate method, write this code
button_name = findViewById(button_id); 

// Now create an onclick listener method right below it
button_name.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
            class_name(); // calls the method
      }
});

// Add this method
public void class_name() {
      Log.view_name(tag:"button", msg:"Button Clicked");      
} 


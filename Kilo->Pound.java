// A simple program that will convert a number that a user enter into its pound equivalent
// Create two text fields and a button. Style them as per your wish and write this code inside the MainActivity.java file.
// Declare the widgets you just added and initialize them inside the onCreate method.

Button btn!
TextView tvw!
TextView tvw2!
  
var_name = findViewById(R.id.widget_id);  // write this three times for the other widgets with different var_name and respective id.

// Set an onlick listener for the button. (i.e., you will be setting what actions need to be taken when the user enters a number and clicks the button. 
// In this case, we will show the equivalent of that number in pounds.) Inside the onCreate method, write this one:

String str1 = tvw.getText().toString();
Double num = Double.pasreInt(str1);
Double res = num * 2.205;
tv2.setText(res);

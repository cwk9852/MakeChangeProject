## Make Change (Cash Register) Project

### Description

This application uses mod operator to make change from a price and payment. It takes two user input's and determines the number of each denomination to return to the customer.

### Technologies Used
Java, git, Eclipse, 	vi

### Lessons Learned
Power of the mod operator, as well as simple if-statements. 

One of the biggest bugs here was getting the 0.01 (one penny) off rounding error. Simple solution was adding 0.01f to double change, before passing it to the method makeChange(change). 

This was my second attempt with this, lesson learned from the first attempt: I hurt myself by trying "get Fancy" with an array and a switch. At that time I didn't know how to implement what I envisions, and I wasted an embaressing amount of time trying to do it "my way." In doing so, it caused me to miss the point of the excercise. 

Keep It Simple, Follow Directions, Don't Reinvent the Wheel
<h1>Aplaying Coroutine</h1>
This project demonstrates the use of Kotlin coroutines in an Android application to simulate cooking at a restaurant process. The program illustrates how tasks can be executed sequentially on the main thread and concurrently using coroutines on a background thread.<br>

<h2>Description</h2>
The program consists of a MainActivity class simulating a chef preparing three dishes. The dishes are prepared in two different ways:<br>
1- Sequential Execution: The main chef prepares each dish one after another on the main thread.<br>
2- Concurrent Execution: Three additional chefs (coroutines) prepare the dishes simultaneously on a background thread.<br><br>
The program also includes exception handling to manage any errors that may occur during the execution of the coroutines.<br>

<h2>Code Overview</h2>
- MainActivity: The main activity where the cooking simulation takes place.<br>
- onCreate(): This method contains the logic for both sequential and concurrent dish preparation.<br>
- dish_1(), dish_2(), dish_3(): Functions that simulate the preparation of each dish by sleeping for 5 seconds.<br>
- The exception handling will catch and log any exceptions the coroutines throw.<be>

<h2>Screanshot for the output</h2>
<img width="480" alt="Image" src="https://github.com/user-attachments/assets/b7493309-840b-48d7-ade8-f0d7cff2a44a" />

<h2>How to Run the Program</h2>

<h3>Prerequirment</h3>
- Android Studio installed on your machine.<br>
- An Android device or emulator to run the application.<br>

<h3>Steps</h3>
1- Clone the Repository<br>
2- Open the Project in Android Studio<br>
3- Click on Build in the top menu and select Make Project to build the project.<br>
4- Connect an Android device or start an emulator.<br>
5- Click on Run in the top menu and select Run 'app'.<br>
6- The application will install and launch on your device/emulator<br>
7- Open the Logcat window in Android Studio to view the output.<br>
8- You should see logs indicating the start and end times of the dish preparation, both sequentially and concurrently.<br>




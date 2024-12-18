# Recipe Recommender - CSC207 Group 166

[![Typing SVG](https://readme-typing-svg.demolab.com?font=Fira+Code&pause=1000&width=435&lines=Recipe+Recommender;Based+on+season;Based+on+ingredient;Based+on+your+preference)](https://git.io/typing-svg)

## Table of Contents

1. [Authors](#authors)
2. [Summary](#summary)
3. [Installation Instructions](#installation-instructions)
    - [Prerequisites](#prerequisites)
    - [Clone the Repository](#clone-the-repository)
    - [Running the Application](#running-the-application)
    - [Notes](#notes)
4. [Instructions on App Usage](#instructions-on-app-usage)
5. [Feedback](#feedback)
6. [Known Errors](#known-errors)
7. [Contributing](#contributing)
    - [How to Contribute](#how-to-contribute)
    - [Merge Request Guidelines](#merge-request-guidelines)
8. [License](#license)


## Authors

Vincent Wang - VincentWangVW<br/>
Laith Al Khoury - laithalkhoury<br/>
Xinni Liu - xinnio<br/>
Yuchen Wang - richardwang1236<br/>
Jiahe Xiang - markxiang8<br/>
Zifei Luo - Zife1Luo<br/>

## Summary

Have you ever opened your pantry and was unsure on what to cook with the things inside? Maybe there is some ingredients you've stored in there for so so long you just don't know how to use. This is why we made Recipe Recommender, an app in which you can input ingredients and their amounts that will take that and generate recipes from it. The app can also store how many items you're willing to buy if you have all items except a few as well as any allergies you may have such as peanuts, dairy, or anything custom and it will try its best to filter recipes with those items out! The app can also generate recipes based off any holidays, if there are any, or the season of the current date. This makes it so that if you're wanting to cook something in a festive mood, you can always use our app! Lastly, there is a custom recipe search which searches recipes based off any word you want! If you're in the mood for burgers, you can search burgers and find some burger related recipes! After generating the recipes, there a menu that shows you how many items you're missing, the name for the recipe, and the recipe URL in which you can open with your browser of choice to view the recipe! <br/>

We made this program because we were all struggling with cooking and many of us had relied on DoorDash for any "non-ramen" meals, we also were unsure of how to cook and wanted some different recipes we could try throughout the year. With that idea, we came up with recipe recommender which helped us empty our pantries of stuff we never really used as well as helping us become better cooks!

## Installation Instructions

### Prerequisites
Ensure the following are installed on your system:
- **Java Development Kit (JDK)**: Version 17 or higher  
  [Download JDK 17+ here](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- **Git**: Version 2.25.1 or higher  
  [Download Git here](https://git-scm.com/downloads)

---

### Clone the Repository
1. Open a terminal or command prompt.
2. Run the following command to clone the project:
   ```bash
   git clone https://github.com/VincentWangVW/csc207_project_group_166.git
   ```

---

### Running the Application
1. Navigate to the following folder in the cloned repository:  
   **`csc207_project_group_166/src/main/java/app/`**
2. Locate and run the main file to start the application.
3. The main screen of the program will display.

---

### Notes
- The program is designed to run on all operating systems.
- macOS users may experience color display issues.

## Instructions on App Usage

After running the program you are met with the screen below. There are four sections: Ingredients Manager, User Info Manager, Date Information, and Generation Manager. <br/>
![image](https://imgur.com/PHlMZKT.png) <br/>

From pressing the "Ingredients" button, you will enter the Ingredients Manager where you can add, remove, +/- ingredients, and also return to the main menu. <br/>
![image](https://imgur.com/4g6vQ4A.png) <br/>

From pressing the "User Info" button, you will enter the User Info Manager where you can check off some dietary restrictions, add and remove allergies, and input how many items you're willing to buy. <br/>
![image](https://imgur.com/XH5eulv.png) <br/>

From pressing the "Date Information" button, you will enter the Date Information Screen where you can see the date, the holiday if there is any holiday, and the current season. <br/>
![image](https://imgur.com/IEoWfwQ.png) <br/>

From pressing the "Generate Recipe" button, you will enter the Recipe Generation setting screen where you can edit settings for your recipe generation. You can choose whether you want it to follow user info, whether to generate it based off ingredients, holiday, season, or custom search. <br/>
![image](https://imgur.com/cMt8l5h.png) <br/>

From pressing the "Generate Recipes" button, you will then be brought to the last screen, the Generated Recipes Manager, where the generate button will then generate all the recipes based off your selections and display them with the information of recipe name, url, and how many missing ingredients. The missing ingredients will default to 0 for any option that is not "ingredients". <br/>
![image](https://imgur.com/waUyjzP.png) <br/>

## Feedback

If wanting to give feedback or rating the app, please fill out this form: https://forms.gle/tBkVdRL5jiMKvqyA6.

## Known Errors

Hard to run all tests at once because of API Limits. If wanting to run the test cases, make sure to run each test folder by folder, sometimes you may need to replace the api key. You can obtain one from [here](https://spoonacular.com/food-api), make sure to replace the API key in the SpoonacularDao.Java file. You also may need to run each test individually because free API plan only has one call per second.

## Contributing

We welcome contributions to the **Recipe Recommender** project! Whether it's fixing bugs, improving documentation, or suggesting new features, we encourage the community to help us make this project even better.

### How to Contribute

1. **Check the Issues Tab**  
   Visit the [GitHub Issues tab](https://github.com/VincentWangVW/csc207_project_group_166/issues) to see a list of open issues or feature requests. You can also create a new issue if none match your idea.

2. **Fork the Repository**
    - Click the "Fork" button in the top-right corner of the repository.
    - Clone your forked repository to your local machine:
      ```bash
      git clone https://github.com/YOUR_USERNAME/csc207_project_group_166.git
      ```  
    - Set up the upstream repository:
      ```bash
      git remote add upstream https://github.com/VincentWangVW/csc207_project_group_166.git
      ```

3. **Create a Branch**
    - Always work on a new branch to keep your changes separate from the main branch:
      ```bash
      git checkout -b feature-name
      ```  

4. **Make Your Changes**
    - Write clean, readable, and well-documented code.
    - Test your changes to ensure they work as expected.

5. **Commit Your Changes**
    - Add descriptive commit messages:
      ```bash
      git add .
      git commit -m "Add detailed description of the changes"
      ```

6. **Push Your Changes**
    - Push your branch to your forked repository:
      ```bash
      git push origin feature-name
      ```  

7. **Submit a Pull Request (PR)**
    - Go to the original repository and click the **Pull Request** tab.
    - Select your branch and add a clear title and description of your changes.
    - Ensure your PR:
        - References any relevant issue numbers (e.g., `Fixes #123`).
        - Explains why the changes were made and how they work.

---

### Merge Request Guidelines

To increase the chances of your PR being merged:
- Follow the project’s coding style and naming conventions.
- Ensure your branch is up to date with the latest changes from the main branch:
  ```bash
  git fetch upstream  
  git merge upstream/main  


## Liscence

This project is licensed under the MIT License.

MIT License

Copyright (c) 2024 Vincent Wang, Laith Al Khoury, Xinni Liu, Yuchen Wang, Jiahe Xiang, Zifei Luo

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

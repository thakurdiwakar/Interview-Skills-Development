# What is the best way to integrate different stylesheets into a website?

Typically, it depends on how your site is laid out and how users interact with it. The most efficient way, however, would be to use just a single file called styles.css (or something similar). Combining them into a single document is preferable. Loading one file is easier for a client than loading five. In order to change the style, you simply open the styles.css file, scroll down to find the appropriate section, and modify the CSS. The sheet can be linked in your HTML as follows:

```<link rel="stylesheet" href="styles.css">```



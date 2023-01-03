'Locating an element through X Path and CSS

X Path
//tagname[@attribute='value']

Instead of tagname, * can be used as a regular expression
//*[@attribute='value']

CSS
tagname[attribute=value]

Tagname can be left blank in CSS
[attribute=value]

tagname.classname
tagname#id

If classname has spaces, add . instead of spaces

==================================================================================================================

'Locating an element through contains, starts with and ends with

CSS contains
div[name*='userid']
CSS starts with
div[name^='userid']
CSS ends with
div[name$='userid']

X Path contains
//div[contains(@name,'userid')]
X Path starts with
//div[starts-wth(@name,'userid')]
X Path ends with
//div[ends-with(@name,'userid')]

==================================================================================================================

'Locating an element through Parent child Traversing

CSS 
div[data-testid='to-testID-origin']>div>div>input

X Path
//div[@data-testid='to-testID-origin']/div/div/input
Which means / in X path is equivalent to > in css. Hence Parent child traversing is possible in CSS

==================================================================================================================

'Locating the element when there are more than one child element through following sibling concept

There is no concept of following-sibling in CSS (No default tags as such in CSS)

X path
//div[@class='clw8654HT']/following-sibling::li[2]
Here, we are trying to access younger sibling element from elder sibling element. 

==================================================================================================================

'Locating the previous element to the sibling through preceding sibling concept

There is no concept of preceding-sibling in CSS (No default tags as such in CSS)

X path
//div[@class='cnsd628bx']/preceding-sibling::li[1]
Here, we are trying to access elder sibling element from younger sibling element. 

==================================================================================================================

'Locating the element by traversing from child to parent 

There is no concept of child-parent traversing in CSS (No default tags as such in CSS)

X path
//div[@class='clw8654HT']/parent::input
Here, we are trying to access the child node first and then accessing the parent element of that child.

==================================================================================================================

'Locating the element by traversing from parent to child

There is no concept of parent-child traversing in CSS (No default tags as such in CSS)

X path
//span[@class = 'worldwide__list']/child::a[1]
Here, we are trying to access the first child element of a parent node.
Similarly, we can access the subsequent children using a[2], a[3] etc

==================================================================================================================
NOTE : There is no concept like parent or child tags in CSS. But using other techniques we can traverse to child in CSS (using > as explained above)
but there is no technique to traverse from child to parent in CSS.


==================================================================================================================
'Locating the Ancestor elements

There is no concept of ancestor traversing in CSS (No default tags as such in CSS and alternate approach is also not possible)

XPath
Here, we are trying to access the parent, grand parents, great grand parents etc of a child node.
Example : 
td
  label
       input

//input[@id = 'u_0_a']/ancestor::label - This can help us to traverse to label which is parent
//input[@id = 'u_0_a']/ancestor::td - This can help us to traverse to td which is grand parent

One minimize in the DOM -> Parent
Two minimizes in the DOM -> Grand Parent

==================================================================================================================
'Locating the Descendant elements

There is no concept of descendant traversing in CSS (No default tags as such in CSS)

XPath
Here, we are trying to access the children, grand children, great grand children etc of a parent node.
Example : 
div
  p
	input
  p
	input
  p
	input

//div[@class = 'signup_form new']/descendant::p[3]	-  This can help us to traverse to label which is child
//div[@class = 'signup_form new']/descendant::input[2]	-  This can help us to traverse to label which is grand child

One maximize in the DOM -> Child
Two maximize in the DOM -> Grand Child

==================================================================================================================

NOTE : Follow this site for Sibling and ancestor concepts
https://www.scientecheasy.com/2019/08/xpath-axes.html/

==================================================================================================================


'Locating an element through visible text

There is no such concept in CSS

X Path
//div[text()='userid']
//div[contains(text(),'userid']


==================================================================================================================

'Locating an element through index

CSS
input[class*='css-1cwyjr8']:nth-child(1)

X Path
(//input[contains(@class,'css-1cwyjr8')])[1]
There is no index in CSS. Adding index in X path is similar to adding n th child or nth of type in CSS

nth child - parent, number, child
nth of type - parent, child, number
http://total-qa.com/difference-nth-child-nth-type-cssselector/

==================================================================================================================

'Locating an element through Parent-child relationship

CSS
div[name='userid'] h2

X Path
//div[@name='userid'] //h2

==================================================================================================================

'Locating an element through Tagname

CSS
tagname

X Path
//tagname

==================================================================================================================
==================================================================================================================


AND OR in XPath and CSS

'There is no concept of AND OR in CSS.

XPath
AND : //*[@type='submit' and @name='btnReset']
OR : //*[@type='submit' or @name='btnReset']
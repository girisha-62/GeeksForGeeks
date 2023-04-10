<h2><a href="https://practice.geeksforgeeks.org/problems/missing-ranges-of-numbers1019/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Arrays&sortBy=submissions">Missing ranges of numbers</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>Arr</strong><strong> </strong>of <strong>N</strong> positive integers, find&nbsp;the missing elements (if any) in the range <strong>0</strong> to <strong>max</strong> of <strong>Arr<sub>i</sub></strong>. </span><br>
<br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 5
Arr[] = {62, 8, 34, 5, 332}
<strong>Output:</strong> 0-4 6-7 9-33 35-61 63-331
<strong>Explanation:</strong> Elements in the range 0-4, 6-7, 
9-33, 35-61 and 63-331 are not present.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4
Arr[] = {13, 0, 32, 500}
<strong>Output:</strong> 1-12 14-31 33-499
<strong>Explanation:</strong>&nbsp;Elements in the range 1-12, 
14-31 and 33-499 are not present.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>findMissing()</strong>&nbsp;which takes the array of integers&nbsp;<strong>arr</strong>&nbsp;and its size&nbsp;<strong>n&nbsp;</strong>as input parameters and returns a&nbsp;string&nbsp;denoting the missing elements. If<br>
there are more than one missing, collate them using hyphen (-) and&nbsp;separate each different range with a space<strong>.&nbsp;</strong>If there are no missing element then return "<strong>-1</strong>".</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints</strong><br>
1 &lt;=&nbsp;N &lt;= 10<sup>7</sup><br>
0 &lt;= Arr<sub>i</sub> &lt;= 10<sup>7</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;
# 循环遍历commit版本号文本的每一行
for line in `cat ../commitNos`
do
 echo $line
# 把版本号赋值给变量
 commitNo=$line
# 撤销当前版本号的commit操作
 git revert $commitNo
# 撤销后提交到本地仓库
 git add .

 git commit -m 'revertcommitNo'
# 推到远程github主分支上
 git push origin master
done

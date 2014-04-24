command="'git rm --cached --ignore-unmatch $1'"
echo $command
git filter-branch --force --index-filter "git rm --cached --ignore-unmatch $1" HEAD


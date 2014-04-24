command="'git rm --cached --ignore-unmatch $1'"
echo $command
git filter-branch --force --index-filter "/home/pfares/SMB215_Rest/run.sh $1" --prune-empty --tag-name-filter cat -- --all


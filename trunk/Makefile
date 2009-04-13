HOSTNAME=cpjobling.org.uk
DOCROOT=/home/default/cpjobling.org.uk/user/htdocs

get-wiki:
	rsync -avuzb --exclude '*~' --exclude cache cpjobling@$(HOSTNAME):$(DOCROOT)/dokuwiki/data/pages/at-m42/ wiki



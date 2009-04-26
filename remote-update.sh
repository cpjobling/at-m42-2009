#!/bin/sh

echo "Updating code tree..."
svn update
echo "Exporting code distribution..."
svn export . at-m42-source
echo "Zipping ..."
zip -m -r at-m42-source.zip at-m42-source
echo "Done..."
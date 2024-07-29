mysqldump -uroot -p1234 springboot_templates --extended-insert=FALSE > springboot_templates.sql && echo "I dump springboot_templates database successfully !" || echo "failure"
timeout /t 1

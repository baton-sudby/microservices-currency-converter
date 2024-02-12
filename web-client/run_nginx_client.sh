docker run --name nginx-web-client \
	-v "/Users/vladislavustinov/Desktop/pet-projects/slurm-test/web-client/build/":/usr/share/nginx/html:ro \
	-v "/Users/vladislavustinov/Desktop/pet-projects/slurm-test/web-client/conf/nginx.conf":/etc/nginx/nginx.conf:ro \
	-P -d -p 3000:80 nginx:1.23.4-perl
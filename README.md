# spring-microservices
Sprint Boot microservices example

1. First we need to set up DB in cloud and connect to it through Cloud SQL Proxy.
2. Go to Cloud SQL to set up instance and then create db.
3. Go to Compute instances and specify instance (add access to cloud sql for service account and allow http-traffic, also enable Cloud SQL Admin API)
4. Connect to compute instance. 
   Set up enviroment: 
   sudo apt-get update
   sudo apt-get install postgresql-client
   wget https://dl.google.com/cloudsql/cloud_sql_proxy.linux.amd64 -O cloud_sql_proxy
   chmod +x cloud_sql_proxy
5. Launch proxy: <sub> ./cloud_sql_proxy -instances=CONNECTION_STRING_FROM_CLOUD_SQL=tcp:5432 </sub>
6. Connect to proxy: <sub> psql "host=127.0.0.1 port=5432 sslmode=disable dbname=DB_NAME user=postgres" </sub>

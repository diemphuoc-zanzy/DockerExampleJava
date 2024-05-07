## Lệnh docker


### lệnh đăng nhập:
docker login -u tên đăng nhập


### lệnh tạo image
``` dockerfile
docker build --tag tên của image .
```
### lệnh update name tag image
``` dockerfile
docker tag tên image tên mới của image
```

### lệnh đẩy lên docker hub
``` dockerfile
docker push: tên đăng nhập/images:tag
```

### lệnh tạo 1 container
``` dockerfile
docker run -dp 8085:8080 \--name springboot-docker-container \-v "$(pwd):/app" \diemphuoc2626/springboot-docker:1.0
```

### lệnh update & re-run:
``` dockerfile
docker restart tên container
```

### lệnh tạo network
``` dockerfile
docker network create springboot-app-network
```

### cấu hình docker-compose
chạy lệnh compse-up
```dockerfile
docker-compose -f docker-compose.yml -f docker-compose.relational.ci.yml up -d
```

### xóa cấu hình docker-compose
```dockerfile
docker-compose -f docker-compose.yml -f docker-compose.relational.ci.yml down
```
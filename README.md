# 合理用药
## 打包方式
1. `gradlew thinJarAndCache`: 自定义任务，打jar包，并缓存依赖到指定目录
2. `docker-compose build`，重新生成镜像
3. `docker-compose up -d`，即可启动所有镜像

## TODO
1. 合并仓库，抽取公共gradle配置到父project中


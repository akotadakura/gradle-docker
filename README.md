# Gradle - Docker の雛形プロジェクト
- このプロジェクトについて
- 使用法
- Gradleについて
- Javaについて
- コンテナについて

 ## このプロジェクトについて
今後java on dockerのツールを作ろうと思い、  
そのベースとなるものを作っておきたかったという動機のもと作成。  
このプロジェクトそのものに意味はない。
ただ雛形としてはまぁ便利かと。  
 
 ## 使用法
 以下の手順を踏めば、gradleコマンドを打つだけで、  
 Hello worldバッチがコンテナで実行され、そのコンテナは自然と消滅するというところまでいける。
#### 1. ソースを落としてくる
 ```shell script
$ git clone git@github.com:akotadakura/gradle-docker.git
```
資材がなかったらまぁ当然動かない。  
落としてくるのはgit cloneを想定しているが、zipでも大丈夫でなかろうか？  
（検証はしていない、駄目だとしても対応する気もない）

#### 2. イメージ作成実行
```shell script
$ cd 'cloned path'
(mac)$ ./gradlew shadowJar
(mac)$ ./gradlew docker
(win)$ .\gradlew shadowJar
(win)$ .\gradlew docker
``` 

#### 3. コンテナ実行
```shell script
$ gradlew dockerRun
# 終わったらイメージの削除
$ docker rmi gradle-docker:[現バージョン]
```

## Gradleについて
今回使用したものはGradle6.6.1。  
とはいえ、ラッパーも格納しているため、PCにインストールは不要。

## Javaについて
バージョンは11 LTS。Amazon correttoである。  
とはいえ実行環境はContainerであり、Gradleが動けばバージョンはなんでもよかろう、と。

## コンテナについて
AWS amazonlinuxのイメージ使用。  
corretto のインストールが捗る。  
とはいえ、イメージサイズが700MBオーバーなのがなぁ...  
いっそubuntuでcorretto使うのもありかと思っている。サイズには圧倒的利がある。
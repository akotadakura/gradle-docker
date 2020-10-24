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
形ばかりにライセンスも主張しておく、が、別に個人・商業問わず使ってもらって構わんよ
 
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
(mac)$ ./gradlew docker
(win)$ .\gradlew docker
``` 
なお、dockerタスクを実行すると、  
本チャンのimage作成が入る前にtest, jar buildがもれなくついてくる(当たり前だよなぁ)

#### 3. コンテナ実行
```shell script
(mac)$ ./gradlew dockerRun
(win)$ .\gradlew dockerRun
# 終わったらイメージの削除
$ docker rmi gradle-docker:[現バージョン]
```

#### 4. コードフォーマッティング
本来は、特にフォーマットチェックもテスト前に入れるほうがいいが、  
いったんはlinter含めて様子を見るとしよう。
```shell script
# format済み？のチェック
(mac)$ ./gradlew verifyFormat
(win)$ .\gradlew verifyFormat
# formatだオラーン
(mac)$ ./gradlew format
(win)$ .\gradlew format
```

## Gradleについて
今回使用したものはGradle6.6.1。  
とはいえ、ラッパーも格納しているため、PCにインストールは不要。

## Javaについて
バージョンは11 LTS。Amazon correttoである。  
とはいえ実行環境はContainerであり、Gradleが動けばバージョンはなんでもよかろう、と。  
IDEではランタイム選ぶから、まぁ何かのjava 11入れとけば間違いない。

## コンテナについて
AWS amazonlinuxのイメージ使用  
corretto のインストールが捗る。  
とはいえ、イメージサイズが700MBオーバーなのがなぁ...  
いっそubuntuでcorretto使うのもありかと思っている。サイズには圧倒的利がある。
---
Logger
---

#### 项目概述

参考 [slf4j](https://github.com/qos-ch/slf4j) 实现的 api 与实现分离的日志框架。

![](https://i.loli.net/2021/05/09/Db7eaw3ERxzN6yr.png)

在使用时，我们需要依赖一个 log-api 模块和仅一个实现模块（比如 log-impl-1）。然后在打日志时，我们是不关心具体实现的，所使用的类都是在 log-api 模块的。

#### 实现原理

那么是如何做到静态绑定的呢？

其实是在 log-api 里面有一个空实现（对应的就是 StaticLoggerBinder）用于欺骗编译器，但是在打包时并不会改该实现类打进去。而每个实现模块其实都有一个 StaticLoggerBinder 类，这样在运行时就会使用对应的实现模块里面的 StaticLoggerBinder 类咯。

在 release 模式下，我们需要去掉 api 模块里面的 StaticLoggerBinder 类，不然在合并 dex 时会发现有多个相同的类就会出错，所以需要在 release 下去掉 log-api 模块里面的 StaticLoggerBinder 类，具体就是在 log-api 的 build.gradle 文件里添加：

```groovy
// 在 release 时会把该类剔除，但是在 debug 时并不会
jar {
    exclude('top/omooo/log/imp/StaticLoggerBinder.class')
}
```


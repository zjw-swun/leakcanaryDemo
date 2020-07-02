# LeakCanaryDemo
leakCanary 2.x之后使用contentprovider 默认开启分析，本案例演示如何关闭
提供一个LeakCanaryCloseProvider  contentprovider  onCreate方法
``LeakCanary.config = LeakCanary.config.copy(dumpHeap = CanaryEnable)``
来关闭

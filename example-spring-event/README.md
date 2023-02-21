# Spring事件

## 事务事件

```shell
@EventListener是普通事件监听器

@TransactionalEventListener事务的的事件监听器,事务监听器可以绑定到事务的阶段.比如事务提交成功或回滚后才触发,
@TransactionalEventListener包装了@EventListener注解,是普通监听器的加强,但监听器方法是通过回调触发的,即在事务进行commit或者rollback的时候会回调监听器方法进行回调.

发布方式和普通事件的发布方式是一样的,但事务事件必须在事务中发布.如果发布了"事务事件", 并且事件类型和某些普通监听器监听的事件类型一致,那么普通监听器也会被触发.
@TransactionalEventListener和@EventListener一样,都是同步处理,即是同一个线程处理事件和发布事件的,所以还会阻塞线程,但是可以使用@Async进行异步任务处理.

在默认情况下仅仅会被事务中发布的事件触发,如果需要在没有事务也能当作普通时间监听器触发,那么需要将fallbackExecution属性设置为true.
```

## 参考资料
[当我准备用SpringEvent优雅的解耦时，连续两个bug把我搞懵了](https://www.toutiao.com/article/7174392898270675496)


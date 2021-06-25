/**
 * 定义一个函数，用来获取指定元素的当前的样式
 * 参数：
 *      obj 要获取样式的元素
 *      name 要获取的样式名
 *
 *      对象的属性没定义则返回undifine的
 *
 */
function getStyle(obj, name) {
    if (window.getComputedStyle) {
        return getComputedStyle(obj, null)[name];
    } else {
        return obj.currentStyle[name];
    }

};


/**
 *
 * @param obj 动画对象
 * @param target 动画对象的目标位置
 * attr:要执行动画的样式 left top width
 * @param speed 移动的速度
 */
function move(obj, attr, target, speed, callback) {
    // 关闭上一个定时器
    clearInterval(obj.timer);

    // 获取元素目前的位置
    var current = parseInt(getStyle(obj, attr));
    // 判断速度正负
    if (current > target) {
        speed = -speed;
    }

    // 向执行动画的对象中添加一个timer属性，用来保存它自己的定时器的标识
    obj.timer = setInterval(function () {

        // 获取box1的原来的left值
        var oldValue = parseInt(getStyle(obj, attr));


        var newValue = oldValue + speed;

        if((speed < 0 && newValue < target) || (speed > 0 && newValue > target)) {
            newValue = target;
        }
        obj.style[attr] = newValue + "px";

        if (newValue == target) {
            clearInterval(obj.timer);
            callback && callback();
        }
    }, 30);
}


package com.FruitSalesPlatform.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一响应格式
 * @author lsc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {

	private Integer code;

	private String msg;

	private Object data;

	private R(ResultCodeEnum resultCodeEnum){
		this.code= resultCodeEnum.getCode();
		this.msg=resultCodeEnum.getMsg();
	}

	/**
	 * 返回不带数据的成功
	 */
	public static R success(){
		return new R(ResultCodeEnum.SUCCESS);
	}


	/**
	 * 返回不带数据的失败
	 * 默认状态码
	 */
	public static R error(){
		return new R(ResultCodeEnum.ERROR);
	}
	/**
	 * 返回不带数据的失败
	 */
	public static R error(ResultCodeEnum resultCodeEnum){
		return new R(resultCodeEnum);
	}

	/**
	 * 添加数据
	 * 如果data未初始化则初始化data
	 * 返回this形成链式调用
	 */
	public R put(Object data){
		this.data=data;
		return this;
	}

}

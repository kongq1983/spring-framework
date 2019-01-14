package com.kq.util;

import com.kq.bean.Employee;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ValidatorUtil
 *
 * @author kq
 * @date 2019-01-11
 */
public class ValidatorUtil {

	private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

	public static <T> Map<String, StringBuilder> validate(T obj) {
		Map<String, StringBuilder> errorMap = null;
		Set<ConstraintViolation<T>> set = validator.validate(obj, Default.class);

		if (set != null && set.size() > 0) {
			errorMap = new HashMap<String, StringBuilder>();
			String property = null;

			for (ConstraintViolation<T> cv : set) {
				//这里循环获取错误信息，可以自定义格式
				property = cv.getPropertyPath().toString();
				if (errorMap.get(property) != null) {
					errorMap.get(property).append("," + cv.getMessage());
				} else {
					StringBuilder sb = new StringBuilder();
					sb.append(cv.getMessage());
					errorMap.put(property, sb);
				}
			}
		}
		return errorMap;
	}


	public static void main(String args[]) {
		Employee e = new Employee();
		e.setName("自提地址！！###！！啊啊啊啊啊 啊啊啊啊啊");
		Map<String, StringBuilder> result = ValidatorUtil.validate(e);
		System.out.println("-----------------------result="+result);

	}

}

package in.karkuvelrajmurugan.demo_project.validation;

import in.karkuvelrajmurugan.demo_project.exception.ValidationException;
import in.karkuvelrajmurugan.demo_project.model.User;
import in.karkuvelrajmurugan.demo_project.util.StringUtil;

public class UserValidator {
			public static void validate(User user) throws ValidationException {
				if (user == null) {
					throw new ValidationException("Invalid User Input");
				}
		        StringUtil.rejectIfInvalidString(user.getEmail(), "email");
		        StringUtil.rejectIfInvalidString(user.getPassword(), "password");
		        StringUtil.rejectIfInvalidString(user.getFirstName(), "FirstName");

				//StringUtil.rejectIfInvalidString(user.getPassword(),"Password");
				//StringUtil.rejectIfInvalidString(user.getFirstName(),"FirstName");
			}
		}
	
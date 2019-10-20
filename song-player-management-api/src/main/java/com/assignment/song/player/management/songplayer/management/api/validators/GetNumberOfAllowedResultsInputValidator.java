package com.assignment.song.player.management.songplayer.management.api.validators;

import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class GetNumberOfAllowedResultsInputValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return GetNumberOfAllowedResultsInput.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        GetNumberOfAllowedResultsInput input = (GetNumberOfAllowedResultsInput)object;
        if(input == null || StringUtils.isEmpty(input.getUserId())){
            errors.rejectValue("userId","userId.ampty");
        }
    }
}

package org.academiadecodigo.alphateamB.converter;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<S, T> implements Converter<S, T> {

    /**
     * Converts the source list of type S to target type T
     *
     * @param listToConvert the list to convert
     * @return the list of converted elements
     */
    public List<T> convert(List<S> listToConvert) {

        List<T> conversions = new ArrayList<>(listToConvert.size());

        for (S toConvert : listToConvert) {
            conversions.add(convert(toConvert));
        }

        return conversions;
    }

}
package com.agriculture.remote.services.client.function;

import javax.annotation.Generated;

/**
 * @author Yogesh Chandra
 * @generated
 */
@FunctionalInterface
@Generated("")
public interface UnsafeSupplier<T, E extends Throwable> {

	public T get() throws E;

}
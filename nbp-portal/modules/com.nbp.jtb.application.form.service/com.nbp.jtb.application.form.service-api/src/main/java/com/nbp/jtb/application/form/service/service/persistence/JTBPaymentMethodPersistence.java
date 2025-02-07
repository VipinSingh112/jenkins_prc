/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJTBPaymentMethodException;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb payment method service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBPaymentMethodUtil
 * @generated
 */
@ProviderType
public interface JTBPaymentMethodPersistence
	extends BasePersistence<JTBPaymentMethod> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JTBPaymentMethodUtil} to access the jtb payment method persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or throws a <code>NoSuchJTBPaymentMethodException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb payment method
	 * @throws NoSuchJTBPaymentMethodException if a matching jtb payment method could not be found
	 */
	public JTBPaymentMethod findBygetJTBById(long jtbApplicationId)
		throws NoSuchJTBPaymentMethodException;

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb payment method, or <code>null</code> if a matching jtb payment method could not be found
	 */
	public JTBPaymentMethod fetchBygetJTBById(long jtbApplicationId);

	/**
	 * Returns the jtb payment method where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb payment method, or <code>null</code> if a matching jtb payment method could not be found
	 */
	public JTBPaymentMethod fetchBygetJTBById(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the jtb payment method where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb payment method that was removed
	 */
	public JTBPaymentMethod removeBygetJTBById(long jtbApplicationId)
		throws NoSuchJTBPaymentMethodException;

	/**
	 * Returns the number of jtb payment methods where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb payment methods
	 */
	public int countBygetJTBById(long jtbApplicationId);

	/**
	 * Caches the jtb payment method in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentMethod the jtb payment method
	 */
	public void cacheResult(JTBPaymentMethod jtbPaymentMethod);

	/**
	 * Caches the jtb payment methods in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentMethods the jtb payment methods
	 */
	public void cacheResult(java.util.List<JTBPaymentMethod> jtbPaymentMethods);

	/**
	 * Creates a new jtb payment method with the primary key. Does not add the jtb payment method to the database.
	 *
	 * @param jTBPaymentMethodId the primary key for the new jtb payment method
	 * @return the new jtb payment method
	 */
	public JTBPaymentMethod create(long jTBPaymentMethodId);

	/**
	 * Removes the jtb payment method with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method that was removed
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	public JTBPaymentMethod remove(long jTBPaymentMethodId)
		throws NoSuchJTBPaymentMethodException;

	public JTBPaymentMethod updateImpl(JTBPaymentMethod jtbPaymentMethod);

	/**
	 * Returns the jtb payment method with the primary key or throws a <code>NoSuchJTBPaymentMethodException</code> if it could not be found.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method
	 * @throws NoSuchJTBPaymentMethodException if a jtb payment method with the primary key could not be found
	 */
	public JTBPaymentMethod findByPrimaryKey(long jTBPaymentMethodId)
		throws NoSuchJTBPaymentMethodException;

	/**
	 * Returns the jtb payment method with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jTBPaymentMethodId the primary key of the jtb payment method
	 * @return the jtb payment method, or <code>null</code> if a jtb payment method with the primary key could not be found
	 */
	public JTBPaymentMethod fetchByPrimaryKey(long jTBPaymentMethodId);

	/**
	 * Returns all the jtb payment methods.
	 *
	 * @return the jtb payment methods
	 */
	public java.util.List<JTBPaymentMethod> findAll();

	/**
	 * Returns a range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @return the range of jtb payment methods
	 */
	public java.util.List<JTBPaymentMethod> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb payment methods
	 */
	public java.util.List<JTBPaymentMethod> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBPaymentMethod>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb payment methods.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBPaymentMethodModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment methods
	 * @param end the upper bound of the range of jtb payment methods (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb payment methods
	 */
	public java.util.List<JTBPaymentMethod> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBPaymentMethod>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb payment methods from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb payment methods.
	 *
	 * @return the number of jtb payment methods
	 */
	public int countAll();

}
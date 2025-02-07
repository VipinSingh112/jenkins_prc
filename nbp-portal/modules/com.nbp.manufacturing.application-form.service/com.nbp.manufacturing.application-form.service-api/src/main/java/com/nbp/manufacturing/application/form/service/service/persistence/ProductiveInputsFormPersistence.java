/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchProductiveInputsFormException;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsForm;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the productive inputs form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormUtil
 * @generated
 */
@ProviderType
public interface ProductiveInputsFormPersistence
	extends BasePersistence<ProductiveInputsForm> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductiveInputsFormUtil} to access the productive inputs form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or throws a <code>NoSuchProductiveInputsFormException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	public ProductiveInputsForm findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductiveInputsFormException;

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public ProductiveInputsForm fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public ProductiveInputsForm fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the productive inputs form where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the productive inputs form that was removed
	 */
	public ProductiveInputsForm removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductiveInputsFormException;

	/**
	 * Returns the number of productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs forms
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @return the range of matching productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductiveInputsForm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductiveInputsForm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	public ProductiveInputsForm findBygetMA_PI_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsForm> orderByComparator)
		throws NoSuchProductiveInputsFormException;

	/**
	 * Returns the first productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public ProductiveInputsForm fetchBygetMA_PI_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ProductiveInputsForm>
			orderByComparator);

	/**
	 * Returns the last productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	public ProductiveInputsForm findBygetMA_PI_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsForm> orderByComparator)
		throws NoSuchProductiveInputsFormException;

	/**
	 * Returns the last productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public ProductiveInputsForm fetchBygetMA_PI_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ProductiveInputsForm>
			orderByComparator);

	/**
	 * Returns the productive inputs forms before and after the current productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productiveInputsFormId the primary key of the current productive inputs form
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	public ProductiveInputsForm[] findBygetMA_PI_MAI_PrevAndNext(
			long productiveInputsFormId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsForm> orderByComparator)
		throws NoSuchProductiveInputsFormException;

	/**
	 * Removes all the productive inputs forms where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_PI_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs forms
	 */
	public int countBygetMA_PI_MAI(long manufacturingApplicationId);

	/**
	 * Caches the productive inputs form in the entity cache if it is enabled.
	 *
	 * @param productiveInputsForm the productive inputs form
	 */
	public void cacheResult(ProductiveInputsForm productiveInputsForm);

	/**
	 * Caches the productive inputs forms in the entity cache if it is enabled.
	 *
	 * @param productiveInputsForms the productive inputs forms
	 */
	public void cacheResult(
		java.util.List<ProductiveInputsForm> productiveInputsForms);

	/**
	 * Creates a new productive inputs form with the primary key. Does not add the productive inputs form to the database.
	 *
	 * @param productiveInputsFormId the primary key for the new productive inputs form
	 * @return the new productive inputs form
	 */
	public ProductiveInputsForm create(long productiveInputsFormId);

	/**
	 * Removes the productive inputs form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form that was removed
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	public ProductiveInputsForm remove(long productiveInputsFormId)
		throws NoSuchProductiveInputsFormException;

	public ProductiveInputsForm updateImpl(
		ProductiveInputsForm productiveInputsForm);

	/**
	 * Returns the productive inputs form with the primary key or throws a <code>NoSuchProductiveInputsFormException</code> if it could not be found.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	public ProductiveInputsForm findByPrimaryKey(long productiveInputsFormId)
		throws NoSuchProductiveInputsFormException;

	/**
	 * Returns the productive inputs form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form, or <code>null</code> if a productive inputs form with the primary key could not be found
	 */
	public ProductiveInputsForm fetchByPrimaryKey(long productiveInputsFormId);

	/**
	 * Returns all the productive inputs forms.
	 *
	 * @return the productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findAll();

	/**
	 * Returns a range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @return the range of productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductiveInputsForm>
			orderByComparator);

	/**
	 * Returns an ordered range of all the productive inputs forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs forms
	 * @param end the upper bound of the range of productive inputs forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of productive inputs forms
	 */
	public java.util.List<ProductiveInputsForm> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductiveInputsForm>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the productive inputs forms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of productive inputs forms.
	 *
	 * @return the number of productive inputs forms
	 */
	public int countAll();

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ProductiveInputsForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the productive inputs form service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ProductiveInputsFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormPersistence
 * @generated
 */
public class ProductiveInputsFormUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ProductiveInputsForm productiveInputsForm) {
		getPersistence().clearCache(productiveInputsForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ProductiveInputsForm> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProductiveInputsForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProductiveInputsForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProductiveInputsForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProductiveInputsForm update(
		ProductiveInputsForm productiveInputsForm) {

		return getPersistence().update(productiveInputsForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProductiveInputsForm update(
		ProductiveInputsForm productiveInputsForm,
		ServiceContext serviceContext) {

		return getPersistence().update(productiveInputsForm, serviceContext);
	}

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or throws a <code>NoSuchProductiveInputsFormException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	public static ProductiveInputsForm findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public static ProductiveInputsForm fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the productive inputs form where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public static ProductiveInputsForm fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the productive inputs form where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the productive inputs form that was removed
	 */
	public static ProductiveInputsForm removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs forms
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs forms
	 */
	public static List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_PI_MAI(manufacturingApplicationId);
	}

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
	public static List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_PI_MAI(
			manufacturingApplicationId, start, end);
	}

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
	public static List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		return getPersistence().findBygetMA_PI_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

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
	public static List<ProductiveInputsForm> findBygetMA_PI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_PI_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	public static ProductiveInputsForm findBygetMA_PI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsForm> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormException {

		return getPersistence().findBygetMA_PI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public static ProductiveInputsForm fetchBygetMA_PI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		return getPersistence().fetchBygetMA_PI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a matching productive inputs form could not be found
	 */
	public static ProductiveInputsForm findBygetMA_PI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsForm> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormException {

		return getPersistence().findBygetMA_PI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form, or <code>null</code> if a matching productive inputs form could not be found
	 */
	public static ProductiveInputsForm fetchBygetMA_PI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		return getPersistence().fetchBygetMA_PI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the productive inputs forms before and after the current productive inputs form in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productiveInputsFormId the primary key of the current productive inputs form
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	public static ProductiveInputsForm[] findBygetMA_PI_MAI_PrevAndNext(
			long productiveInputsFormId, long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsForm> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormException {

		return getPersistence().findBygetMA_PI_MAI_PrevAndNext(
			productiveInputsFormId, manufacturingApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the productive inputs forms where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_PI_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_PI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of productive inputs forms where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs forms
	 */
	public static int countBygetMA_PI_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_PI_MAI(manufacturingApplicationId);
	}

	/**
	 * Caches the productive inputs form in the entity cache if it is enabled.
	 *
	 * @param productiveInputsForm the productive inputs form
	 */
	public static void cacheResult(ProductiveInputsForm productiveInputsForm) {
		getPersistence().cacheResult(productiveInputsForm);
	}

	/**
	 * Caches the productive inputs forms in the entity cache if it is enabled.
	 *
	 * @param productiveInputsForms the productive inputs forms
	 */
	public static void cacheResult(
		List<ProductiveInputsForm> productiveInputsForms) {

		getPersistence().cacheResult(productiveInputsForms);
	}

	/**
	 * Creates a new productive inputs form with the primary key. Does not add the productive inputs form to the database.
	 *
	 * @param productiveInputsFormId the primary key for the new productive inputs form
	 * @return the new productive inputs form
	 */
	public static ProductiveInputsForm create(long productiveInputsFormId) {
		return getPersistence().create(productiveInputsFormId);
	}

	/**
	 * Removes the productive inputs form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form that was removed
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	public static ProductiveInputsForm remove(long productiveInputsFormId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormException {

		return getPersistence().remove(productiveInputsFormId);
	}

	public static ProductiveInputsForm updateImpl(
		ProductiveInputsForm productiveInputsForm) {

		return getPersistence().updateImpl(productiveInputsForm);
	}

	/**
	 * Returns the productive inputs form with the primary key or throws a <code>NoSuchProductiveInputsFormException</code> if it could not be found.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form
	 * @throws NoSuchProductiveInputsFormException if a productive inputs form with the primary key could not be found
	 */
	public static ProductiveInputsForm findByPrimaryKey(
			long productiveInputsFormId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormException {

		return getPersistence().findByPrimaryKey(productiveInputsFormId);
	}

	/**
	 * Returns the productive inputs form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productiveInputsFormId the primary key of the productive inputs form
	 * @return the productive inputs form, or <code>null</code> if a productive inputs form with the primary key could not be found
	 */
	public static ProductiveInputsForm fetchByPrimaryKey(
		long productiveInputsFormId) {

		return getPersistence().fetchByPrimaryKey(productiveInputsFormId);
	}

	/**
	 * Returns all the productive inputs forms.
	 *
	 * @return the productive inputs forms
	 */
	public static List<ProductiveInputsForm> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ProductiveInputsForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ProductiveInputsForm> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ProductiveInputsForm> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the productive inputs forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of productive inputs forms.
	 *
	 * @return the number of productive inputs forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductiveInputsFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ProductiveInputsFormPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ProductiveInputsFormPersistence _persistence;

}
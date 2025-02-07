/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the productive inputs form add service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ProductiveInputsFormAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAddPersistence
 * @generated
 */
public class ProductiveInputsFormAddUtil {

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
	public static void clearCache(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		getPersistence().clearCache(productiveInputsFormAdd);
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
	public static Map<Serializable, ProductiveInputsFormAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProductiveInputsFormAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProductiveInputsFormAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProductiveInputsFormAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProductiveInputsFormAdd update(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		return getPersistence().update(productiveInputsFormAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProductiveInputsFormAdd update(
		ProductiveInputsFormAdd productiveInputsFormAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(productiveInputsFormAdd, serviceContext);
	}

	/**
	 * Returns all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_PIF(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_PIF(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().findBygetMA_PIF(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_PIF(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd findBygetMA_PIF_First(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().findBygetMA_PIF_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd fetchBygetMA_PIF_First(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_PIF_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd findBygetMA_PIF_Last(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().findBygetMA_PIF_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd fetchBygetMA_PIF_Last(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_PIF_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the productive inputs form adds before and after the current productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productiveInputsFormAddId the primary key of the current productive inputs form add
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public static ProductiveInputsFormAdd[] findBygetMA_PIF_PrevAndNext(
			long productiveInputsFormAddId, long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().findBygetMA_PIF_PrevAndNext(
			productiveInputsFormAddId, manufacturingApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the productive inputs form adds where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_PIF(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_PIF(manufacturingApplicationId);
	}

	/**
	 * Returns the number of productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs form adds
	 */
	public static int countBygetMA_PIF(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_PIF(manufacturingApplicationId);
	}

	/**
	 * Returns all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @return the matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId) {

		return getPersistence().findBygetMA_PII(productiveInputsFormId);
	}

	/**
	 * Returns a range of all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end) {

		return getPersistence().findBygetMA_PII(
			productiveInputsFormId, start, end);
	}

	/**
	 * Returns an ordered range of all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().findBygetMA_PII(
			productiveInputsFormId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_PII(
			productiveInputsFormId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd findBygetMA_PII_First(
			long productiveInputsFormId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().findBygetMA_PII_First(
			productiveInputsFormId, orderByComparator);
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd fetchBygetMA_PII_First(
		long productiveInputsFormId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_PII_First(
			productiveInputsFormId, orderByComparator);
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd findBygetMA_PII_Last(
			long productiveInputsFormId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().findBygetMA_PII_Last(
			productiveInputsFormId, orderByComparator);
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public static ProductiveInputsFormAdd fetchBygetMA_PII_Last(
		long productiveInputsFormId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().fetchBygetMA_PII_Last(
			productiveInputsFormId, orderByComparator);
	}

	/**
	 * Returns the productive inputs form adds before and after the current productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormAddId the primary key of the current productive inputs form add
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public static ProductiveInputsFormAdd[] findBygetMA_PII_PrevAndNext(
			long productiveInputsFormAddId, long productiveInputsFormId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().findBygetMA_PII_PrevAndNext(
			productiveInputsFormAddId, productiveInputsFormId,
			orderByComparator);
	}

	/**
	 * Removes all the productive inputs form adds where productiveInputsFormId = &#63; from the database.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 */
	public static void removeBygetMA_PII(long productiveInputsFormId) {
		getPersistence().removeBygetMA_PII(productiveInputsFormId);
	}

	/**
	 * Returns the number of productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @return the number of matching productive inputs form adds
	 */
	public static int countBygetMA_PII(long productiveInputsFormId) {
		return getPersistence().countBygetMA_PII(productiveInputsFormId);
	}

	/**
	 * Caches the productive inputs form add in the entity cache if it is enabled.
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 */
	public static void cacheResult(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		getPersistence().cacheResult(productiveInputsFormAdd);
	}

	/**
	 * Caches the productive inputs form adds in the entity cache if it is enabled.
	 *
	 * @param productiveInputsFormAdds the productive inputs form adds
	 */
	public static void cacheResult(
		List<ProductiveInputsFormAdd> productiveInputsFormAdds) {

		getPersistence().cacheResult(productiveInputsFormAdds);
	}

	/**
	 * Creates a new productive inputs form add with the primary key. Does not add the productive inputs form add to the database.
	 *
	 * @param productiveInputsFormAddId the primary key for the new productive inputs form add
	 * @return the new productive inputs form add
	 */
	public static ProductiveInputsFormAdd create(
		long productiveInputsFormAddId) {

		return getPersistence().create(productiveInputsFormAddId);
	}

	/**
	 * Removes the productive inputs form add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add that was removed
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public static ProductiveInputsFormAdd remove(long productiveInputsFormAddId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().remove(productiveInputsFormAddId);
	}

	public static ProductiveInputsFormAdd updateImpl(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		return getPersistence().updateImpl(productiveInputsFormAdd);
	}

	/**
	 * Returns the productive inputs form add with the primary key or throws a <code>NoSuchProductiveInputsFormAddException</code> if it could not be found.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public static ProductiveInputsFormAdd findByPrimaryKey(
			long productiveInputsFormAddId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchProductiveInputsFormAddException {

		return getPersistence().findByPrimaryKey(productiveInputsFormAddId);
	}

	/**
	 * Returns the productive inputs form add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add, or <code>null</code> if a productive inputs form add with the primary key could not be found
	 */
	public static ProductiveInputsFormAdd fetchByPrimaryKey(
		long productiveInputsFormAddId) {

		return getPersistence().fetchByPrimaryKey(productiveInputsFormAddId);
	}

	/**
	 * Returns all the productive inputs form adds.
	 *
	 * @return the productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of productive inputs form adds
	 */
	public static List<ProductiveInputsFormAdd> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the productive inputs form adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of productive inputs form adds.
	 *
	 * @return the number of productive inputs form adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductiveInputsFormAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ProductiveInputsFormAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ProductiveInputsFormAddPersistence _persistence;

}
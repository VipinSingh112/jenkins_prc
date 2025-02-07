/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.SubjectData;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the subject data service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.SubjectDataPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubjectDataPersistence
 * @generated
 */
public class SubjectDataUtil {

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
	public static void clearCache(SubjectData subjectData) {
		getPersistence().clearCache(subjectData);
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
	public static Map<Serializable, SubjectData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SubjectData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SubjectData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SubjectData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SubjectData> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SubjectData update(SubjectData subjectData) {
		return getPersistence().update(subjectData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SubjectData update(
		SubjectData subjectData, ServiceContext serviceContext) {

		return getPersistence().update(subjectData, serviceContext);
	}

	/**
	 * Returns the subject data where osiInsolvencyId = &#63; or throws a <code>NoSuchSubjectDataException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching subject data
	 * @throws NoSuchSubjectDataException if a matching subject data could not be found
	 */
	public static SubjectData findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSubjectDataException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the subject data where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching subject data, or <code>null</code> if a matching subject data could not be found
	 */
	public static SubjectData fetchBygetOsiById(long osiInsolvencyId) {
		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the subject data where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching subject data, or <code>null</code> if a matching subject data could not be found
	 */
	public static SubjectData fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the subject data where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the subject data that was removed
	 */
	public static SubjectData removeBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSubjectDataException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of subject datas where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching subject datas
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the subject data in the entity cache if it is enabled.
	 *
	 * @param subjectData the subject data
	 */
	public static void cacheResult(SubjectData subjectData) {
		getPersistence().cacheResult(subjectData);
	}

	/**
	 * Caches the subject datas in the entity cache if it is enabled.
	 *
	 * @param subjectDatas the subject datas
	 */
	public static void cacheResult(List<SubjectData> subjectDatas) {
		getPersistence().cacheResult(subjectDatas);
	}

	/**
	 * Creates a new subject data with the primary key. Does not add the subject data to the database.
	 *
	 * @param subjectDataId the primary key for the new subject data
	 * @return the new subject data
	 */
	public static SubjectData create(long subjectDataId) {
		return getPersistence().create(subjectDataId);
	}

	/**
	 * Removes the subject data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data that was removed
	 * @throws NoSuchSubjectDataException if a subject data with the primary key could not be found
	 */
	public static SubjectData remove(long subjectDataId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSubjectDataException {

		return getPersistence().remove(subjectDataId);
	}

	public static SubjectData updateImpl(SubjectData subjectData) {
		return getPersistence().updateImpl(subjectData);
	}

	/**
	 * Returns the subject data with the primary key or throws a <code>NoSuchSubjectDataException</code> if it could not be found.
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data
	 * @throws NoSuchSubjectDataException if a subject data with the primary key could not be found
	 */
	public static SubjectData findByPrimaryKey(long subjectDataId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchSubjectDataException {

		return getPersistence().findByPrimaryKey(subjectDataId);
	}

	/**
	 * Returns the subject data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param subjectDataId the primary key of the subject data
	 * @return the subject data, or <code>null</code> if a subject data with the primary key could not be found
	 */
	public static SubjectData fetchByPrimaryKey(long subjectDataId) {
		return getPersistence().fetchByPrimaryKey(subjectDataId);
	}

	/**
	 * Returns all the subject datas.
	 *
	 * @return the subject datas
	 */
	public static List<SubjectData> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the subject datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject datas
	 * @param end the upper bound of the range of subject datas (not inclusive)
	 * @return the range of subject datas
	 */
	public static List<SubjectData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the subject datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject datas
	 * @param end the upper bound of the range of subject datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subject datas
	 */
	public static List<SubjectData> findAll(
		int start, int end, OrderByComparator<SubjectData> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the subject datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject datas
	 * @param end the upper bound of the range of subject datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of subject datas
	 */
	public static List<SubjectData> findAll(
		int start, int end, OrderByComparator<SubjectData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the subject datas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of subject datas.
	 *
	 * @return the number of subject datas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SubjectDataPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(SubjectDataPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile SubjectDataPersistence _persistence;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.EducationalQualification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the educational qualification service. This utility wraps <code>com.nbp.osi.application.form.services.service.persistence.impl.EducationalQualificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualificationPersistence
 * @generated
 */
public class EducationalQualificationUtil {

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
		EducationalQualification educationalQualification) {

		getPersistence().clearCache(educationalQualification);
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
	public static Map<Serializable, EducationalQualification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EducationalQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EducationalQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EducationalQualification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EducationalQualification update(
		EducationalQualification educationalQualification) {

		return getPersistence().update(educationalQualification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EducationalQualification update(
		EducationalQualification educationalQualification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			educationalQualification, serviceContext);
	}

	/**
	 * Returns all the educational qualifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the educational qualifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public static EducationalQualification findByUuid_First(
			String uuid,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchByUuid_First(
		String uuid,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public static EducationalQualification findByUuid_Last(
			String uuid,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchByUuid_Last(
		String uuid,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where uuid = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification[] findByUuid_PrevAndNext(
			long educationalDetailId, String uuid,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByUuid_PrevAndNext(
			educationalDetailId, uuid, orderByComparator);
	}

	/**
	 * Removes all the educational qualifications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of educational qualifications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching educational qualifications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEducationalQualificationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public static EducationalQualification findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the educational qualification where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the educational qualification where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the educational qualification that was removed
	 */
	public static EducationalQualification removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of educational qualifications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching educational qualifications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching educational qualifications
	 */
	public static List<EducationalQualification> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public static EducationalQualification findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public static EducationalQualification findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification[] findByUuid_C_PrevAndNext(
			long educationalDetailId, String uuid, long companyId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			educationalDetailId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the educational qualifications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of educational qualifications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching educational qualifications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching educational qualifications
	 */
	public static List<EducationalQualification> findBygetOsiById(
		long osiApplicationId) {

		return getPersistence().findBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns a range of all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of matching educational qualifications
	 */
	public static List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end) {

		return getPersistence().findBygetOsiById(osiApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching educational qualifications
	 */
	public static List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the educational qualifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching educational qualifications
	 */
	public static List<EducationalQualification> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public static EducationalQualification findBygetOsiById_First(
			long osiApplicationId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findBygetOsiById_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the first educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchBygetOsiById_First(
		long osiApplicationId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification
	 * @throws NoSuchEducationalQualificationException if a matching educational qualification could not be found
	 */
	public static EducationalQualification findBygetOsiById_Last(
			long osiApplicationId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findBygetOsiById_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification fetchBygetOsiById_Last(
		long osiApplicationId,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the educational qualifications before and after the current educational qualification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param educationalDetailId the primary key of the current educational qualification
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification[] findBygetOsiById_PrevAndNext(
			long educationalDetailId, long osiApplicationId,
			OrderByComparator<EducationalQualification> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			educationalDetailId, osiApplicationId, orderByComparator);
	}

	/**
	 * Removes all the educational qualifications where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public static void removeBygetOsiById(long osiApplicationId) {
		getPersistence().removeBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the number of educational qualifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching educational qualifications
	 */
	public static int countBygetOsiById(long osiApplicationId) {
		return getPersistence().countBygetOsiById(osiApplicationId);
	}

	/**
	 * Caches the educational qualification in the entity cache if it is enabled.
	 *
	 * @param educationalQualification the educational qualification
	 */
	public static void cacheResult(
		EducationalQualification educationalQualification) {

		getPersistence().cacheResult(educationalQualification);
	}

	/**
	 * Caches the educational qualifications in the entity cache if it is enabled.
	 *
	 * @param educationalQualifications the educational qualifications
	 */
	public static void cacheResult(
		List<EducationalQualification> educationalQualifications) {

		getPersistence().cacheResult(educationalQualifications);
	}

	/**
	 * Creates a new educational qualification with the primary key. Does not add the educational qualification to the database.
	 *
	 * @param educationalDetailId the primary key for the new educational qualification
	 * @return the new educational qualification
	 */
	public static EducationalQualification create(long educationalDetailId) {
		return getPersistence().create(educationalDetailId);
	}

	/**
	 * Removes the educational qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification that was removed
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification remove(long educationalDetailId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().remove(educationalDetailId);
	}

	public static EducationalQualification updateImpl(
		EducationalQualification educationalQualification) {

		return getPersistence().updateImpl(educationalQualification);
	}

	/**
	 * Returns the educational qualification with the primary key or throws a <code>NoSuchEducationalQualificationException</code> if it could not be found.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification
	 * @throws NoSuchEducationalQualificationException if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification findByPrimaryKey(
			long educationalDetailId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchEducationalQualificationException {

		return getPersistence().findByPrimaryKey(educationalDetailId);
	}

	/**
	 * Returns the educational qualification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification, or <code>null</code> if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification fetchByPrimaryKey(
		long educationalDetailId) {

		return getPersistence().fetchByPrimaryKey(educationalDetailId);
	}

	/**
	 * Returns all the educational qualifications.
	 *
	 * @return the educational qualifications
	 */
	public static List<EducationalQualification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of educational qualifications
	 */
	public static List<EducationalQualification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of educational qualifications
	 */
	public static List<EducationalQualification> findAll(
		int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of educational qualifications
	 */
	public static List<EducationalQualification> findAll(
		int start, int end,
		OrderByComparator<EducationalQualification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the educational qualifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of educational qualifications.
	 *
	 * @return the number of educational qualifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EducationalQualificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		EducationalQualificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile EducationalQualificationPersistence _persistence;

}
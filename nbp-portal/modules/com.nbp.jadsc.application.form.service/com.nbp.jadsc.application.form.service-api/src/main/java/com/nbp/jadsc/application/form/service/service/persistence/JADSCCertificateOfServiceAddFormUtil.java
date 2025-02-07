/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc certificate of service add form service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCCertificateOfServiceAddFormPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServiceAddFormPersistence
 * @generated
 */
public class JADSCCertificateOfServiceAddFormUtil {

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
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		getPersistence().clearCache(jadscCertificateOfServiceAddForm);
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
	public static Map<Serializable, JADSCCertificateOfServiceAddForm>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCCertificateOfServiceAddForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCCertificateOfServiceAddForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCCertificateOfServiceAddForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCCertificateOfServiceAddForm update(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		return getPersistence().update(jadscCertificateOfServiceAddForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCCertificateOfServiceAddForm update(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jadscCertificateOfServiceAddForm, serviceContext);
	}

	/**
	 * Returns all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findByUuid_First(
			String uuid,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm[] findByUuid_PrevAndNext(
			long jadscCOSId, String uuid,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscCOSId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc certificate of service add forms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceAddFormException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc certificate of service add form where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of service add form that was removed
	 */
	public static JADSCCertificateOfServiceAddForm removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm[] findByUuid_C_PrevAndNext(
			long jadscCOSId, String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscCOSId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc certificate of service add forms where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end) {

		return getPersistence().findBygetJADSCById(
			jadscApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().findBygetJADSCById(
			jadscApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJADSCById(
			jadscApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findBygetJADSCById_First(
			long jadscApplicationId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findBygetJADSCById_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the first jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchBygetJADSCById_First(
		long jadscApplicationId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().fetchBygetJADSCById_First(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findBygetJADSCById_Last(
			long jadscApplicationId,
			OrderByComparator<JADSCCertificateOfServiceAddForm>
				orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findBygetJADSCById_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service add form, or <code>null</code> if a matching jadsc certificate of service add form could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchBygetJADSCById_Last(
		long jadscApplicationId,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().fetchBygetJADSCById_Last(
			jadscApplicationId, orderByComparator);
	}

	/**
	 * Returns the jadsc certificate of service add forms before and after the current jadsc certificate of service add form in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service add form
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm[]
			findBygetJADSCById_PrevAndNext(
				long jadscCOSId, long jadscApplicationId,
				OrderByComparator<JADSCCertificateOfServiceAddForm>
					orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findBygetJADSCById_PrevAndNext(
			jadscCOSId, jadscApplicationId, orderByComparator);
	}

	/**
	 * Removes all the jadsc certificate of service add forms where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public static void removeBygetJADSCById(long jadscApplicationId) {
		getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc certificate of service add forms where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of service add forms
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Caches the jadsc certificate of service add form in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServiceAddForm the jadsc certificate of service add form
	 */
	public static void cacheResult(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		getPersistence().cacheResult(jadscCertificateOfServiceAddForm);
	}

	/**
	 * Caches the jadsc certificate of service add forms in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServiceAddForms the jadsc certificate of service add forms
	 */
	public static void cacheResult(
		List<JADSCCertificateOfServiceAddForm>
			jadscCertificateOfServiceAddForms) {

		getPersistence().cacheResult(jadscCertificateOfServiceAddForms);
	}

	/**
	 * Creates a new jadsc certificate of service add form with the primary key. Does not add the jadsc certificate of service add form to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service add form
	 * @return the new jadsc certificate of service add form
	 */
	public static JADSCCertificateOfServiceAddForm create(long jadscCOSId) {
		return getPersistence().create(jadscCOSId);
	}

	/**
	 * Removes the jadsc certificate of service add form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form that was removed
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm remove(long jadscCOSId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().remove(jadscCOSId);
	}

	public static JADSCCertificateOfServiceAddForm updateImpl(
		JADSCCertificateOfServiceAddForm jadscCertificateOfServiceAddForm) {

		return getPersistence().updateImpl(jadscCertificateOfServiceAddForm);
	}

	/**
	 * Returns the jadsc certificate of service add form with the primary key or throws a <code>NoSuchJADSCCertificateOfServiceAddFormException</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form
	 * @throws NoSuchJADSCCertificateOfServiceAddFormException if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm findByPrimaryKey(
			long jadscCOSId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceAddFormException {

		return getPersistence().findByPrimaryKey(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service add form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service add form
	 * @return the jadsc certificate of service add form, or <code>null</code> if a jadsc certificate of service add form with the primary key could not be found
	 */
	public static JADSCCertificateOfServiceAddForm fetchByPrimaryKey(
		long jadscCOSId) {

		return getPersistence().fetchByPrimaryKey(jadscCOSId);
	}

	/**
	 * Returns all the jadsc certificate of service add forms.
	 *
	 * @return the jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @return the range of jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of service add forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceAddFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of service add forms
	 * @param end the upper bound of the range of jadsc certificate of service add forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of service add forms
	 */
	public static List<JADSCCertificateOfServiceAddForm> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfServiceAddForm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc certificate of service add forms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc certificate of service add forms.
	 *
	 * @return the number of jadsc certificate of service add forms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCCertificateOfServiceAddFormPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JADSCCertificateOfServiceAddFormPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JADSCCertificateOfServiceAddFormPersistence
		_persistence;

}
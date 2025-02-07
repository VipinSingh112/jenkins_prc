/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchAddApplicantPractitionerException;
import com.nbp.hsra.application.service.model.AddApplicantPractitioner;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add applicant practitioner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddApplicantPractitionerUtil
 * @generated
 */
@ProviderType
public interface AddApplicantPractitionerPersistence
	extends BasePersistence<AddApplicantPractitioner> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddApplicantPractitionerUtil} to access the add applicant practitioner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add applicant practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid(String uuid);

	/**
	 * Returns a range of all the add applicant practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns the add applicant practitioners before and after the current add applicant practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param addApplicantPractitionerId the primary key of the current add applicant practitioner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public AddApplicantPractitioner[] findByUuid_PrevAndNext(
			long addApplicantPractitionerId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Removes all the add applicant practitioners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of add applicant practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching add applicant practitioners
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the add applicant practitioner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAddApplicantPractitionerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner findByUUID_G(String uuid, long groupId)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the add applicant practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the add applicant practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the add applicant practitioner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the add applicant practitioner that was removed
	 */
	public AddApplicantPractitioner removeByUUID_G(String uuid, long groupId)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the number of add applicant practitioners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching add applicant practitioners
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns an ordered range of all the add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the first add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the last add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns the add applicant practitioners before and after the current add applicant practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param addApplicantPractitionerId the primary key of the current add applicant practitioner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public AddApplicantPractitioner[] findByUuid_C_PrevAndNext(
			long addApplicantPractitionerId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Removes all the add applicant practitioners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of add applicant practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching add applicant practitioners
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns an ordered range of all the add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the first add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns the last add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the last add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public AddApplicantPractitioner fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns the add applicant practitioners before and after the current add applicant practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param addApplicantPractitionerId the primary key of the current add applicant practitioner
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public AddApplicantPractitioner[] findBygetHsraById_PrevAndNext(
			long addApplicantPractitionerId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddApplicantPractitioner> orderByComparator)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Removes all the add applicant practitioners where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of add applicant practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching add applicant practitioners
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the add applicant practitioner in the entity cache if it is enabled.
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 */
	public void cacheResult(AddApplicantPractitioner addApplicantPractitioner);

	/**
	 * Caches the add applicant practitioners in the entity cache if it is enabled.
	 *
	 * @param addApplicantPractitioners the add applicant practitioners
	 */
	public void cacheResult(
		java.util.List<AddApplicantPractitioner> addApplicantPractitioners);

	/**
	 * Creates a new add applicant practitioner with the primary key. Does not add the add applicant practitioner to the database.
	 *
	 * @param addApplicantPractitionerId the primary key for the new add applicant practitioner
	 * @return the new add applicant practitioner
	 */
	public AddApplicantPractitioner create(long addApplicantPractitionerId);

	/**
	 * Removes the add applicant practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner that was removed
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public AddApplicantPractitioner remove(long addApplicantPractitionerId)
		throws NoSuchAddApplicantPractitionerException;

	public AddApplicantPractitioner updateImpl(
		AddApplicantPractitioner addApplicantPractitioner);

	/**
	 * Returns the add applicant practitioner with the primary key or throws a <code>NoSuchAddApplicantPractitionerException</code> if it could not be found.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner
	 * @throws NoSuchAddApplicantPractitionerException if a add applicant practitioner with the primary key could not be found
	 */
	public AddApplicantPractitioner findByPrimaryKey(
			long addApplicantPractitionerId)
		throws NoSuchAddApplicantPractitionerException;

	/**
	 * Returns the add applicant practitioner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner, or <code>null</code> if a add applicant practitioner with the primary key could not be found
	 */
	public AddApplicantPractitioner fetchByPrimaryKey(
		long addApplicantPractitionerId);

	/**
	 * Returns all the add applicant practitioners.
	 *
	 * @return the add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findAll();

	/**
	 * Returns a range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator);

	/**
	 * Returns an ordered range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add applicant practitioners
	 */
	public java.util.List<AddApplicantPractitioner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AddApplicantPractitioner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add applicant practitioners from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add applicant practitioners.
	 *
	 * @return the number of add applicant practitioners
	 */
	public int countAll();

}
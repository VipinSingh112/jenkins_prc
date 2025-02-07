/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchAddMedicalPractitionerException;
import com.nbp.hsra.application.service.model.AddMedicalPractitioner;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the add medical practitioner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddMedicalPractitionerUtil
 * @generated
 */
@ProviderType
public interface AddMedicalPractitionerPersistence
	extends BasePersistence<AddMedicalPractitioner> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddMedicalPractitionerUtil} to access the add medical practitioner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the add medical practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid(String uuid);

	/**
	 * Returns a range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where uuid = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public AddMedicalPractitioner[] findByUuid_PrevAndNext(
			long addMedicalPractitionerId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Removes all the add medical practitioners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of add medical practitioners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching add medical practitioners
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAddMedicalPractitionerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner findByUUID_G(String uuid, long groupId)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the add medical practitioner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the add medical practitioner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the add medical practitioner that was removed
	 */
	public AddMedicalPractitioner removeByUUID_G(String uuid, long groupId)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the number of add medical practitioners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching add medical practitioners
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the first add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the last add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public AddMedicalPractitioner[] findByUuid_C_PrevAndNext(
			long addMedicalPractitionerId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Removes all the add medical practitioners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of add medical practitioners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching add medical practitioners
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId);

	/**
	 * Returns a range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner findBygetHsraById_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the first add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchBygetHsraById_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns the last add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner findBygetHsraById_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the last add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public AddMedicalPractitioner fetchBygetHsraById_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns the add medical practitioners before and after the current add medical practitioner in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param addMedicalPractitionerId the primary key of the current add medical practitioner
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public AddMedicalPractitioner[] findBygetHsraById_PrevAndNext(
			long addMedicalPractitionerId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AddMedicalPractitioner> orderByComparator)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Removes all the add medical practitioners where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the number of add medical practitioners where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching add medical practitioners
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the add medical practitioner in the entity cache if it is enabled.
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 */
	public void cacheResult(AddMedicalPractitioner addMedicalPractitioner);

	/**
	 * Caches the add medical practitioners in the entity cache if it is enabled.
	 *
	 * @param addMedicalPractitioners the add medical practitioners
	 */
	public void cacheResult(
		java.util.List<AddMedicalPractitioner> addMedicalPractitioners);

	/**
	 * Creates a new add medical practitioner with the primary key. Does not add the add medical practitioner to the database.
	 *
	 * @param addMedicalPractitionerId the primary key for the new add medical practitioner
	 * @return the new add medical practitioner
	 */
	public AddMedicalPractitioner create(long addMedicalPractitionerId);

	/**
	 * Removes the add medical practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner that was removed
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public AddMedicalPractitioner remove(long addMedicalPractitionerId)
		throws NoSuchAddMedicalPractitionerException;

	public AddMedicalPractitioner updateImpl(
		AddMedicalPractitioner addMedicalPractitioner);

	/**
	 * Returns the add medical practitioner with the primary key or throws a <code>NoSuchAddMedicalPractitionerException</code> if it could not be found.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner
	 * @throws NoSuchAddMedicalPractitionerException if a add medical practitioner with the primary key could not be found
	 */
	public AddMedicalPractitioner findByPrimaryKey(
			long addMedicalPractitionerId)
		throws NoSuchAddMedicalPractitionerException;

	/**
	 * Returns the add medical practitioner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner, or <code>null</code> if a add medical practitioner with the primary key could not be found
	 */
	public AddMedicalPractitioner fetchByPrimaryKey(
		long addMedicalPractitionerId);

	/**
	 * Returns all the add medical practitioners.
	 *
	 * @return the add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findAll();

	/**
	 * Returns a range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator);

	/**
	 * Returns an ordered range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add medical practitioners
	 */
	public java.util.List<AddMedicalPractitioner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddMedicalPractitioner>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the add medical practitioners from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of add medical practitioners.
	 *
	 * @return the number of add medical practitioners
	 */
	public int countAll();

}